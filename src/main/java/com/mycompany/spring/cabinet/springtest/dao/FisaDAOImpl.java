
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FisaDAOImpl implements FisaDAO{
    @Autowired
    EntityManager entityManager;
    
    @Override
    public List<Fisa> getAllFisa() {

        Session session = entityManager.unwrap(Session.class);
        Query<Fisa> query = session.createQuery("from Fisa", Fisa.class);
        List<Fisa> allFisa = query.getResultList();

        return allFisa;
    }
    
    @Override
    public void saveFisa(Fisa Fisa){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(Fisa);
    }
    
        @Override
    public Fisa getFisa(int id) {
        Session session = entityManager.unwrap(Session.class);
        Fisa Fisa = session.get(Fisa.class, id);
        return Fisa;
    }
        @Override
    public void deleteFisa(int id){
        Session session = entityManager.unwrap(Session.class);
        Query<Fisa> query = session.createQuery("delete from Fisa where id =:Fisaid");
        query.setParameter("Fisaid", id);
        query.executeUpdate();
    }
}
