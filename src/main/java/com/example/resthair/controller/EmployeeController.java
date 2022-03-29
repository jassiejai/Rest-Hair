package com.example.resthair.controller;


import com.example.resthair.model.Employee;
import com.example.resthair.service.EmployeeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private void setEmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employeeObj){
        return employeeService.createEmployee(employeeObj);
    }


}
