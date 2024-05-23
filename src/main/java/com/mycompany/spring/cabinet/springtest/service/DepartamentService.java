package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import java.util.List;


public interface DepartamentService {
    public List<Departament> getAllDepartament();
    public Departament getDepartament(int id);
    public void saveDepartament(Departament departament);
    public void deleteDepartament(int id);
}
