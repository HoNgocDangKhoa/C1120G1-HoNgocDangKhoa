package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="customer_type_id")
    private Integer customerTypeId;

    @Column(name = "customer_type_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String customerTypeName;

    @OneToMany(mappedBy = "customerTypeId",cascade = CascadeType.ALL)
    private Set<Customer> customerSet;

    public CustomerType() {
    }


    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customer_type_id) {
        this.customerTypeId = customer_type_id;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customer_type_name) {
        this.customerTypeName = customer_type_name;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }
}
