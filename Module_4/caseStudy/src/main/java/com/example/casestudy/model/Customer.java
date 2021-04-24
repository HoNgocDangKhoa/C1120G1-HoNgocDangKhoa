package com.example.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @Column(name = "customer_id")
    @NotBlank(message = "ID customer not null")
    @Pattern(regexp = "^KH-[0-9]{4}$", message = "must be in correct KH-xxxx format")
    private String customerId;


    @Column(name = "customer_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String customerName;

    @Column(name = "customer_birthDay", columnDefinition = "DATE")
    private String customerBirthDay;

    @Column(name = "customer_gender")
    private boolean customerGender;

    @Column(name = "customer_id_card", columnDefinition = "VARCHAR(45) NOT NULL")
    @NotBlank(message = "not null")
    @Pattern(regexp = "^([0-9]{9}|[0-9]{12})$",message = "phải đúng định dạng XXXXXXXXX hoặc XXXXXXXXXXXX ")
    private String customerIdCard;

    @NotBlank(message = "not null")
    @Pattern(regexp = "^(0|\\(84\\)\\+)(90|91)[\\d]{7}$",message = " phai dung theo 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx")
    @Column(name = "customer_phone", columnDefinition = "VARCHAR(45) NOT NULL")
    private String customerPhone;

    @Column(name = "customer_email", columnDefinition = "VARCHAR(45) NOT NULL")
    @Email(message = "phai dung dinh dang abc@abc.com")
    private String CustomerEmail;

    @Column(name = "customer_address", columnDefinition = "VARCHAR(255) NOT NULL")
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", nullable = false)
    private CustomerType customerTypeId;


    @OneToMany(mappedBy = "customer")
    private Set<Contract> contractSet;

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthDay() {
        return customerBirthDay;
    }

    public void setCustomerBirthDay(String customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public CustomerType getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
