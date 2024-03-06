package com.practice.first.employeepayrollnew.services;

import com.practice.first.employeepayrollnew.entity.Employee;
import com.practice.first.employeepayrollnew.respository.IEmployeePayRollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    private IEmployeePayRollRepo repo;
    @Override
    public List<Employee> getAllEmployee() throws Exception {
        List<Employee> allEmployee = repo.findAll();
        if(allEmployee.isEmpty()){
            throw new Exception("There is no employee added");
        }
        return allEmployee;
    }

    @Override
    public Employee getEmployee(@PathVariable int id) throws Exception {
        if(repo.findById(id).isEmpty())
        {
            throw new Exception("Employee Id Invalid");
        }
        else {
            return repo.findById(id).get();
        }
    }

    @Override
    public void addEmployee(@RequestBody Employee employee) throws Exception {
        if (repo.findAll().contains(employee)) {
            throw new Exception("Employee Already Exists");
        } else {
            repo.save(employee);
        }
    }

    @Override
    public Employee updateEmployee(int id) throws Exception {
        if(repo.findById(id).isEmpty())
        {
            throw new Exception("Employee Id is Invalid");
        }
        else {
            Employee employee = repo.findById(id).get();
            employee.setAge(20);
            employee.setName("Walter Jr");
            employee.setGender("Male");
            employee.setSalary("50000");
            employee.setProfilePicture("https://tinyurl.com/3jbsmjt3");
            return employee;
        }
    }

    @Override
    public void deleteEmployee(int id) throws Exception {
        if(repo.findById(id).isEmpty()){
            throw new Exception("Employee Id is Invalid");
        }
        else{
            Employee employee = repo.findById(id).get();
            repo.delete(employee);
        }
    }
}
