package com.dev.OnImpots.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.OnImpots.entities.Contribuable;



public interface ContribuableRepository extends JpaRepository<Contribuable,Long>{
 @Query("select c from Contribuable c where c.login like :x")
	public Page<Contribuable> chercher(@Param("x")String mc, Pageable pageable);
 @Query(" select c from Contribuable c " +
         " where c.login = ?1")


 Contribuable findUserWithName(String login);
  
}
