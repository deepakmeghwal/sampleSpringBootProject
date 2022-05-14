package com.myCompany.myProject.controller;

import com.myCompany.myProject.entity.User;
import com.myCompany.myProject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUserById")
    public Optional<User> getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/getByUserName")
    public List<User> getByUserName(@RequestParam String name){
        return userService.getByUserName(name);
    }
    
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/createUsers")
    public List<User> createUsers(@RequestBody List<User> users){

        for(User user : users){
            userService.createUser(user);
        }

        return users;
    }

    @DeleteMapping("/deleteUserById")
    public String deleteUserById(@RequestParam Long id){
        return userService.deleteUserById(id);
    }

}
