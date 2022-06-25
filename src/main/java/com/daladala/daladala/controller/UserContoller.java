package com.daladala.daladala.controller;

import com.daladala.daladala.service.UserService;
import com.daladala.daladala.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="user")
public class UserContoller {
    @Autowired
    private UserService userService;
    @RequestMapping(path="get",method = RequestMethod.GET)
    public List<User> getAll() {return userService.getAll();}
    @RequestMapping(path = "post",method = RequestMethod.POST)
    public void add (@RequestBody User user){userService.addUser(user);}
    @RequestMapping(path = "get/{email}",method = RequestMethod.GET)
    public User getById(@PathVariable String email){return userService.getById(email);}
    @RequestMapping(path = "delete/{email}",method={RequestMethod.DELETE,RequestMethod.GET})
    public void Delete(@PathVariable("email") String email){userService.Delete(email);}
    @RequestMapping(path = "put",method = RequestMethod.PUT)
    public void update(@RequestBody User user){userService.UpdateUser(user);}
    @RequestMapping(path="login/email/{email}/pass/{password}",method = RequestMethod.GET)
    public User getByUser(@PathVariable("email") String email,@PathVariable("password") String password){
        return userService.getByUser(email,password);
    }
}
