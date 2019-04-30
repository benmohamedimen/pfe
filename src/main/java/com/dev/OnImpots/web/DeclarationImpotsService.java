package com.dev.OnImpots.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.OnImpots.dao.DeclarationImpotsRepository;
import com.dev.OnImpots.entities.DeclarationImpots;

@RestController 
@CrossOrigin
public class DeclarationImpotsService implements DeclarationImpotsRepository  {
 
private DeclarationImpotsRepository declarationImpotsRepository;
@RequestMapping (value="/declarationImpotss",method=RequestMethod.GET)
	@Override
	public List<DeclarationImpots> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeclarationImpots> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeclarationImpots> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationImpots> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@RequestMapping (value="/declarationImpotss/{IdDeclarationImpots}",method=RequestMethod.PUT)
	@Override
	public <S extends DeclarationImpots> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<DeclarationImpots> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@RequestMapping (value="/declarationImpotss/{IdDeclarationImpots}",method=RequestMethod.GET)
	@Override
	public DeclarationImpots getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationImpots> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationImpots> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DeclarationImpots> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping (value="/declarationImpotss",method=RequestMethod.POST)
	@Override
	public <S extends DeclarationImpots> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DeclarationImpots> findById(Long id) {
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
	@RequestMapping (value="/declarationImpotss/{IdDeclarationImpots}",method=RequestMethod.DELETE)
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeclarationImpots entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends DeclarationImpots> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends DeclarationImpots> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationImpots> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationImpots> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends DeclarationImpots> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
