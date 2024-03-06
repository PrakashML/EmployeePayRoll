package com.practice.first.employeepayrollnew.services;

import com.practice.first.employeepayrollnew.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployee() throws Exception;

    Employee getEmployee(int id) throws Exception;
    void addEmployee(Employee employee) throws Exception;
    Employee updateEmployee(int id) throws Exception;
    void deleteEmployee(int id) throws Exception;
}
