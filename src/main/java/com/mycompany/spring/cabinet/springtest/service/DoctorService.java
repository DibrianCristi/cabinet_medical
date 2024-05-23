package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import java.util.List;


public interface DoctorService {
    public List<Doctor> getAllDoctor();
    public Doctor getDoctor(int id);
    public void saveDoctor(Doctor doctor);
    public void deleteDoctor(int id);
        public List<Doctor> getAllDoctorByDepartament(int id);

}
