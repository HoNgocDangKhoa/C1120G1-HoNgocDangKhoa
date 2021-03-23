package service.customer_type;

import model.Customer_type;
import repository.customer_type.CustomerTypeRepository;
import repository.customer_type.CustomerTypeRepositoryImpl;
import service.customer_type.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerRepository = new CustomerTypeRepositoryImpl();


    @Override
    public Customer_type findByIdCus_Type(int id) {
        return customerRepository.findByIdCus_Type(id);
    }

    @Override
    public List<Customer_type> findAllCus_Type() {
        return customerRepository.findAllCus_Type();
    }
}
