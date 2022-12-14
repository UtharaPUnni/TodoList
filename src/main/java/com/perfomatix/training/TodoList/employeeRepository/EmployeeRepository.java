package com.perfomatix.training.TodoList.employeeRepository;

import com.perfomatix.training.TodoList.employeeModel.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
