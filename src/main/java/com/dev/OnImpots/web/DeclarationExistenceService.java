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

import com.dev.OnImpots.dao.DeclarationExistenceRepository;
import com.dev.OnImpots.entities.DeclarationExistence;
@RestController 
@CrossOrigin
public class DeclarationExistenceService implements DeclarationExistenceRepository {

	private DeclarationExistenceRepository declarationExistenceRepository;
	@RequestMapping (value="/declarationExistences",method=RequestMethod.GET)
	@Override
	public List<DeclarationExistence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeclarationExistence> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<DeclarationExistence> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationExistence> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@RequestMapping (value="/declarationExistences/{Code_DE}",method=RequestMethod.PUT)
	@Override
	public <S extends DeclarationExistence> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<DeclarationExistence> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DeclarationExistence getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationExistence> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationExistence> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DeclarationExistence> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping (value="/declarationExistences",method=RequestMethod.POST)
	@Override
	public <S extends DeclarationExistence> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping (value="/declarationExistences/{Code_DE}",method=RequestMethod.GET)
	@Override
	public Optional<DeclarationExistence> findById(Long id) {
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
	@RequestMapping (value="/declarationExistences/{Code_DE}",method=RequestMethod.DELETE)
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeclarationExistence entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends DeclarationExistence> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends DeclarationExistence> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationExistence> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DeclarationExistence> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends DeclarationExistence> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
