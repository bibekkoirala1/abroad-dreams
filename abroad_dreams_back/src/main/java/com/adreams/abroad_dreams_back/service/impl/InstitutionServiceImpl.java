package com.adreams.abroad_dreams_back.service.impl;

import com.adreams.abroad_dreams_back.entity.Institution;
import com.adreams.abroad_dreams_back.pojo.InstitutionPojo;
import com.adreams.abroad_dreams_back.repo.InstitutionRepo;
import com.adreams.abroad_dreams_back.service.CountryService;
import com.adreams.abroad_dreams_back.service.InstitutionService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstitutionServiceImpl implements InstitutionService {

    private final InstitutionRepo institutionRepo;
    private final CountryService countryService;

    @Override
    public String save(InstitutionPojo institutionPojo) {
        Institution institution;

        if (institutionPojo.getId() != null) {
            // If ID is present, fetch the existing institution from the database
            institution = institutionRepo.findById(institutionPojo.getId())
                    .orElseThrow(() -> new EntityNotFoundException("Institution not found with ID: " + institutionPojo.getId()));
        } else {
            // If ID is null, it's a new institution
            institution = new Institution();
        }

        // Set values from InstitutionPojo to Institution entity
        institution.setInstitutionName(institutionPojo.getInstitutionName());
        institution.setAddress(institutionPojo.getAddress());
        institution.setOfficialWebsite(institutionPojo.getOfficialWebsite());

        // Fetch and set the associated country using countryId
        institution.setCountry(countryService.getById(institutionPojo.getCountryId())
                .orElseThrow(() -> new EntityNotFoundException("Country not found with ID: " + institutionPojo.getCountryId())));

        institutionRepo.save(institution); // Save the Entity
        return "Saved Successfully!";
    }

    @Override
    public List<Institution> getAll() {
        return institutionRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        institutionRepo.deleteById(id);
    }

    @Override
    public Optional<Institution> getById(Long id) {
        return institutionRepo.findById(id);
    }

    // Other methods as needed
}
