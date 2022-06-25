package com.daladala.daladala.service;

import com.daladala.daladala.repository.OwnerRepository;
import com.daladala.daladala.tables.Owner;
import com.daladala.daladala.tables.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class OwnerService {
    private final UserService userService;
    private final OwnerRepository ownerRepository;
    public Owner addOwner(Owner owner){
        User user = new User();
        user.setEmail(owner.getEmail());
        user.setPassword(owner.getEmail());
        user.setUsertype("Customer");
        userService.addUser(user);
       return ownerRepository.save(owner);
    }
    public List<Owner> getAll(){
      return ownerRepository.findAll();
    }
    public Owner getById(String id){
        return ownerRepository.findById(id).get();
    }
    public void updateOwner(Owner owner){
        ownerRepository.save(owner);
    }
    public void Delete(String id){
        ownerRepository.deleteById(id);
    }
    public Owner getOwnerById(String email){
        return ownerRepository.getownerById(email);
    }

}
