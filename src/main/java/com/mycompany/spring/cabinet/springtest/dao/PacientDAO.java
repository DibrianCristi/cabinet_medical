
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import java.util.List;


public interface PacientDAO {
        public List<Pacient> getAllPacient();
    public void savePacient(Pacient pacient);
    public Pacient getPacient(int id);
    public void deletePacient(int id);
    public List<Pacient> getAllPacientByDoctor(int id);
    public List<Pacient> getAllPacientByDepartament(int id);
}
