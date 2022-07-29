package com.daladala.daladala.service;

import com.daladala.daladala.Encrypt;
import com.daladala.daladala.repository.UserRepository;
import com.daladala.daladala.tables.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
@Data
public class UserService {
    private final UserRepository userRepository;
    public void addUser(User user){
        byte[] shaInBytes = Encrypt.digest(user.getPassword().getBytes(StandardCharsets.UTF_8));
        user.setPassword(Encrypt.bytesToMax(shaInBytes));
        System.out.println(user.getPassword());
        userRepository.save(user);
    }
    public List<User> getAll(){return userRepository.findAll();}
    public User getById(String email){ return userRepository.findById(email).get(); }
    public void UpdateUser(User user){
        user.setUsertype("Customer");
        byte[] shaInBytes = Encrypt.digest(user.getPassword().getBytes(StandardCharsets.UTF_8));
        user.setPassword(Encrypt.bytesToMax(shaInBytes));
        userRepository.save(user); }
    public void Delete(String email){userRepository.deleteById(email);}
    public User getByUser(String email,String password){
        byte[] shaInBytes = Encrypt.digest(password.getBytes(StandardCharsets.UTF_8));
        String pass=Encrypt.bytesToMax(shaInBytes);
        return userRepository.getByUser(email,pass);
    }
}
