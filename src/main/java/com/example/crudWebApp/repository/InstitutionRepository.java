package com.example.crudWebApp.repository;

import com.example.crudWebApp.models.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    Optional<Institution> findByTitle(String title);
}
