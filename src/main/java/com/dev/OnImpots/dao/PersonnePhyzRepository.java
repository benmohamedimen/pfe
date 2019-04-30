package com.dev.OnImpots.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.OnImpots.entities.PersonneMorl;
import com.dev.OnImpots.entities.PersonnePhyz;


public interface PersonnePhyzRepository extends JpaRepository<PersonnePhyz,Long>{
//	@Query("select pp from PersonnePhyz pp where pp.cin like :x")
//	public Page<PersonnePhyz> chercher(@Param("x")String mc, Pageable pageable);
// @Query(" select pp from PersonnePhyz pp " +
     //    " where pp.cin = ?1")


// PersonnePhyz findUserWithName(String cin);


  

}
