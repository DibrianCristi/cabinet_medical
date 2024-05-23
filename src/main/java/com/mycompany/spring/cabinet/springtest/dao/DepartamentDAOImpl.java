
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentDAOImpl implements DepartamentDAO{
    @Autowired
    EntityManager entityManager;
    
    @Override
    public List<Departament> getAllDepartament() {

        Session session = entityManager.unwrap(Session.class);
        Query<Departament> query = session.createQuery("from Departament", Departament.class);
        List<Departament> allDepartament = query.getResultList();

        return allDepartament;
    }
    
    @Override
    public void saveDepartament(Departament Departament){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(Departament);
    }
    
        @Override
    public Departament getDepartament(int id) {
        Session session = entityManager.unwrap(Session.class);
        Departament Departament = session.get(Departament.class, id);
        return Departament;
    }
        @Override
    public void deleteDepartament(int id){
        Session session = entityManager.unwrap(Session.class);
        Query<Departament> query = session.createQuery("delete from Departament where id =:Departamentid");
        query.setParameter("Departamentid", id);
        query.executeUpdate();
    }
}
