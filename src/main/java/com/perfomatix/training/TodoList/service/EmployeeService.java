package com.perfomatix.training.TodoList.service;

import com.perfomatix.training.TodoList.entity.Employee;
import com.perfomatix.training.TodoList.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmplyoee() {
        // List<Employee>emplist = new ArrayList<>();
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
