package com.practice.first.employeepayrollnew.entity;

import jakarta.persistence.*;

import java.util.Date;

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

    public Employee() {

    }
    public Date getStartDate() {
        return startDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

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
