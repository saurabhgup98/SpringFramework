package com.saurabhtech.learn_spring_boot.learn_rest_api.socialmedia.controller;

import com.saurabhtech.learn_spring_boot.learn_rest_api.UserDaoService;
import com.saurabhtech.learn_spring_boot.learn_rest_api.socialmedia.entity.User;
import com.saurabhtech.learn_spring_boot.learn_rest_api.socialmedia.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> fetchAllUsers(){
       return  userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        User user = userDaoService.getUserById(id);
        if(null == user){
            throw new UserNotFoundException("user not found by id:: " + id);
        }
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userDaoService.deleteUserById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = userDaoService.saveUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
                buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build(); //response status is 201
    }
}
