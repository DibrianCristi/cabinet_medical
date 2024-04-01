
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Departament;
import java.util.List;

public interface DepartamentDAO {
    public List<Departament> getAllDepartament();
    public void saveDepartament(Departament departament);
    public Departament getDepartament(int id);
    public void deleteDepartament(int id);
}
