package com.adreams.abroad_dreams_back.repo;


import com.adreams.abroad_dreams_back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findAllByUsername(String username);

    Optional<User> findByEmail(String email);
}
