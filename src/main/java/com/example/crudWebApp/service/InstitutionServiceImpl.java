package com.example.crudWebApp.service;

import com.example.crudWebApp.dto.InstitutionDto;
import com.example.crudWebApp.models.Institution;
import com.example.crudWebApp.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class InstitutionServiceImpl implements InsitutionService{

    private InstitutionRepository institutionRepository;

    public  InstitutionServiceImpl(InstitutionRepository institutionRepository){
        this.institutionRepository = institutionRepository;
    }
    @Override
    public List<InstitutionDto> findAllInstitutions() {
        List<Institution> institutions = institutionRepository.findAll();
        return institutions.stream().map((institution) -> mapToInstitutionDto(institution)).collect(Collectors.toList());
    }

    private InstitutionDto mapToInstitutionDto(Institution institution){
        InstitutionDto institutionDto = InstitutionDto.builder()
                .id(institution.getId())
                .title(institution.getTitle())
                .content(institution.getContent())
                .createdOn(institution.getCreatedOn())
                .photoUrl(institution.getPhotoUrl())
                .updatedOn(institution.getUpdatedOn())
                .build();
        return institutionDto;
    }
}
