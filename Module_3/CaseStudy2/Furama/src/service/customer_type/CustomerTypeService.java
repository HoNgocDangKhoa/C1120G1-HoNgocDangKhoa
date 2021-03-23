package service.customer_type;

import model.Customer_type;

import java.util.List;

public interface CustomerTypeService {
    public Customer_type findByIdCus_Type(int id);

    public List<Customer_type> findAllCus_Type();
}
