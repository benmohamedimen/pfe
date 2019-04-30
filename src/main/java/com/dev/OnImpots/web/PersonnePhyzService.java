package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
import com.dev.OnImpots.dao.PersonnePhyzRepository;
import com.dev.OnImpots.entities.Contribuable;
import com.dev.OnImpots.entities.PersonneMorl;
import com.dev.OnImpots.entities.PersonnePhyz;

@RestController 
@CrossOrigin
public abstract class PersonnePhyzService  implements PersonnePhyzRepository {
 

	private PersonnePhyzRepository personnePhyzRepository;
@RequestMapping (value="/personnePhyzs",method=RequestMethod.GET)
@Override
public List<PersonnePhyz> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonnePhyz> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonnePhyz> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonnePhyz> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}
@RequestMapping (value="/personnePhyzs/{Cin}",method=RequestMethod.PUT)
@Override
public <S extends PersonnePhyz> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<PersonnePhyz> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}
@RequestMapping (value="/personnePhyzs/{Cin}",method=RequestMethod.GET)
@Override
public PersonnePhyz getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonnePhyz> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonnePhyz> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<PersonnePhyz> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}
@RequestMapping (value="/personnePhyzs",method=RequestMethod.POST)
@Override
public <S extends PersonnePhyz> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<PersonnePhyz> findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(Long id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}
@RequestMapping (value="/personnePhyzs/{Cin}",method=RequestMethod.DELETE)
@Override
public void deleteById(Long id) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(PersonnePhyz entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends PersonnePhyz> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends PersonnePhyz> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonnePhyz> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonnePhyz> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends PersonnePhyz> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
/*
@Override
public PersonnePhyz findUserWithName(String Cin) {
	// TODO Auto-generated method stub
	return null;
}
*/
	

}
