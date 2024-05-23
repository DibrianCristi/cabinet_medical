package com.mycompany.spring.cabinet.springtest.service;

import com.mycompany.spring.cabinet.springtest.entity.Fisa;
import java.util.List;


public interface FisaService {
    public List<Fisa> getAllFisa();
    public Fisa getFisa(int id);
    public void saveFisa(Fisa fisa);
    public void deleteFisa(int id);
}
