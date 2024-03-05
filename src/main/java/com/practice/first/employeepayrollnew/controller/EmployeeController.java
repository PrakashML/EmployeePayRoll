package com.practice.first.employeepayrollnew.controller;

import com.practice.first.employeepayrollnew.entity.Employee;
import com.practice.first.employeepayrollnew.respository.IEmployeePayRollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class EmployeeController {

    @Autowired
    IEmployeePayRollRepo repo;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        List<Employee> employees = repo.findAll();
        return employees;
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = repo.findById(id).get();
        return employee;
    }
    @PostMapping("/employee/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createEmployee(@RequestBody Employee employee){
        repo.save(employee);
    }
    @PutMapping("/employee/update/{id}")
    public Employee updateEmployees(@PathVariable int id){
        Employee employee = repo.findById(id).get();
        employee.setAge(25);
        repo.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/delete/{id}")
    public void removeEmployee(@PathVariable int id){
        Employee employee = repo.findById(id).get();
        repo.delete(employee);
    }
}
