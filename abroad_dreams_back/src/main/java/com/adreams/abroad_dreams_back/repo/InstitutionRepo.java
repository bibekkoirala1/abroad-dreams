package com.adreams.abroad_dreams_back.repo;

import com.adreams.abroad_dreams_back.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepo extends JpaRepository<Institution, Long> {
}
