package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.entity.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public User getUser(int id);

    public void saveUser(User User);

    public void deleteUser(int id);

    public User loadUserByUsername(String username);
}
