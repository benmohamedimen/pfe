package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.OnImpots.dao.ImpotsRPPRepository;
import com.dev.OnImpots.entities.ImpotsRPP;


@RestController 
@CrossOrigin
public  abstract class ImpotsRPPService implements ImpotsRPPRepository {
	
	private ImpotsRPPRepository impotsRPPRepository ;
	@RequestMapping (value="/impotsRPPs",method=RequestMethod.POST)
	@Override
	public <S extends ImpotsRPP> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping (value="/impotsRPPs/{ImpotsRPPId}",method=RequestMethod.PUT)
	public ImpotsRPP save(@PathVariable Long ImpotsRPPId,@RequestBody ImpotsRPP c) {
		c.setImpotsRPPId(ImpotsRPPId);
		return this.save(c);
	}
	
	

	@Override
	public Optional<ImpotsRPP> findById(Long id) {
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
	@RequestMapping (value="/impotsRPPs/{ImpotsRPPId}",method=RequestMethod.DELETE)
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ImpotsRPP entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends ImpotsRPP> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<ImpotsRPP> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends ImpotsRPP> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<ImpotsRPP> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImpotsRPP getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping (value="/impotsRPPs",method=RequestMethod.GET)
	@Override
	public List<ImpotsRPP> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImpotsRPP> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ImpotsRPP> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
