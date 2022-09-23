package com.example.jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpql.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
