package com.daladala.daladala.controller;

import com.daladala.daladala.service.DaladalarouteService;
import com.daladala.daladala.tables.Daladala;
import com.daladala.daladala.tables.Daladalaroute;
import dto.DaladalarouteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "daladalaroute")
public class DaladalarouteContoller {
    @Autowired
    private DaladalarouteService daladalarouteService;
    @RequestMapping(path="get",method = RequestMethod.GET)
    public List<Daladalaroute> getAll(){return daladalarouteService.getAll();}
    @RequestMapping(path = "post",method = RequestMethod.POST)
    public void add(@RequestBody DaladalarouteDto daladalarouteDto){
        daladalarouteService.addDaladalaroute(daladalarouteDto);
        }
    @RequestMapping(path = "get/{id}",method = RequestMethod.GET)
    public Daladalaroute getById(@PathVariable Integer id){return daladalarouteService.getById(id);}
    @RequestMapping(path = "delete/id",method = {RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("id") Integer id){daladalarouteService.Delete(id);}
    @RequestMapping(path="put",method = RequestMethod.PUT)
    public void update(@RequestBody Daladalaroute daladalaroute){daladalarouteService.updateDaladalaroute(daladalaroute);}
}
