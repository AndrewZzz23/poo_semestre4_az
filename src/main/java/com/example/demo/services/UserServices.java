package com.example.demo.services;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repositories.IUserRepository;

@Service
public class UserServices {
    @Autowired
    private IUserRepository userRepository;

    public User createUser(User user) {
        // insert into 
        return userRepository.save(user);
    }
    
    public ArrayList<User> getAllUsers() {
        // select sin filtro 
        return (ArrayList<User>) userRepository.findAll();
    }

    public User updateUser(User user) {
         
        return userExist(user.getId()) ? userRepository.save(user) : null;
        // validar que usario exista
    }

    public boolean userExist(UUID id){
        // validar que usario exista
        return userRepository.findById(id) != null ? true : false;}
}