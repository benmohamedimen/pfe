package com.dev.OnImpots.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.OnImpots.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
