package com.aayushkumar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aayushkumar.backend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
