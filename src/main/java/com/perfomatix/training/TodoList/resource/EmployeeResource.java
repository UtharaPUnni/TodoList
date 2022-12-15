package com.perfomatix.training.TodoList.resource;

import com.perfomatix.training.TodoList.entity.Employee;
import com.perfomatix.training.TodoList.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/saveemployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
}