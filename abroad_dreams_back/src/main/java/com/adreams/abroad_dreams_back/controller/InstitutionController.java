package com.adreams.abroad_dreams_back.controller;

import com.adreams.abroad_dreams_back.entity.Institution;
import com.adreams.abroad_dreams_back.pojo.InstitutionPojo;
import com.adreams.abroad_dreams_back.service.InstitutionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/institution")
public class InstitutionController {

    private final InstitutionService institutionService;

    public InstitutionController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveInstitution(@RequestBody InstitutionPojo institutionPojo) {
        String result = institutionService.save(institutionPojo);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Institution>> getAllInstitutions() {
        List<Institution> institutions = institutionService.getAll();
        return ResponseEntity.ok(institutions);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Institution> getInstitutionById(@PathVariable("id") Long id) {
        Optional<Institution> institution = institutionService.getById(id);
        return institution.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteInstitutionById(@PathVariable("id") Long id) {
        institutionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Add additional endpoints for updating and other operations as needed
}
