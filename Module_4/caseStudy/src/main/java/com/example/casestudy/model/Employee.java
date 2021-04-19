package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @Column(name = "employee_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employee_name;

    @Column(name = "employee_birthday", columnDefinition = "DATE")
    private String employee_birthday;

    @Column(name = "employee_id_card", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employee_id_card;

    @Column(name = "employee_salary")
    private double employee_salary;

    @Column(name = "employee_phone", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employee_phone;


    @Column(name = "employee_email", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employee_email;

    @Column(name = "employee_address", columnDefinition = "VARCHAR(45) NOT NULL")
    private String employee_address;

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
}
