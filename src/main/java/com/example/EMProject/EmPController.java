package com.example.EMProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmPController {
    
    // List<Employee> employees = new ArrayList<>();
  EmployeeService employeeService = new EmployeeServiceImpl();


//Dependency Injection
// @Autowired
// EmployeeService employeeService;
 
    @GetMapping("employee")
    public List<Employee> getMethodName() {
        // adding null element to the list of employees
        // employees.add(null);
        // returning the list of employees
        // return employees;
        return employeeService.readEmployee();
    }


    @PostMapping("employee")
    public String CreateEmpl(@RequestBody Employee emps) {
     
        // Employee emp1 = new Employee();
        // emp1.setEmail("sachin");
        // emp1.setName("singh");
        // employees.add(emp1);
        // employees.add(emps);

        employeeService.creatEmployee(emps);
        
        
        return "Saved Successfully";
    }
    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
      if(  employeeService.deleteEmployee(id))
        return "Deleted";

       return "Failed";
      
        
    }    
    
}
