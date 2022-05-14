package com.myCompany.myProject.service;

import com.myCompany.myProject.entity.User;
import com.myCompany.myProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> getByUserName(String name){
        return userRepository.findByUserName(name);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public String deleteUserById(Long id) {

        try{
            userRepository.deleteById(id);
        }catch (Exception ex){
            return "User did found it";
        }

        return "User deleted successfully";
    }
}
