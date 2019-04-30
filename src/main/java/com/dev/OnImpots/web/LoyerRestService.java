package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.dev.OnImpots.dao.LoyerRepository;

import com.dev.OnImpots.entities.Loyer;

@RestController 
@CrossOrigin
public class LoyerRestService implements LoyerRepository {
	
	private LoyerRepository loyerRepository;
	@RequestMapping (value="/loyers",method=RequestMethod.GET)
	public List<Loyer> getLoyers() {
		return (List<Loyer>) loyerRepository.findAll();
		
	}
	/*
	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.GET)
	public Optional<Loyer> getLoyers(@PathVariable Long NumLoyer) {
		return loyerRepository.findById(NumLoyer);
		
	}*/
	/*@RequestMapping (value="/chercherloyers",method=RequestMethod.GET)
	public Page<Loyer> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return loyerRepository.chercher("%"+mc+"%", Pageable(page,size));
	}
	private Pageable Pageable(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long NumLoyer) {
		loyerRepository.deleteById(NumLoyer);
		return true;
	}

	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.PUT)
	public Loyer save(@PathVariable Long NumLoyer,@RequestBody Loyer c) {
		c.setNumLoyer(NumLoyer);
		return loyerRepository.save(c);
	}
	@RequestMapping (value="/loyers",method=RequestMethod.POST)
	@Override
	public <S extends Loyer> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Loyer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Loyer> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Loyer> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Loyer> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Loyer> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteInBatch(Iterable<Loyer> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Loyer getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Loyer> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Loyer> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<Loyer> findAll(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Loyer> findById(Long id) {
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
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Loyer entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends Loyer> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Loyer> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Loyer> Page<S> findAll(Example<S> example, org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Loyer> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Loyer> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*@Override
	public Page<Loyer> chercher(String string, org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
