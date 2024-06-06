/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO { //extends JpaRepository<User, Integer> {

    public List<User> getAllUser();

    public User getUser(int id);

    public void saveUser(User User);

    public void deleteUser(int id);

    public User loadUserByUsername(String username);
}
