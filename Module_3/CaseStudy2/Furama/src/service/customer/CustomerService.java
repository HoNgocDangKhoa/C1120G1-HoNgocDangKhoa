package service.customer;

import model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAllCustomer();

    public Customer findByIdCustomer(String id);

    public void saveCustomer(Customer customer);


    public void upDateCustomer(String id ,Customer customer);

    public void deleteCustomer(String id);

    public  List<Customer> searchCustomer(String  search);
}
