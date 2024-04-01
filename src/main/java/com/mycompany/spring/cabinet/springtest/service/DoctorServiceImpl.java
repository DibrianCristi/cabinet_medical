
package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.dao.DoctorDAO;
import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorDAO doctorDAO;
    
    @Override
    @Transactional
    public List<Doctor> getAllDoctor(){
        return doctorDAO.getAllDoctor();
    }
    
    @Override
    @Transactional
    public void saveDoctor(Doctor doctor){
        doctorDAO.saveDoctor(doctor);
    }
    
    @Override
    @Transactional
    public Doctor getDoctor(int id){
        return doctorDAO.getDoctor(id);
    }
    @Override
    @Transactional
        public void deleteDoctor(int id){
       doctorDAO.deleteDoctor(id);
}
}
