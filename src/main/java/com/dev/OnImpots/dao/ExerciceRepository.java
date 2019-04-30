package com.dev.OnImpots.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.OnImpots.entities.Exercice;
import com.dev.OnImpots.entities.Loyer;

public interface ExerciceRepository extends JpaRepository<Exercice,Long>{

	//Page<Loyer> chercher(String string, Pageable pageable);

}
