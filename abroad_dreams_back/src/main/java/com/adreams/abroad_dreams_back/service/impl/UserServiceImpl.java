package com.adreams.abroad_dreams_back.service.impl;


import com.adreams.abroad_dreams_back.service.UserService;
import com.adreams.abroad_dreams_back.entity.User;
import com.adreams.abroad_dreams_back.pojo.UserPojo;
import com.adreams.abroad_dreams_back.repo.UserRepo;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public String save(UserPojo userPojo) {
        User user = new User();

        if (userPojo.getId() != null) {
            user = userRepo.findById(userPojo.getId()).orElse(null);
        }

        if (user == null) {
            throw new EntityNotFoundException("User not found with ID: " + userPojo.getId());
        }

        user.setUsername(userPojo.getUsername());
        user.setPassword(userPojo.getPassword());
        user.setEmail(userPojo.getEmail());
        user.setRole(userPojo.getRole());

        userRepo.save(user);
        return "Saved Successfully!";
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }

    // Additional CRUD operations

    public List<User> getAllByUsername(String username) {
        return userRepo.findAllByUsername(username);
    }

    public User getByEmail(String email) {
        return userRepo.findByEmail(email).orElse(null);
    }

    // Add more CRUD methods as needed
}
