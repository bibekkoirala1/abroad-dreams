package com.adreams.abroad_dreams_back.service;

import com.adreams.abroad_dreams_back.pojo.InstitutionPojo;
import com.adreams.abroad_dreams_back.entity.Institution;

import java.util.List;
import java.util.Optional;

public interface InstitutionService {

    String save(InstitutionPojo institutionPojo);

    List<Institution> getAll();

    void deleteById(Long id);

    Optional<Institution> getById(Long id);


}
