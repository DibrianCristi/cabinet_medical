/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.cabinet.springtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "is_doctor")
    private int is_doctor;
    @Column(name = "is_pacient")
    private int is_pacient;

    public User() {
    }

    public User(int id, String username, String password, int is_doctor, int is_pacient) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIs_doctor() {
        return is_doctor;
    }

    public void setIs_doctor(int is_doctor) {
        this.is_doctor = is_doctor;
    }

    public int getIs_pacient() {
        return is_pacient;
    }

    public void setIs_pacient(int is_pacient) {
        this.is_pacient = is_pacient;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        // Add authorities (roles) based on user properties
        if (is_doctor == 1) {
            authorities.add(new SimpleGrantedAuthority("ROLE_DOCTOR"));
        }
        if (is_pacient == 1) {
            authorities.add(new SimpleGrantedAuthority("ROLE_PATIENT"));
        }
        // Add more roles if needed
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
