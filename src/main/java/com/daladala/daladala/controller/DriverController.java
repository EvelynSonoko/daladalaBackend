package com.daladala.daladala.controller;

import com.daladala.daladala.service.DriverService;
import com.daladala.daladala.tables.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path ="driver")
public class DriverController {
    @Autowired
    private DriverService driverService;
    @RequestMapping(path="get",method = RequestMethod.GET)
    public List<Driver> getAll(){return driverService.getAll();}
    @RequestMapping(path="post",method = RequestMethod.POST)
    public void add(@RequestBody Driver driver){driverService.addDriver(driver);}
    @RequestMapping(path="get/{id}",method = RequestMethod.GET)
    public Driver getById(@PathVariable String id){return driverService.getById(id);}
    @RequestMapping(path="delete/id",method = {RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("id") String id){ driverService.Delete(id);}
    @RequestMapping(path = "put",method = RequestMethod.PUT)
    public void update(@RequestBody Driver driver){driverService.updateDriver(driver);}


}
