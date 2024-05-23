package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import java.util.List;


public interface PacientService {
    public List<Pacient> getAllPacient();
    public Pacient getPacient(int id);
    public void savePacient(Pacient pacient);
    public void deletePacient(int id);
    public List<Pacient> getAllPacientByDoctor(int id);
    public List<Pacient> getAllPacientByDepartament(int id);
}
