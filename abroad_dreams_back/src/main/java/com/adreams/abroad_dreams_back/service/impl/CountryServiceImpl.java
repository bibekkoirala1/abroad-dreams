package com.adreams.abroad_dreams_back.service.impl;


import com.adreams.abroad_dreams_back.service.CountryService;
import com.adreams.abroad_dreams_back.entity.Country;
import com.adreams.abroad_dreams_back.pojo.CountryPojo;
import com.adreams.abroad_dreams_back.repo.CountryRepo;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepo countryRepo;

    @Override
    public String save(CountryPojo countryPojo) {

        Country country;

        if (countryPojo.getId() != null) {
            // If ID is present, fetch the existing country from the database
            country = countryRepo.findById(countryPojo.getId())
                    .orElseThrow(() -> new EntityNotFoundException("Country not found with ID: " + countryPojo.getId()));
        } else {
            // If ID is null, it's a new country
            country = new Country();
        }


        // Set values from CountryPojo to Country entity
        country.setCountryname(countryPojo.getCountryname());
        country.setCountryshort(countryPojo.getCountryshort());


        countryRepo.save(country); //Save the Entity
        return "Saved Successfully!";
    }

    @Override
    public List<Country> getAll() {
        return countryRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        countryRepo.deleteById(id);
    }

    @Override
    public Optional<Country> getById(Long id) {
        return countryRepo.findById(id);
    }

}
