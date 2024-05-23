
package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.dao.DepartamentDAO;
import com.mycompany.spring.cabinet.springtest.entity.Departament;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartamentServiceImpl implements DepartamentService{
    @Autowired
    private DepartamentDAO departamentDAO;
    
    @Override
    @Transactional
    public List<Departament> getAllDepartament(){
        return departamentDAO.getAllDepartament();
    }
    
    @Override
    @Transactional
    public void saveDepartament(Departament departament){
        departamentDAO.saveDepartament(departament);
    }
    
    @Override
    @Transactional
    public Departament getDepartament(int id){
        return departamentDAO.getDepartament(id);
    }
    @Override
    @Transactional
        public void deleteDepartament(int id){
       departamentDAO.deleteDepartament(id);
}
}
