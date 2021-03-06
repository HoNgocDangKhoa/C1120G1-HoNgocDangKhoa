package sevice;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void insertUser(User user) ;

    public User selectUser(int id);

    public List<User> selectAllUsers() ;

    public void deleteUser(int id)  ;

    public void updateUser(int id,User user)  ;

    public List<User> selectUserCountry(String country);
}
