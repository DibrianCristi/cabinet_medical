
package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.dao.FisaDAO;
import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FisaServiceImpl implements FisaService{
    @Autowired
    private FisaDAO fisaDAO;
    
    @Override
    @Transactional
    public List<Fisa> getAllFisa(){
        return fisaDAO.getAllFisa();
    }
    
    @Override
    @Transactional
    public void saveFisa(Fisa fisa){
        fisaDAO.saveFisa(fisa);
    }
    
    @Override
    @Transactional
    public Fisa getFisa(int id){
        return fisaDAO.getFisa(id);
    }
    @Override
    @Transactional
        public void deleteFisa(int id){
       fisaDAO.deleteFisa(id);
}
}
