package com.naitSaada.userManager.service;

import com.naitSaada.userManager.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Integer id);
    Optional<List<User>> findAll();
    void deleteByID(Integer id);
    void save(User e);
    void addMany(List<User> userList);
    void update(User e);

}
