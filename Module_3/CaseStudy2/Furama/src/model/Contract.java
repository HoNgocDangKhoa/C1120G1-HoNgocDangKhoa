package model;

import java.sql.Date;

public class Contract {
    private int idContract;
    private Date startDateContract;
    private Date endDateContract;
    private double depositContract;
    private double totalMoneyContract;
    private Employee employee;
    private Customer customer;
    private Service service;

    public Contract(int idContract, Date startDateContract, Date endDateContract, double depositContract, double totalMoneyContract, Employee employee, Customer customer, Service service) {
        this.idContract = idContract;
        this.startDateContract = startDateContract;
        this.endDateContract = endDateContract;
        this.depositContract = depositContract;
        this.totalMoneyContract = totalMoneyContract;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public Contract() {
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public Date getStartDateContract() {
        return startDateContract;
    }

    public void setStartDateContract(Date startDateContract) {
        this.startDateContract = startDateContract;
    }

    public Date getEndDateContract() {
        return endDateContract;
    }

    public void setEndDateContract(Date endDateContract) {
        this.endDateContract = endDateContract;
    }

    public double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(double depositContract) {
        this.depositContract = depositContract;
    }

    public double getTotalMoneyContract() {
        return totalMoneyContract;
    }

    public void setTotalMoneyContract(double totalMoneyContract) {
        this.totalMoneyContract = totalMoneyContract;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
