package sevice;

import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;
import sevice.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository=new UserRepositoryImpl();


    @Override
    public void insertUser(User user)   {
        userRepository.insertUser(user);

    }

    @Override
    public User selectUser(int id) {

        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers()   {
        return userRepository.selectAllUsers();
    }

    @Override
    public void deleteUser(int id)   {
        userRepository.deleteUser(id);

    }

    @Override
    public void updateUser(int id, User user)  {
        this.userRepository.updateUser(id,user);
    }

    @Override
    public List<User> selectUserCountry(String country) {
        return null;
    }

}
