package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.User;
import jakarta.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<User> getAllUser() {

        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUser = query.getResultList();

        return allUser;
    }

    @Override
    public void saveUser(User User) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(User);
    }

    @Override
    public User getUser(int id) {
        Session session = entityManager.unwrap(Session.class);
        User User = session.get(User.class, id);
        return User;
    }

    @Override
    public void deleteUser(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("delete from User where id =:Userid");
        query.setParameter("Userid", id);
        query.executeUpdate();
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User where username = :UsernameUser", User.class);
        query.setParameter("UsernameUser", username);
        User user = query.uniqueResult();

        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        return user;
    }

}
