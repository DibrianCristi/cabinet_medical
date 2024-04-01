
package com.mycompany.spring.cabinet.springtest.dao;

import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import java.util.List;


public interface FisaDAO {
    public List<Fisa> getAllFisa();
    public void saveFisa(Fisa fisa);
    public Fisa getFisa(int id);
    public void deleteFisa(int id);
}
