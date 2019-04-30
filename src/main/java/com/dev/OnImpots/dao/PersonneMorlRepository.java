package com.dev.OnImpots.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.OnImpots.entities.PersonneMorl;
import com.dev.OnImpots.entities.PersonnePhyz;



public interface PersonneMorlRepository extends JpaRepository<PersonneMorl,Long>{



  

}
