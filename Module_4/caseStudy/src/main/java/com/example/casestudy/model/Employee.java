package com.example.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "employee_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employeeName;

    @Column(name = "employee_birthday", columnDefinition = "DATE")
    private String employeeBirthday;

    @Column(name = "employee_id_card", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employeeIdCard;

    @Column(name = "employee_salary")
    private double employeeSalary;

    @Column(name = "employee_phone", columnDefinition = "VARCHAR(45) NOT NULL")
    @NotBlank(message = "not null")
    @Pattern(regexp = "^(0|\\(84\\)\\+)(90|91)[\\d]{7}$",message = " phai dung theo 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx")
    private String employeePhone;


    @Column(name = "employee_email", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employeeEmail;

    @Column(name = "employee_address", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id" , nullable = false)
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id" , nullable = false)
    private Division division;

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contractSet;

    @OneToOne()
    @JoinColumn(name = "username", referencedColumnName = "username",nullable = false)
    private User user;

    public Employee() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
