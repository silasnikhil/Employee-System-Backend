package com.reactspring.employeesystemapi.repository;

import com.reactspring.employeesystemapi.Entities.EmployeeEntity;
import com.reactspring.employeesystemapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
