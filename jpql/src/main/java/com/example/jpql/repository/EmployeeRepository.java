package com.example.jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
