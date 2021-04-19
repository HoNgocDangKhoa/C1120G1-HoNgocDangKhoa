package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer division_id;

    @Column(name = "division_name" , columnDefinition = "VARCHAR(45) NOT NULL")
    private  Integer division_name;

    @OneToMany(mappedBy = "division")
    private Set<Employee> employeeSet;

    public Integer getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Integer division_id) {
        this.division_id = division_id;
    }

    public Integer getDivision_name() {
        return division_name;
    }

    public void setDivision_name(Integer division_name) {
        this.division_name = division_name;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Division() {
    }
}
