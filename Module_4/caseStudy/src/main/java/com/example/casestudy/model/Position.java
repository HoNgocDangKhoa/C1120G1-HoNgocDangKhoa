package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer positionId;

    @Column(name = "position_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String positionName;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employeeSet;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
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
