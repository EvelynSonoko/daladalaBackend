package com.daladala.daladala.controller;

import com.daladala.daladala.service.DaladalaService;
import com.daladala.daladala.tables.Daladala;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="daladala")
public class DaladalaController {
    @Autowired
    private DaladalaService daladalaService;
    @RequestMapping(path = "get",method = RequestMethod.GET)
    public List<Daladala> getAll(){return daladalaService.getAll();}
    @RequestMapping(path = "post",method = RequestMethod.POST)
    public void add(@RequestBody Daladala daladala){daladalaService.addDaladaladala(daladala);}
    @RequestMapping(path="get/{id}",method = RequestMethod.GET)
    public Daladala getById(@PathVariable String id){return daladalaService.getById(id);}
    @RequestMapping(path="delete/{id}",method = {RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("id")String id){daladalaService.Delete(id);}
    @RequestMapping(path = "put",method = RequestMethod.PUT)
    public void update(@RequestBody Daladala daladala){daladalaService.updateDaladala(daladala);}
    @RequestMapping(path="car/{owner_id}",method =RequestMethod.GET )
    public Daladala getDaladalaOwner(@PathVariable("owner_id") String owner_id){
        return daladalaService.getDaladalaByOwner(owner_id);
    }

}
