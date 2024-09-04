package com.kazama.spring_jpa_base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kazama.spring_jpa_base.entity.Employee;

@Repository
public interface EmoloyeeRepository extends JpaRepository<Employee,String>{
    
}
