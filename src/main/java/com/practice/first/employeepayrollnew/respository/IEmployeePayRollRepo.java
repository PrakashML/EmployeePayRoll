package com.practice.first.employeepayrollnew.respository;

import com.practice.first.employeepayrollnew.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePayRollRepo extends JpaRepository<Employee, Integer> {
    
}
