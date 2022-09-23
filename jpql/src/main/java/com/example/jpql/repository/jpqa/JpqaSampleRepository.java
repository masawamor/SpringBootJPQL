package com.example.jpql.repository.jpqa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.jpql.model.Employee;

@Repository
public class JpqaSampleRepository {

	@PersistenceContext
	EntityManager em;

	public List<Employee> getAllEmployee() {
		String query = "SELECT e FROM Employee e";
		return em.createQuery(query, Employee.class).getResultList();
	}

}
