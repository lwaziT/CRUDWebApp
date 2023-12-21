package com.example.crudWebApp.service;

import com.example.crudWebApp.dto.InstitutionDto;

import java.util.List;

public interface InsitutionService {
    List<InstitutionDto> findAllInstitutions();
}
