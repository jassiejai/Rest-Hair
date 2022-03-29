package com.example.resthair.service;


import com.example.resthair.model.Employee;
import com.example.resthair.repository.EmployeeRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepostiory employeeRepostiory;

    public void setEmployeeRepostiory(EmployeeRepostiory employeeRepostiory){
        this.employeeRepostiory = employeeRepostiory;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepostiory.findAll();
    }

    public Employee getEmployee(Long employeeId){

        Employee employee = employeeRepostiory.getById(employeeId);

        return employee;

    }
    public Employee createEmployee(Employee employeeObj){
        return employeeRepostiory.save(employeeObj);
    }


}
