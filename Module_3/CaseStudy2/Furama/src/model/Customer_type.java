package model;

public class Customer_type {
    private int idCustomer_type;
    private String nameCustomer_type;

    public Customer_type(int idCustomer_type, String nameCustomer_type) {
        this.idCustomer_type = idCustomer_type;
        this.nameCustomer_type = nameCustomer_type;
    }

    public Customer_type() {
    }

    public int getIdCustomer_type() {
        return idCustomer_type;
    }

    public void setIdCustomer_type(int idCustomer_type) {
        this.idCustomer_type = idCustomer_type;
    }

    public String getNameCustomer_type() {
        return nameCustomer_type;
    }

    public void setNameCustomer_type(String nameCustomer_type) {
        this.nameCustomer_type = nameCustomer_type;
    }
}
