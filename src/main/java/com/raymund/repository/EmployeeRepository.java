package com.raymund.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raymund.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
