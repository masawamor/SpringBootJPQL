package com.example.jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
