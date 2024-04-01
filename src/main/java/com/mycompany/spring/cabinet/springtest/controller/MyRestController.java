
package com.mycompany.spring.cabinet.springtest.controller;

import com.mycompany.spring.cabinet.springtest.entity.Doctor;
import com.mycompany.spring.cabinet.springtest.service.DoctorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {
    
    @Autowired
    private DoctorService doctorService;
    
    @GetMapping("/doctor")
    public List<Doctor> showAllDoctor(){
        List<Doctor> allDoctor = doctorService.getAllDoctor();
        return allDoctor;
    }
    
}
