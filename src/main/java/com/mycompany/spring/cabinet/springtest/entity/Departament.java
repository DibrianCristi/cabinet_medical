package com.mycompany.spring.cabinet.springtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departament")
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; 
    @Column(name ="denumire")
    private String denumire;
    @Column(name = "doctor_sef_id")
    private int doctor_sef_id;

    public Departament() {
    }

    public Departament(String denumire, int doctor_sef_id) {
        this.denumire = denumire;
        this.doctor_sef_id = doctor_sef_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getDoctor_sef_id() {
        return doctor_sef_id;
    }

    public void setDoctor_sef_id(int doctor_sef_id) {
        this.doctor_sef_id = doctor_sef_id;
    }
    
    
}
