package com.perfomatix.training.TodoList.employeeResource;

import com.perfomatix.training.TodoList.employeeModel.Employee;

import com.perfomatix.training.TodoList.employeeService.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;

    @GetMapping("/create")
    public String create() {
        return "Hi New Employee Project Created!!!";

    }

    @GetMapping("/listemployee")
    public ResponseEntity<List<Employee>> getEmployeeList() {
        return new ResponseEntity<>(employeeService.getAllEmplyoee(), HttpStatus.OK);
    }


}
