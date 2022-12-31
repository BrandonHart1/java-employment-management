package com.javaprojects.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.ems.model.Employee;

// ------- <Employee = Type of JPA entity, Long = Primary Key>
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
