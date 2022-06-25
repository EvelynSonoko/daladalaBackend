package com.daladala.daladala.service;

import com.daladala.daladala.repository.UserRepository;
import com.daladala.daladala.tables.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {
    private final UserRepository userRepository;
    public void addUser(User user){
        userRepository.save(user);
    }
    public List<User> getAll(){return userRepository.findAll();}
    public User getById(String email){ return userRepository.findById(email).get(); }
    public void UpdateUser(User user){
        user.setUsertype("Customer");
        userRepository.save(user); }
    public void Delete(String email){userRepository.deleteById(email);}
    public User getByUser(String email,String password){
        return userRepository.getByUser(email,password);
    }
}
