
package com.mycompany.spring.cabinet.springtest.controller;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import com.mycompany.spring.cabinet.springtest.entity.Pacient;
import com.mycompany.spring.cabinet.springtest.entity.response.DepartamentInfoResponse;
import com.mycompany.spring.cabinet.springtest.entity.response.DoctorInfoResponse;
import com.mycompany.spring.cabinet.springtest.entity.response.PacientInfoResponse;
import com.mycompany.spring.cabinet.springtest.service.DepartamentService;
import com.mycompany.spring.cabinet.springtest.service.DoctorService;
import com.mycompany.spring.cabinet.springtest.service.FisaService;
import com.mycompany.spring.cabinet.springtest.service.PacientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
    
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private FisaService FisaService;
    @Autowired
    private DepartamentService DepartamentService;
    @Autowired
    private PacientService PacientService;
    
    //Doctor controller
    
    @GetMapping("/doctor")
    public List<Doctor> showAllDoctor(){
        List<Doctor> allDoctor = doctorService.getAllDoctor();

        return allDoctor;
    }
    
    @RequestMapping("/doctor/{id}")
    public DoctorInfoResponse getDoctor(@PathVariable int id){
        
        Doctor doctor = doctorService.getDoctor(id);
        List<Pacient> doctor_pacient = PacientService.getAllPacientByDoctor(id);
        DoctorInfoResponse doctorResponse = new DoctorInfoResponse(doctor,doctor_pacient);
        
        return doctorResponse;
        //return doctor;
        
    }
    
    @PostMapping("/doctor")
    public Doctor addNewDoctor(@RequestBody Doctor doctor) {
        
    doctorService.saveDoctor(doctor);
    return doctor;
    
    }
    
    @PutMapping("/doctor")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        
        doctorService.saveDoctor(doctor);
        return doctor;
    }
    
    @DeleteMapping("/doctor")
    public void deleteDoctor(@PathVariable int id){
        doctorService.deleteDoctor(id);
        
    }
    
    // Fisa Controller ========================================================================================================
    
    @GetMapping("/fisa")
    public List<Fisa> showAllFisa(){
        List<Fisa> allFisa = FisaService.getAllFisa();
        return allFisa;
    }
    
    @GetMapping("/fisa/{id}")
    public Fisa getFisa(@PathVariable int id){
        
        Fisa Fisa = FisaService.getFisa(id);
        return Fisa;
        
    }
    
    @PostMapping("/fisa")
    public Fisa addNewFisa(@RequestBody Fisa Fisa) {
        
    FisaService.saveFisa(Fisa);
    return Fisa;
    
    }
    
    @PutMapping("/fisa")
    public Fisa updateFisa(@RequestBody Fisa Fisa){
        
        FisaService.saveFisa(Fisa);
        return Fisa;
    }
    
    @DeleteMapping("/fisa")
    public void deleteFisa(@PathVariable int id){
        FisaService.deleteFisa(id);
        
    }
    
    // Departament Controller =================================================================================================
    
    @GetMapping("/departament")
    public List<Departament> showAllDepartament(){
        List<Departament> allDepartament = DepartamentService.getAllDepartament();
        return allDepartament;
    }
    
    @GetMapping("/departament/{id}")
    public DepartamentInfoResponse getDepartament(@PathVariable int id){
        
        Departament Departament = DepartamentService.getDepartament(id);
        List<Doctor> departament_doctor = doctorService.getAllDoctorByDepartament(id);
        List<Pacient> departament_pacient = PacientService.getAllPacientByDepartament(id);
        DepartamentInfoResponse departamentResponse = new DepartamentInfoResponse(Departament,departament_doctor,departament_pacient);
        return departamentResponse;
        
    }
    
    @PostMapping("/departament")
    public Departament addNewDepartament(@RequestBody Departament Departament) {
        
    DepartamentService.saveDepartament(Departament);
    return Departament;
    
    }
    
    @PutMapping("/departament")
    public Departament updateDepartament(@RequestBody Departament Departament){
        
        DepartamentService.saveDepartament(Departament);
        return Departament;
    }
    
    @DeleteMapping("/departament")
    public void deleteDepartament(@PathVariable int id){
        DepartamentService.deleteDepartament(id);
        
    }
    
    // Pacient Controller =====================================================================================================
    
    @GetMapping("/pacient")
    public List<Pacient> showAllPacient(){
        List<Pacient> allPacient = PacientService.getAllPacient();
        return allPacient;
    }
    
    @GetMapping("/pacient/{id}")
    public PacientInfoResponse getPacient(@PathVariable int id){
        
        Pacient Pacient = PacientService.getPacient(id);
        Doctor pacient_doctor = doctorService.getDoctor(Pacient.getDoctor_id());
        Departament pacient_departament = DepartamentService.getDepartament(Pacient.getDepartament_id());
        Fisa pacient_fisa = FisaService.getFisa(Pacient.getFisa_id());
        PacientInfoResponse pacientResponse = new PacientInfoResponse(Pacient,pacient_doctor,pacient_departament,pacient_fisa);
        return pacientResponse;
        
    }
    
    @PostMapping("/pacient")
    public Pacient addNewPacient(@RequestBody Pacient Pacient) {
        
    PacientService.savePacient(Pacient);
    return Pacient;
    
    }
    
    @PutMapping("/pacient")
    public Pacient updatePacient(@RequestBody Pacient Pacient){
        
        PacientService.savePacient(Pacient);
        return Pacient;
    }
    
    @DeleteMapping("/pacient")
    public void deletePacient(@PathVariable int id){
        PacientService.deletePacient(id);
        
    }
    
}
