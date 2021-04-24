package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name="username" ,columnDefinition = "VARCHAR(45)")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "user")
    private Employee employee;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
