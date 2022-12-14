package com.perfomatix.training.TodoList.employeeService;

import com.perfomatix.training.TodoList.employeeModel.Employee;
import com.perfomatix.training.TodoList.employeeRepository.EmployeeRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmplyoee(){
       // List<Employee>emplist = new ArrayList<>();
      return  employeeRepository.findAll();



    }



}
