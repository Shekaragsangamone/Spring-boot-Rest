package com.practice.firstwebjpa.doc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstwebjpa.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
