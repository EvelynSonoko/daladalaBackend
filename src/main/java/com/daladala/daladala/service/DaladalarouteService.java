package com.daladala.daladala.service;

import com.daladala.daladala.repository.DaladalarouteRepository;
import com.daladala.daladala.tables.Daladalaroute;
import dto.DaladalarouteDto;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class DaladalarouteService {
    private final DaladalarouteRepository daladalarouteRepository;
    private final ModelMapper mapper;
    public void addDaladalaroute(DaladalarouteDto daladalarouteDto){
        Daladalaroute daladalaroute = mapper.map(daladalarouteDto,Daladalaroute.class);
        System.out.println(daladalaroute);
        daladalarouteRepository.save(daladalaroute);
    }
    public List<Daladalaroute> getAll(){return daladalarouteRepository.findAll();}
    public Daladalaroute getById(Integer id){return daladalarouteRepository.findById(id).get();}
    public void updateDaladalaroute(Daladalaroute daladalaroute){daladalarouteRepository.save(daladalaroute);}
    public void Delete(Integer id){daladalarouteRepository.deleteById(id);}
}
