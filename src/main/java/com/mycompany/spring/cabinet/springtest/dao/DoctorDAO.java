
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import java.util.List;


public interface DoctorDAO {
    public List<Doctor> getAllDoctor();
    public Doctor getDoctor(int id);
    public void saveDoctor(Doctor doctor);
    public void deleteDoctor(int id);
}
