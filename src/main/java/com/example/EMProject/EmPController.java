package com.example.EMProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmPController {
    
    List<Employee> employees = new ArrayList<>();
    @GetMapping("employee")
    public List<Employee> getMethodName() {
        employees.add(null);
        return employees;
    }

    @PostMapping("employee")
    public String CreateEmpl(@RequestBody Employee emps) {
     
        // Employee emp1 = new Employee();
        // emp1.setEmail("sachin");
        // emp1.setName("singh");
        // employees.add(emp1);
        employees.add(emps);
        
        
        return "Saved Successfully";
    }
    
    
}
