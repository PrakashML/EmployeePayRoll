package com.practice.first.employeepayrollnew.controller;

import com.practice.first.employeepayrollnew.entity.Employee;
import com.practice.first.employeepayrollnew.respository.IEmployeePayRollRepo;
import com.practice.first.employeepayrollnew.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class EmployeeController {

    @Autowired
    IEmployeeService iEmployeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        try{
            List<Employee> allEmployee = iEmployeeService.getAllEmployee();
            return allEmployee;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        try{
            Employee employee = iEmployeeService.getEmployee(id);
            return employee;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/employee/add")
    public void addEmployee(@RequestBody Employee employee){
        try{
            iEmployeeService.addEmployee(employee);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/employee/update/{id}")
    public Employee updateEmployee(@PathVariable int id){
        try{
            return iEmployeeService.updateEmployee(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/employee/delete/{id}")
    public void deleteEmployee(@PathVariable int id){
        try{
            iEmployeeService.deleteEmployee(id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
