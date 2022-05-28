package com.daladala.daladala.controller;

import com.daladala.daladala.service.OwnerService;
import com.daladala.daladala.tables.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path="owner")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    @RequestMapping(path = "get",method = RequestMethod.GET)
    public List<Owner> getAll(){
        return ownerService.getAll();
    }
    @RequestMapping(path= "post",method = RequestMethod.POST)
    public void add(@RequestBody Owner owner){ ownerService.addOwner(owner); }
    @RequestMapping(path="get/{id}",method = RequestMethod.GET)
    public Owner getById(@PathVariable String id){
        return ownerService.getById(id);
    }
    @RequestMapping(path = "delete/{id}",method = {RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("id") String id){
        ownerService.Delete(id);
    }
    @RequestMapping(path = "put",method = RequestMethod.PUT)
    public void update(@RequestBody Owner owner){ ownerService.updateOwner(owner);}
    @RequestMapping(path="email/{email}",method = RequestMethod.GET)
    public Owner getOwnerById(@PathVariable("email") String email){
        return ownerService.getOwnerById(email);
    }
}
