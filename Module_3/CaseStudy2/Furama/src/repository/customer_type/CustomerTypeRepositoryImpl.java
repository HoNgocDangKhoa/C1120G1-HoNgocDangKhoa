package repository.customer_type;

import model.Customer_type;
import repository.DBConnection;
import repository.customer_type.CustomerTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    public static final String SELECT_ID_USER = "select * from customer_type where customer_type_id = ?";
    public static final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type";

    @Override
    public Customer_type findByIdCus_Type(int id) {
        Connection connection = DBConnection.getConnection();
        Customer_type customer_type= null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null ){
            try {
                statement = connection.prepareStatement(SELECT_ID_USER);
                statement.setInt(1,id);
                resultSet= statement.executeQuery();
                while (resultSet.next()){
                    int idCustomer_type = resultSet.getInt("customer_type_id");
                    String nameCustomer_type = resultSet.getString("customer_type_name");
                     customer_type = new Customer_type(idCustomer_type,nameCustomer_type);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }

        }
        return customer_type;
    }

    @Override
    public List<Customer_type> findAllCus_Type() {

        List<Customer_type> customerTypeList = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null ;
        ResultSet resultSet = null;
Customer_type customer_type = null;
        if(connection != null ){
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()){
                    int idCustomer_type = resultSet.getInt("customer_type_id");
                    String nameCustomer_type = resultSet.getString("customer_type_name");
                    customer_type = new Customer_type(idCustomer_type,nameCustomer_type);
                    customerTypeList.add(customer_type);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    resultSet.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerTypeList;

    }
}
