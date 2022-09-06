package service;

import model.User;

public interface UserService {
    User findUserById(int id);

    boolean updateUser(User user);
}
