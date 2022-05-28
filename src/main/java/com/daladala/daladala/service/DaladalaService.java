package com.daladala.daladala.service;

import com.daladala.daladala.repository.DaladalaRepository;
import com.daladala.daladala.tables.Daladala;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class DaladalaService  {
    private final DaladalaRepository daladalaRepository;
    public void addDaladaladala(Daladala daladala){

        daladalaRepository.save(daladala);
    }
    public List<Daladala> getAll(){return daladalaRepository.findAll();}
    public Daladala getById(String id){return  daladalaRepository.findById(id).get();}
    public void updateDaladala(Daladala daladala){daladalaRepository.save(daladala);}
    public void Delete(String id){daladalaRepository.deleteById(id);}
    public Daladala getDaladalaByOwner(String owner_id){
        return daladalaRepository.getByOwnerId(owner_id);
    }
}
