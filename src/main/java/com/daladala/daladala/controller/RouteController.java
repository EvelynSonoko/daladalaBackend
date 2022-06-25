package com.daladala.daladala.controller;

import com.daladala.daladala.service.RouteService;
import com.daladala.daladala.tables.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "route")
public class RouteController {
    @Autowired
    private RouteService routeService;



    @RequestMapping(path = "get",method = RequestMethod.GET)
    public List<Route> getAll(){
        return routeService.getAll();
    }

    @RequestMapping(path = "post",method = RequestMethod.POST)
    public void add(@RequestBody Route route){
        routeService.addRoute(route);
    }

    @RequestMapping(path = "get/{id}",method = RequestMethod.GET)
    public Route getById(@PathVariable int id){
       return routeService.getById(id);
    }

    @RequestMapping(path = "delete/{id}",method = {RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("id") int id){
        routeService.Delete(id);
    }

    @RequestMapping(path = "put",method = RequestMethod.PUT)
    public void update(@RequestBody Route route){
        routeService.updateRoute(route);
    }


}
