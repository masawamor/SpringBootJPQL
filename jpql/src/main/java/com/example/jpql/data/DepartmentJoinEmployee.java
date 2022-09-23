package com.example.jpql.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DepartmentJoinEmployee {

	@Id
	private Long empId;

	private String empName;

	private String depName;

}
