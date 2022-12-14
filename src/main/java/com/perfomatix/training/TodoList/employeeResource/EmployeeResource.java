package com.perfomatix.training.TodoList.employeeResource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeResource {
    @GetMapping("/create")
    public String create(){
        return "Hi New Employee Project Created!!!";
    }

}
