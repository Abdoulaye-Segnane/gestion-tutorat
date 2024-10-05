package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.Tuteur;
import com.projet.spring.Tutorat.repository.TuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuteurService {
    @Autowired
    private TuteurRepository tuteurRepository;

    // Récupérer tous les tuteurs
    public List<Tuteur> getAllTuteurs() {
        return tuteurRepository.findAll();
    }

    // Récupérer un tuteur par ID
    public Tuteur getTuteurById(Long id) {
        return tuteurRepository.findById(id).orElse(null);
    }

    // Créer ou mettre à jour un tuteur
    public Tuteur createOrUpdateTuteur(Tuteur tuteur) {
        return tuteurRepository.save(tuteur);
    }

    // Supprimer un tuteur par ID
    public void deleteTuteur(Long id) {
        tuteurRepository.deleteById(id);
    }

}
