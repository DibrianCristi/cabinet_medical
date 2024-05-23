
package com.mycompany.spring.cabinet.springtest.entity.response;

import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import java.util.List;


public class DoctorInfoResponse {
    private Doctor doctor;
    private List<Pacient> pacient;
    
    public DoctorInfoResponse(Doctor doctor, List<Pacient> pacient) {
        this.doctor = doctor;
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Pacient> getPacient() {
        return pacient;
    }

    public void setPacient(List<Pacient> pacient) {
        this.pacient = pacient;
    }
    
}
