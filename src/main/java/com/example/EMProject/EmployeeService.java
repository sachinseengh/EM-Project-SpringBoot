package com.example.EMProject;

import java.util.List;

public interface EmployeeService {
    
    public String creatEmployee(Employee emp);
    public List<Employee> readEmployee();
    Boolean updateEmployee(Employee emp);
    Boolean deleteEmployee(Long id);
}
