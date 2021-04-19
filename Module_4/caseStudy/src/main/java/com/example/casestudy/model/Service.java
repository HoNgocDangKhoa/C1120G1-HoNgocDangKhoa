package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="service_id")
    private Integer service_id;

    @Column(name = "service_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String service_name;

    @Column(name = "service_are")
    private Integer service_are;

    @Column(name = "service_cost")
    private double service_cost;

    @Column(name = "service_max_people")
    private Integer service_max_people;

    @Column(name = "standard_room" , columnDefinition = "VARCHAR(45) NOT NULL")
    private String standard_room;

    @Column(name = "description_other_convenience" , columnDefinition = "VARCHAR(45) NOT NULL")
    private String description_other_convenience;

    @Column(name = "pool_area")
    private double pool_area;


    @Column(name = "number_of_floors")
    private Integer number_of_floors;

    @ManyToOne
    @JoinColumn(name="service_type_id" , nullable = false)
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id" , nullable = false)
    private RentType rentType;

    @OneToMany(mappedBy = "service")
    private Set<Contract> contractSetService;

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public Integer getService_are() {
        return service_are;
    }

    public void setService_are(Integer service_are) {
        this.service_are = service_are;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public Integer getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(Integer service_max_people) {
        this.service_max_people = service_max_people;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public Integer getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(Integer number_of_floors) {
        this.number_of_floors = number_of_floors;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Set<Contract> getContractSetService() {
        return contractSetService;
    }

    public void setContractSetService(Set<Contract> contractSetService) {
        this.contractSetService = contractSetService;
    }

    public Service() {
    }
}
