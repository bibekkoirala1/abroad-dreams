package com.adreams.abroad_dreams_back.controller;


import com.adreams.abroad_dreams_back.entity.User;
import com.adreams.abroad_dreams_back.service.UserService;
import com.adreams.abroad_dreams_back.pojo.UserPojo;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")  // Use a leading slash for consistency
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")  // Use a leading slash for consistency
    public String saveUser(@Valid @RequestBody UserPojo userPojo){
        userService.save(userPojo);
        return "Saved Successfully!";
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        this.userService.deleteById(id);
    }
}
