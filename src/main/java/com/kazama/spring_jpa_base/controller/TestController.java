package com.kazama.spring_jpa_base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kazama.spring_jpa_base.dto.CreateEmployeeRequestDto;
import com.kazama.spring_jpa_base.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class TestController {
    

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/testFunction")
    public String getMethodName() {
        return "hello world";
    }

    @PostMapping("/create")
    public ResponseEntity<?> postMethodName(@RequestBody CreateEmployeeRequestDto requestDto) {
        

        employeeService.createEmployee(requestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body("success");
    }


    
    @GetMapping("/get")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok().body(employeeService.getAllEmployee());
    }
    
    

}
