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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.OnImpots.dao.ExerciceRepository;

import com.dev.OnImpots.entities.Exercice;
import com.dev.OnImpots.entities.Loyer;

@RestController 
@CrossOrigin
public class ExerciceService implements ExerciceRepository {

	private ExerciceRepository exerciceRepository;
	@RequestMapping (value="/exercices",method=RequestMethod.GET)
	@Override
	public List<Exercice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercice> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping (value="/loyers/{NumLoyer}",method=RequestMethod.GET)
	@Override
	public List<Exercice> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exercice> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@RequestMapping (value="/exercices",method=RequestMethod.POST)
	@Override
	public <S extends Exercice> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Exercice> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Exercice getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exercice> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exercice> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Exercice> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping (value="/exercices/{CodeEx}",method=RequestMethod.PUT)
	@Override
	public <S extends Exercice> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Exercice> findById(Long id) {
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
/*	@RequestMapping (value="/chercherexercices",method=RequestMethod.GET)
	public Page<Loyer> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return exerciceRepository.chercher("%"+mc+"%", Pageable(page,size));
	}
	private Pageable Pageable(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	@RequestMapping (value="/exercices/{CodeEx}",method=RequestMethod.DELETE)
	@Override
	public void deleteById(Long CodeEx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Exercice entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Exercice> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Exercice> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exercice> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Exercice> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Exercice> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
/*
	@Override
	public Page<Loyer> chercher(String string, org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
