package com.adreams.abroad_dreams_back.service;

import com.adreams.abroad_dreams_back.pojo.UserPojo;
import com.adreams.abroad_dreams_back.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String save(UserPojo userPojo);

    List<User> getAll();

    void deleteById(Long id);

    Optional<User> getById(Long id);


}
