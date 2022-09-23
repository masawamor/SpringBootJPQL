package com.example.jpql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpql.data.DepartmentJoinEmployee;
import com.example.jpql.model.Department;
import com.example.jpql.model.Employee;
import com.example.jpql.repository.DepartmentRepository;
import com.example.jpql.repository.EmployeeRepository;
import com.example.jpql.repository.jpqa.JpqaSampleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class JpqaSampleController {

	private final EmployeeRepository employRepository;
	private final DepartmentRepository departmentRepository;
	private final JpqaSampleRepository jpqaRepository;

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World";
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employRepository.findAll();
	}

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@GetMapping("/employeesByJpqa")
	public List<DepartmentJoinEmployee> getAllEmployeesByJpqa() {
		return jpqaRepository.find();
	}
}
