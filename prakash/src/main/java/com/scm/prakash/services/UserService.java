package com.scm.prakash.services;

import java.util.List;
import java.util.Optional;

import com.scm.prakash.entities.User;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(String id);
    Optional<User> updateUser(User user);
    void deleteUser(String id);

    boolean isUserExist(String userId);
    boolean isUserExistByEmail(String userId);

    List<User>getAllUsers();

    
}
