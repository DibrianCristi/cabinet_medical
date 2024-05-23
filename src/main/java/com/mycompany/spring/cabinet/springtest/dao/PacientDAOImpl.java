package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PacientDAOImpl implements PacientDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Pacient> getAllPacient() {

        Session session = entityManager.unwrap(Session.class);
        Query<Pacient> query = session.createQuery("from Pacient", Pacient.class);
        List<Pacient> allPacient = query.getResultList();

        return allPacient;
    }

    @Override
    public void savePacient(Pacient Pacient) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(Pacient);
    }

    @Override
    public Pacient getPacient(int id) {
        Session session = entityManager.unwrap(Session.class);
        Pacient Pacient = session.get(Pacient.class, id);

        return Pacient;
    }

    @Override
    public void deletePacient(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Pacient> query = session.createQuery("delete from Pacient where id =:Pacientid");
        query.setParameter("Pacientid", id);
        query.executeUpdate();
    }

    @Override
    public List<Pacient> getAllPacientByDoctor(int id) {
        Session session = entityManager.unwrap(Session.class);
        
        Query<Pacient> query = session.createQuery("from Pacient where doctor_id =:Doctorid", Pacient.class);
        query.setParameter("Doctorid", id);
        
        List<Pacient> allPacientByDoctor = query.getResultList();

        return allPacientByDoctor;
    }
    
    @Override
    public List<Pacient> getAllPacientByDepartament(int id){
                Session session = entityManager.unwrap(Session.class);
        
        Query<Pacient> query = session.createQuery("from Pacient where departament_id =:Departamentid", Pacient.class);
        query.setParameter("Departamentid", id);
        
        List<Pacient> allPacientByDepartament = query.getResultList();

        return allPacientByDepartament;
    }
}
