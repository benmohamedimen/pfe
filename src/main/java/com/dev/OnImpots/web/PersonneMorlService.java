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

import com.dev.OnImpots.dao.ContribuableRepository;
import com.dev.OnImpots.dao.PersonneMorlRepository;
import com.dev.OnImpots.entities.Contribuable;
import com.dev.OnImpots.entities.PersonneMorl;

@RestController 
@CrossOrigin
public class PersonneMorlService implements PersonneMorlRepository {

private PersonneMorlRepository personneMorlRepository;
@RequestMapping (value="/personneMorls",method=RequestMethod.GET)
@Override
public List<PersonneMorl> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonneMorl> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<PersonneMorl> findAllById(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonneMorl> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}
@RequestMapping (value="/personneMorls/{RegistreCommerce}",method=RequestMethod.PUT)
@Override
public <S extends PersonneMorl> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<PersonneMorl> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}
@RequestMapping (value="/personneMorls/{RegistreCommerce}",method=RequestMethod.GET)
@Override
public PersonneMorl getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonneMorl> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonneMorl> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<PersonneMorl> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}
@RequestMapping (value="/personneMorls",method=RequestMethod.POST)
@Override
public <S extends PersonneMorl> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<PersonneMorl> findById(Long id) {
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
@RequestMapping (value="/personneMorls/{RegistreCommerce}",method=RequestMethod.DELETE)
@Override
public void deleteById(Long id) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(PersonneMorl entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends PersonneMorl> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends PersonneMorl> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonneMorl> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends PersonneMorl> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends PersonneMorl> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}

	
}
