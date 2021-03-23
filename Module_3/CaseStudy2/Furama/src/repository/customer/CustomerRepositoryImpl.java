package repository.customer;

import model.Customer;
import model.Customer_type;
import repository.customer_type.CustomerTypeRepositoryImpl;
import repository.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    public static final String SELECT_ALL_CUSTOMER = "select * from customer";
    public static final String UPDATE_CUSTOMER_ID = "update customer set customer_type_id = ? ,customer_name = ?," +
            "customer_birthday = ? ,customer_gender = ?,customer_id_card = ? ,customer_phone = ? ,customer_email = ?," +
            "customer_address = ? where customer_id = ?";
    public static final String SELECT_CUSTOMER_ID = "select * from customer where customer_id = ?";
    public static final String ADD_CUSTOMER = "insert into customer (customer_id  , customer_type_id, customer_name , customer_birthday , customer_gender , customer_id_card , customer_phone, customer_email, customer_address) value (?,?,?,?,?,?,?,?,?)";
    public static final String DELETE_CUSTOMER_ID = "delete from customer where customer_id = ?";
    public static final String SEARCH_CUSTOMER = "select * from customer where customer_name like ?";

    Customer_type customer_type = new Customer_type();
    CustomerTypeRepositoryImpl customerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<Customer> findAllCustomer() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Customer> customerList = new ArrayList<>();
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    String idCustomer = resultSet.getString("customer_id");
                    Customer_type idCustomer_type = customerTypeRepository.findByIdCus_Type(resultSet.getInt("customer_type_id"));
                    String nameCustomer = resultSet.getString("customer_name");
                    Date birthDayCustomer = resultSet.getDate("customer_birthday");
                    boolean gender = (resultSet.getInt("customer_gender") == 1);
                    String idCardCus = resultSet.getString("customer_id_card");
                    String phoneCus = resultSet.getString("customer_phone");
                    String emailCus = resultSet.getString("customer_email");
                    String addressCus = resultSet.getString("customer_address");
                    Customer customer = new Customer(idCustomer, idCustomer_type, nameCustomer, birthDayCustomer, gender, idCardCus, phoneCus, emailCus, addressCus);
                    customerList.add(customer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }

        return customerList;
    }

    @Override
    public Customer findByIdCustomer(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Customer customer = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_ID);
                preparedStatement.setString(1, id);

                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String idCustomer = resultSet.getString("customer_id");
                    Customer_type idCustomer_type = customerTypeRepository.findByIdCus_Type(resultSet.getInt("customer_type_id"));
                    String nameCustomer = resultSet.getString("customer_name");
                    Date birthDayCustomer = resultSet.getDate("customer_birthday");
                    boolean gender = (resultSet.getInt("customer_gender") == 1);
                    String idCardCus = resultSet.getString("customer_id_card");
                    String phoneCus = resultSet.getString("customer_phone");
                    String emailCus = resultSet.getString("customer_email");
                    String addressCus = resultSet.getString("customer_address");
                    customer = new Customer(idCustomer, idCustomer_type, nameCustomer, birthDayCustomer, gender, idCardCus, phoneCus, emailCus, addressCus);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customer;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(ADD_CUSTOMER);
                statement.setString(1, customer.getIdCustomer());
                statement.setInt(2, customer.getCustomerType().getIdCustomer_type());
                statement.setString(3, customer.getNameCustomer());
                statement.setDate(4, customer.getBirthDayCustomer());
                statement.setBoolean(5, customer.isGender());
                statement.setString(6, customer.getIdCardCus());
                statement.setString(7, customer.getPhoneCus());
                statement.setString(8, customer.getEmailCus());
                statement.setString(9, customer.getAddressCus());
                statement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }


    }

    @Override
    public void upDateCustomer(String id, Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(UPDATE_CUSTOMER_ID);
                statement.setInt(1, customer.getCustomerType().getIdCustomer_type());
                statement.setString(2, customer.getNameCustomer());
                statement.setDate(3, customer.getBirthDayCustomer());
                statement.setBoolean(4, customer.isGender());
                statement.setString(5, customer.getIdCardCus());
                statement.setString(6, customer.getPhoneCus());
                statement.setString(7, customer.getEmailCus());
                statement.setString(8, customer.getAddressCus());
                statement.setString(9, id);

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }

    }

    @Override
    public void deleteCustomer(String id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null){
            try {
                statement = connection.prepareStatement(DELETE_CUSTOMER_ID);
                statement.setString(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }

    }

    @Override
    public List<Customer> searchCustomer(String search) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Customer customer = null;
       List<Customer> customerList = new ArrayList<>();
        if(connection != null){
            try {
                statement= connection.prepareStatement(SEARCH_CUSTOMER);

                statement.setString(1,'%'+search+'%');
                resultSet =statement.executeQuery();

                while (resultSet.next()){
                    String idCustomer = resultSet.getString("customer_id");
                    Customer_type idCustomer_type = customerTypeRepository.findByIdCus_Type(resultSet.getInt("customer_type_id"));
                    String nameCustomer = resultSet.getString("customer_name");
                    Date birthDayCustomer = resultSet.getDate("customer_birthday");
                    boolean gender = (resultSet.getInt("customer_gender") == 1);
                    String idCardCus = resultSet.getString("customer_id_card");
                    String phoneCus = resultSet.getString("customer_phone");
                    String emailCus = resultSet.getString("customer_email");
                    String addressCus = resultSet.getString("customer_address");
                    customer = new Customer(idCustomer, idCustomer_type, nameCustomer, birthDayCustomer, gender, idCardCus, phoneCus, emailCus, addressCus);
                    customerList.add(customer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }
}
