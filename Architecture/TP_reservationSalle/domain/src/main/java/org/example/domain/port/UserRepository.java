package org.example.domain.port;

import org.example.domain.entity.User;

public interface UserRepository {

    void create(User user);
    void delete(User user);
    User findById (int id);
}
