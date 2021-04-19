package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer position_id;

    @Column(name = "position_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String position_name;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employeeSet;

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Position() {
    }
}
