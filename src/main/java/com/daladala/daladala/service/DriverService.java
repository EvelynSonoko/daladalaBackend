package com.daladala.daladala.service;

import com.daladala.daladala.repository.DriverRepository;
import com.daladala.daladala.tables.Driver;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class DriverService {
    private final DriverRepository driverRepository;
    public void addDriver(Driver driver){
        driverRepository.save(driver);
    }
    public List<Driver> getAll(){return driverRepository.findAll();}
    public Driver getById(String id){return driverRepository.findById(id).get();}
    public void updateDriver(Driver driver){driverRepository.save(driver);}
    public void Delete(String id){driverRepository.deleteById(id);
    }
}
