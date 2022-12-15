package com.perfomatix.training.TodoList.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    private long id;
    private String name;
    private String department;
    private int salary;


}
