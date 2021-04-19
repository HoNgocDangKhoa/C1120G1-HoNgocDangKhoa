package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="service_type_id")
    private Integer service_type_id;

    @Column(name="service_type_name" ,columnDefinition = "VARCHAR(45) NOT NULL")
    private String service_type_name;

    @OneToMany(mappedBy = "serviceType")
    private Set<Service> serviceSet;

    public Integer getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(Integer service_type_id) {
        this.service_type_id = service_type_id;
    }

    public String getService_type_name() {
        return service_type_name;
    }

    public void setService_type_name(String service_type_name) {
        this.service_type_name = service_type_name;
    }

    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }

    public ServiceType() {
    }
}
