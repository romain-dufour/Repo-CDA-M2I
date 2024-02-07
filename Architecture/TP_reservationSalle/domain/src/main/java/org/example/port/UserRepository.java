package org.example.port;

import org.example.entity.User;

import java.util.List;

public interface UserRepository {

    void create(User user);
    void delete(User user);
    User findById (int id);
}
