package com.dev.OnImpots.dao;




import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import com.dev.OnImpots.entities.Loyer;

public interface LoyerRepository extends JpaRepository<Loyer,Long> {
	



}
