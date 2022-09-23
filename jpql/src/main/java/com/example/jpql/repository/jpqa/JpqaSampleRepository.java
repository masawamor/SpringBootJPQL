package com.example.jpql.repository.jpqa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jpql.data.DepartmentJoinEmployee;

@Repository
public interface JpqaSampleRepository extends JpaRepository<DepartmentJoinEmployee, Long> {

	@Query(value =
			"SELECT "
			+ "  e.id as emp_id "
			+ ", e.name as emp_name "
			+ ", d.name as dep_name "
			+ "FROM "
			+ "Department d "
			+ "JOIN "
			+ "Employee e "
			+ "ON "
			+ "d.id = e.department_id",
			nativeQuery = true)
	List<DepartmentJoinEmployee> find();

}
