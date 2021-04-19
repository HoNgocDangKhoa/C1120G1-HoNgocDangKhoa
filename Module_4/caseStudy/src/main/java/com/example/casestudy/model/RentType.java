package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rent_type_id")
    private Integer rent_type_id;

    @Column(name="rent_type_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String rent_type_name;

    @Column(name="rent_type_cost" )
    private double rent_type_cost;

    @OneToMany(mappedBy = "rentType")
    private Set<Service>typeRentSet;

    public Integer getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(Integer rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public double getRent_type_cost() {
        return rent_type_cost;
    }

    public void setRent_type_cost(double rent_type_cost) {
        this.rent_type_cost = rent_type_cost;
    }

    public Set<Service> getTypeRentSet() {
        return typeRentSet;
    }

    public void setTypeRentSet(Set<Service> typeRentSet) {
        this.typeRentSet = typeRentSet;
    }

    public RentType() {
    }
}
