package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="service_type_id")
    private Integer serviceTypeId;

    @Column(name="service_type_name" ,columnDefinition = "VARCHAR(45) NOT NULL")
    private String serviceTypeName;

    @OneToMany(mappedBy = "serviceType")
    private Set<FuramaService> furamaServiceSet;

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public Set<FuramaService> getFuramaServiceSet() {
        return furamaServiceSet;
    }

    public void setFuramaServiceSet(Set<FuramaService> furamaServiceSet) {
        this.furamaServiceSet = furamaServiceSet;
    }

    public ServiceType() {
    }
}
