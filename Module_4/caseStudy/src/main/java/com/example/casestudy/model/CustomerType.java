package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="customer_type_id")
    private Integer customer_type_id;

    @Column(name = "customer_type_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String customer_type_name;

    @OneToMany(mappedBy = "customer_type_id",cascade = CascadeType.ALL)
    private Set<Customer> customerSet;

    public CustomerType() {
    }


    public Integer getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(Integer customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_type_name() {
        return customer_type_name;
    }

    public void setCustomer_type_name(String customer_type_name) {
        this.customer_type_name = customer_type_name;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }
}
