package service.customer;

import model.Customer;
import repository.customer.CustomerRepository;
import repository.customer.CustomerRepositoryImpl;
import service.customer.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAllCustomer();
    }

    @Override
    public Customer findByIdCustomer(String id) {

        return customerRepository.findByIdCustomer(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);

    }

    @Override
    public void upDateCustomer(String id,Customer customer) {
customerRepository.upDateCustomer(id,customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);

    }

    @Override
    public List<Customer> searchCustomer(String search) {
        return customerRepository.searchCustomer(search);
    }
}
