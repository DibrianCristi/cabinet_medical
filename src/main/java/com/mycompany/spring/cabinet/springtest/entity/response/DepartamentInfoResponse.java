
package com.mycompany.spring.cabinet.springtest.entity.response;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import java.util.List;


public class DepartamentInfoResponse {
    private Departament departament;
    private List<Doctor> doctor;
    private List<Pacient> pacient;
    
    public DepartamentInfoResponse(Departament departament,List<Doctor> doctor, List<Pacient> pacient){
        this.departament=departament;
        this.doctor=doctor;
        this.pacient=pacient;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public List<Pacient> getPacient() {
        return pacient;
    }

    public void setPacient(List<Pacient> pacient) {
        this.pacient = pacient;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
    
}
