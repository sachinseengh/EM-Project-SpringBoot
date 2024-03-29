package com.example.EMProject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{


    List<Employee> employee= new ArrayList<>();
    @Override
    public String creatEmployee(Employee emp) {
        employee.add(emp);
        return "Saved";
        
    }

    @Override
    public List<Employee> readEmployee() {

        return employee;
       
    }

    @Override
    public Boolean updateEmployee(Employee emp) {
        return null;
        
    }

    @Override
    public Boolean deleteEmployee(Long id) {

        employee.remove(id);
        return true;
        
    }





    
}
