
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAOImpl implements DoctorDAO{
    @Autowired
    EntityManager entityManager;
    
    @Override
    public List<Doctor> getAllDoctor() {

        Session session = entityManager.unwrap(Session.class);
        Query<Doctor> query = session.createQuery("from Doctor", Doctor.class);
        List<Doctor> allDoctor = query.getResultList();

        return allDoctor;
    }
    
    @Override
    public void saveDoctor(Doctor doctor){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(doctor);
    }
    
        @Override
    public Doctor getDoctor(int id) {
        Session session = entityManager.unwrap(Session.class);
        Doctor doctor = session.get(Doctor.class, id);
        return doctor;
    }
        @Override
    public void deleteDoctor(int id){
        Session session = entityManager.unwrap(Session.class);
        Query<Doctor> query = session.createQuery("delete from Doctor where id =:doctorid");
        query.setParameter("doctorid", id);
        query.executeUpdate();
    }
    @Override
        public List<Doctor> getAllDoctorByDepartament(int id){
            Session session = entityManager.unwrap(Session.class);
        
        Query<Doctor> query = session.createQuery("from Doctor where departament_id =:Departamentid", Doctor.class);
        query.setParameter("Departamentid", id);
        
        List<Doctor> allDoctorByDepartament = query.getResultList();

        return allDoctorByDepartament;
        }

}
