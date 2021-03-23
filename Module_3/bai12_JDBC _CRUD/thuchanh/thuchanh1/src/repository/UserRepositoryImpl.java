package repository;

import model.User;

import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {



    public static final String SELECT_ALL_USERS = "select * from users";
    public static final String INSER_NAME_USER = "insert into users(name, email, country) values(?, ?, ?)";
    public static final String SELECT_USERS_ID = "select  * from users where id=?";
    public static final String DELETE_USERS_ID = "delete from users where id = ?";
    public static final String UPDATE_USERS_ID = "update users set  name = ?, email = ?,country = ? where id =?";
    public static final String SELECT_COUNTRY =  "select  * from users where country=?";


    @Override
    public void insertUser(User user) {

        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSER_NAME_USER);
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
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


    @Override
    public User selectUser(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;

        if(connection != null){
            try {
                statement=connection.prepareStatement(SELECT_USERS_ID);
                statement.setInt(1,id);
                resultSet=statement.executeQuery();

                while (resultSet.next()){
                    int idUser = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(idUser,name,email,country);
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
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement= null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();

      if (connection != null){
          try {
              statement = connection.prepareStatement(SELECT_ALL_USERS);
              //System.out.println(statement);
              resultSet = statement.executeQuery();
                 User user = null;
              while (resultSet.next()){
                  int id = resultSet.getInt("id");
                  String name = resultSet.getString("name");
                  String email = resultSet.getString("email");
                  String country = resultSet.getString("country");
                  user = new User(id,name,email,country);
                  userList.add(user);
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
        return userList;
    }

    @Override
    public void deleteUser(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;

        if(connection != null){
            try {
                statement=connection.prepareStatement(DELETE_USERS_ID);
                statement.setInt(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.close();
        }

    }

    @Override
    public void updateUser(int id, User user) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement= null;
        if(connection != null ){
            try {
                statement = connection.prepareStatement(UPDATE_USERS_ID);
                statement.setString(1, user.getName());
                statement.setString(2,user.getEmail());
                statement.setString(3,user.getCountry());
                statement.setInt(4,id);
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
    public List<User> selectUserCountry(String country) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();

        if(connection != null){
            try {
                statement=connection.prepareStatement(SELECT_COUNTRY);
                statement.setString(1,country);
                resultSet = statement.executeQuery();

                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country1 = resultSet.getString("country");
                   User user= new User(id,name,email,country1);
                   userList.add(user);
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

        return userList;
    }

}