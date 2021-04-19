package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer cus_id;


    @Column(name = "customer_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String cus_name;

    @Column(name = "customer_birthDay", columnDefinition = "DATE")
    private String cus_birthDay;

    @Column(name = "customer_gender")
    private boolean cus_gender;

    @Column(name = "customer_id_card", columnDefinition = "VARCHAR(45) NOT NULL")
    private String cus_id_card;

    @Column(name = "customer_phone", columnDefinition = "VARCHAR(45) NOT NULL")
    private String cus_phone;

    @Column(name = "customer_email", columnDefinition = "VARCHAR(45) NOT NULL")
    private String cus_email;

    @Column(name = "customer_address", columnDefinition = "VARCHAR(255) NOT NULL")
    private String cus_address;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", nullable = false)
    private CustomerType customer_type_id;


    @OneToMany(mappedBy = "customer")
    private Set<Contract> contractSet;

    public Customer() {
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_birthDay() {
        return cus_birthDay;
    }

    public void setCus_birthDay(String cus_birthDay) {
        this.cus_birthDay = cus_birthDay;
    }

    public boolean isCus_gender() {
        return cus_gender;
    }

    public void setCus_gender(boolean cus_gender) {
        this.cus_gender = cus_gender;
    }

    public String getCus_id_card() {
        return cus_id_card;
    }

    public void setCus_id_card(String cus_id_card) {
        this.cus_id_card = cus_id_card;
    }

    public String getCus_phone() {
        return cus_phone;
    }

    public void setCus_phone(String cus_phone) {
        this.cus_phone = cus_phone;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public CustomerType getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(CustomerType customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
