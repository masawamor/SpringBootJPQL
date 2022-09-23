package com.example.jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpql.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
