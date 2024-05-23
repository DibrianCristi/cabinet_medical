package com.mycompany.spring.cabinet.springtest.entity.response;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import com.mycompany.spring.cabinet.springtest.entity.Pacient;

public class PacientInfoResponse {
    private Pacient pacient;
    private Doctor doctor;
    private Departament departament;
    private Fisa fisa;
    
    public PacientInfoResponse(Pacient pacient, Doctor doctor, Departament departament, Fisa fisa) {
        this.pacient=pacient;
        this.doctor=doctor;
        this.departament=departament;
        this.fisa=fisa;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Fisa getFisa() {
        return fisa;
    }

    public void setFisa(Fisa fisa) {
        this.fisa = fisa;
    }
     
    
}
