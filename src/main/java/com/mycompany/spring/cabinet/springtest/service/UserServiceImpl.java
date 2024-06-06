package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.dao.UserDAO;
import com.mycompany.spring.cabinet.springtest.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO UserDAO;

    @Override
    @Transactional
    public List<User> getAllUser() {
        return UserDAO.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User User) {
        UserDAO.saveUser(User);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return UserDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        UserDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public User loadUserByUsername(String username) {
        return UserDAO.loadUserByUsername(username);
    }
}
