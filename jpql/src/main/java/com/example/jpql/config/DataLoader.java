package com.example.jpql.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.jpql.model.Department;
import com.example.jpql.model.Employee;
import com.example.jpql.repository.DepartmentRepository;
import com.example.jpql.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

	private final DepartmentRepository departmentRepository;
	private final EmployeeRepository   employeeRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		var department1 = new Department();
		department1.setName("Department1");
		departmentRepository.save(department1);

		var department2 = new Department();
		department2.setName("Department2");
		departmentRepository.save(department2);

		var employee1 = new Employee();
		employee1.setName("Masawa Morishita");
		employee1.setDepartment(department1);
		employeeRepository.save(employee1);

		var employee2 = new Employee();
		employee2.setName("Cristiano Ronald");
		employee2.setDepartment(department2);
		employeeRepository.save(employee2);
	}
}