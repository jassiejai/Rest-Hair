package com.example.resthair.repository;


import com.example.resthair.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepostiory extends JpaRepository<Employee, Long> {

}
