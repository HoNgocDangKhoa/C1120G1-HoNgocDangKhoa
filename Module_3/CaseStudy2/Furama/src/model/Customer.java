package model;

import java.sql.Date;

public class Customer {
    private String idCustomer;
    private Customer_type CustomerType;
    private String nameCustomer;
    private Date birthDayCustomer;
    private boolean gender;
    private String idCardCus;
    private String phoneCus;
    private String emailCus;
    private String addressCus;

    public Customer(Customer_type customerType, String nameCustomer, Date birthDayCustomer, boolean gender, String idCardCus, String phoneCus, String emailCus, String addressCus) {
        CustomerType = customerType;
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.gender = gender;
        this.idCardCus = idCardCus;
        this.phoneCus = phoneCus;
        this.emailCus = emailCus;
        this.addressCus = addressCus;
    }

    public Customer(String idCustomer, Customer_type customerType, String nameCustomer, Date birthDayCustomer,
                    boolean gender, String idCardCus, String phoneCus, String emailCus, String addressCus) {
        this.idCustomer = idCustomer;
        CustomerType = customerType;
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.gender = gender;
        this.idCardCus = idCardCus;
        this.phoneCus = phoneCus;
        this.emailCus = emailCus;
        this.addressCus = addressCus;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Customer_type getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Customer_type customerType) {
        CustomerType = customerType;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Date getBirthDayCustomer() {
        return birthDayCustomer;
    }

    public void setBirthDayCustomer(Date birthDayCustomer) {
        this.birthDayCustomer = birthDayCustomer;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCardCus() {
        return idCardCus;
    }

    public void setIdCardCus(String idCardCus) {
        this.idCardCus = idCardCus;
    }

    public String getPhoneCus() {
        return phoneCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.phoneCus = phoneCus;
    }

    public String getEmailCus() {
        return emailCus;
    }

    public void setEmailCus(String emailCus) {
        this.emailCus = emailCus;
    }

    public String getAddressCus() {
        return addressCus;
    }

    public void setAddressCus(String addressCus) {
        this.addressCus = addressCus;
    }
}
