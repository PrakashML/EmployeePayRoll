package com.practice.first.employeepayrollnew.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "join_Date")
    private Date startDate;
    @Column(name = "gender")
    private String Gender;
    @Column(name = "salary")
    private String Salary;
    @Column(name = "profile_picture")
    private String profilePicture;
    @Column(name = "note")
    private String notes;
    @Column(name = "age")
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", Gender='" + Gender + '\'' +
                ", Salary='" + Salary + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", notes='" + notes + '\'' +
                ", age=" + age +
                '}';
    }
}
