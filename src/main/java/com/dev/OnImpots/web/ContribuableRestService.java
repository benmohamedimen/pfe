package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.OnImpots.dao.ContribuableRepository;

import com.dev.OnImpots.entities.Contribuable;
import com.dev.OnImpots.entities.MyUserPrincipal;



@RestController 
@CrossOrigin
public class ContribuableRestService implements UserDetailsService  {
@Autowired 
private ContribuableRepository contribuableRepository;
@RequestMapping (value="/contribuables",method=RequestMethod.GET)
public List<Contribuable> getContribuables() {
	return contribuableRepository.findAll();
	
}
@RequestMapping (value="/contribuables/{NIF}",method=RequestMethod.GET)
public Optional<Contribuable> getContribuables(@PathVariable Long NIF) {
	return contribuableRepository.findById(NIF);
	
}
@RequestMapping (value="/cherchercontribuables",method=RequestMethod.GET)
public Page<Contribuable> chercher(
		@RequestParam(name="mc",defaultValue="") String mc,
		@RequestParam(name="page",defaultValue="0") int page,
		@RequestParam(name="size",defaultValue="5") int size){
	return contribuableRepository.chercher("%"+mc+"%", Pageable(page,size));
}
private Pageable Pageable(int page, int size) {
	// TODO Auto-generated method stub
	return null;
}
@RequestMapping (value="/contribuables",method=RequestMethod.POST)
public Contribuable save(@RequestBody Contribuable c) {
	return contribuableRepository.save(c);
}
@RequestMapping (value="/contribuables/{NIF}",method=RequestMethod.DELETE)
public boolean supprimer(@PathVariable Long NIF) {
	contribuableRepository.deleteById(NIF);
	return true;
}

@RequestMapping (value="/contribuables/{NIF}",method=RequestMethod.PUT)
public Contribuable save(@PathVariable Long NIF,@RequestBody Contribuable c) {
	c.setNIF(NIF);
	return contribuableRepository.save(c);
}
@Override
public UserDetails loadUserByUsername(String login) {
	Contribuable contribuable = contribuableRepository.findUserWithName(login);
    if (contribuable == null) {
        throw new UsernameNotFoundException(login);
    }
    return contribuable;
}

}