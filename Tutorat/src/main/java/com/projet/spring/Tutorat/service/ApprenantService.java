package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.Apprenant;
import com.projet.spring.Tutorat.repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantService {
    @Autowired
    private ApprenantRepository apprenantRepository;

    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();
    }
    public Apprenant getApprenantById(Long id){
        return apprenantRepository.findById(id).orElse(null);
    }

    public Apprenant createApprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    public void deleteApprenant(Long id) {
            apprenantRepository.deleteById(id);
    }

    }
