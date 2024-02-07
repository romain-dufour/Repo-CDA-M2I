package org.example.service;

import org.example.entity.User;
import org.example.port.UserRepository;

import java.sql.Time;
import java.time.LocalDate;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String userName, boolean admin) {
        if (userName.length() < 3) {
            throw new RuntimeException("Title length must be gt 3 char");
        }
        User user = new User.Builder().userName(userName).admin(admin).build();
        userRepository.create(user);
        return user;
    }

    public void deleteUser(int id) {
        User user = userRepository.findById(id);
        if (user == null) {
            throw new RuntimeException("Book not found");
        }
        userRepository.delete(user);
    }


}
