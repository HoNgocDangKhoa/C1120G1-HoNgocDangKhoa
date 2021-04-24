package com.example.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name="service")
public class FuramaService {
    @Id
    @Column(name="service_id")
    @NotBlank(message = "Id service not null")
    @Pattern(regexp = "^DV-[0-9]{4}$",message ="must be in correct DV-xxxx format")
    private String serviceId;

    @Column(name = "service_name",columnDefinition = "VARCHAR(45) NOT NULL")
    private String serviceName;

    @Column(name = "service_are")
    private Integer serviceArea;

    @Column(name = "service_cost")
    private double serviceCost;

    @Column(name = "service_max_people")
    private Integer servicePeople;

    @Column(name = "standard_room" , columnDefinition = "VARCHAR(45) NOT NULL")
    private String standardRoom;

    @Column(name = "description_other_convenience" , columnDefinition = "VARCHAR(45)")
    private String descriptionConvenience;

    @Column(name = "pool_area")
    private double poolArea;


    @Column(name = "number_of_floors")
    private Integer numberFloors;

    @ManyToOne
    @JoinColumn(name="service_type_id" , nullable = false)
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id" , nullable = false)
    private RentType rentType;

    @OneToMany(mappedBy = "furamaService")
    private Set<Contract> contractSetService;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(Integer serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Integer getServicePeople() {
        return servicePeople;
    }

    public void setServicePeople(Integer servicePeople) {
        this.servicePeople = servicePeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionConvenience() {
        return descriptionConvenience;
    }

    public void setDescriptionConvenience(String descriptionConvenience) {
        this.descriptionConvenience = descriptionConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(Integer numberFloors) {
        this.numberFloors = numberFloors;
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

    public FuramaService() {
    }
}
