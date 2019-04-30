package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.OnImpots.dao.ImpotsSocieteRepository;

import com.dev.OnImpots.entities.ImpotsSociete;
@RestController 
@CrossOrigin

public abstract class ImpotsSocieteService implements ImpotsSocieteRepository {
	

 
 private ImpotsSocieteRepository impotsSocieteRepository;
	@RequestMapping (value="/impotsSocietes",method=RequestMethod.POST)
	public ImpotsSociete save1(@RequestBody ImpotsSociete c) {
		return this.save(c);
	}
	@Override
	public <S extends ImpotsSociete> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	@RequestMapping (value="/impotsSocietes/{ImpotsSocieteId}",method=RequestMethod.PUT)
	public ImpotsSociete save(@PathVariable Long ImpotsSocieteId,@RequestBody ImpotsSociete c) {
		c.setImpotsSocieteId(ImpotsSocieteId);
		return this.save(c);
	}
	@Override
	public <S extends ImpotsSociete> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ImpotsSociete> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@RequestMapping (value="/impotsSocietes",method=RequestMethod.GET)
	@Override
	public List<ImpotsSociete> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImpotsSociete> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@RequestMapping (value="/impotsSocietes/{ImpotsSocieteId}",method=RequestMethod.DELETE)
	@Override
	public void deleteById(Long ImpotsSocieteId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(ImpotsSociete entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ImpotsSociete> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
