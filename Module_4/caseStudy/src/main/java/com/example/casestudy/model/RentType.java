package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rent_type_id")
    private Integer rentTypeId;

    @Column(name="rent_type_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String rentTypeName;

    @Column(name="rent_type_cost" )
    private double rentTypeCost;

    @OneToMany(mappedBy = "rentType")
    private Set<FuramaService>typeRentSet;

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public Set<FuramaService> getTypeRentSet() {
        return typeRentSet;
    }

    public void setTypeRentSet(Set<FuramaService> typeRentSet) {
        this.typeRentSet = typeRentSet;
    }

    public RentType() {
    }
}
