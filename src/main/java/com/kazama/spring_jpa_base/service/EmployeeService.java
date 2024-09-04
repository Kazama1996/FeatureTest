package com.kazama.spring_jpa_base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazama.spring_jpa_base.entity.Employee;
import com.kazama.spring_jpa_base.repository.EmoloyeeRepository;
import com.kazama.spring_jpa_base.dto.CreateEmployeeRequestDto;

@Service
public class EmployeeService {
    
    @Autowired
    private EmoloyeeRepository employeeRepository; 


    public void createEmployee(CreateEmployeeRequestDto createEmployeeRequestDto){

        Employee emp = Employee.builder().name(createEmployeeRequestDto.getName()).build();
        employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}
