package com.codeclan.example.employeeservice.models;

import javax.persistence.*;
import javax.swing.*;


@Entity

@Table(name="employees")

public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "employeeNumber")
    private int employeeNumber;
    
    @Column(name = "email")
    private String email;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Employee(){
    }
    
    public Employee(String name, int age, int employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public String getEmail() {
        return email;
    }
}

