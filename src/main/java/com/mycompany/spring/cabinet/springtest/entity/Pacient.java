package com.mycompany.spring.cabinet.springtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacient")
public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id; 
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "doctor_id")
    private int doctor_id;
    @Column(name ="departament_id")
    private int departament_id;
    @Column(name = "fisa_id")
    private int fisa_id;

    public Pacient() {
    }

    public Pacient(String nume, String prenume, int doctor_id, int departament_id, int fisa_id) {
        this.nume = nume;
        this.prenume = prenume;
        this.doctor_id = doctor_id;
        this.departament_id = departament_id;
        this.fisa_id = fisa_id;
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

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getDepartament_id() {
        return departament_id;
    }

    public void setDepartament_id(int departament_id) {
        this.departament_id = departament_id;
    }

    public int getFisa_id() {
        return fisa_id;
    }

    public void setFisa_id(int fisa_id) {
        this.fisa_id = fisa_id;
    }
    
    
}
