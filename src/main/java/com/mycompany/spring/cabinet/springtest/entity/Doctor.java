package com.mycompany.spring.cabinet.springtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; 
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "is_sef")
    private boolean is_sef;
    @Column(name ="departament_id")
    private int departament_id;
    
    public Doctor(){}
    public Doctor(String nume, String prenume, boolean is_sef, int departament_id){
        this.nume=nume;
        this.prenume=prenume;
        this.is_sef=is_sef;
        this.departament_id=departament_id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public boolean isIs_sef() {
        return is_sef;
    }

    public void setIs_sef(boolean is_sef) {
        this.is_sef = is_sef;
    }

    public int getDepartament_id() {
        return departament_id;
    }

    public void setDepartament_id(int departament_id) {
        this.departament_id = departament_id;
    }
    
    
}
