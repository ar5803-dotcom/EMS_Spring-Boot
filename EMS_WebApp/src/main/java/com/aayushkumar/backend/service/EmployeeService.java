package com.aayushkumar.backend.service;

import java.util.List;

import com.aayushkumar.backend.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
