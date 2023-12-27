package com.example.employee.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employeelist")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private int employeeId;
    @Column(name = "employeename")
    private String employeeName;
    @Column(name = "email")
    private String email;
    @Column(name = "department")
    private String department;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String email, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
