package com.it.mapper;

import com.it.domain.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll(User user);

    void save(User user);
}
