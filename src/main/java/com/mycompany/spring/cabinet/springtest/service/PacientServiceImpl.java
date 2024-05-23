package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.dao.PacientDAO;
import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacientServiceImpl implements PacientService {

    @Autowired
    private PacientDAO pacientDAO;

    @Override
    @Transactional
    public List<Pacient> getAllPacient() {
        return pacientDAO.getAllPacient();
    }

    @Override
    @Transactional
    public void savePacient(Pacient pacient) {
        pacientDAO.savePacient(pacient);
    }

    @Override
    @Transactional
    public Pacient getPacient(int id) {
        return pacientDAO.getPacient(id);
    }

    @Override
    @Transactional
    public void deletePacient(int id) {
        pacientDAO.deletePacient(id);
    }

    @Override
    @Transactional
    public List<Pacient> getAllPacientByDoctor(int id) {
        return pacientDAO.getAllPacientByDoctor(id);
        
    }
    
    @Override
    @Transactional
    public List<Pacient> getAllPacientByDepartament(int id){
        return pacientDAO.getAllPacientByDepartament(id);
    }

}
