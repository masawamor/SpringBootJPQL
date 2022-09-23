package com.example.jpql.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	// 一対多のテーブルを指定。
	//マップする対象フィールドをmappedByで指定する
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
