package com.projet.spring.Tutorat.controller;

import com.projet.spring.Tutorat.modele.Tuteur;
import com.projet.spring.Tutorat.service.TuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/tuteurs")
public class TuteurController {
    @Autowired
    private TuteurService tuteurService;

    // Récupérer tous les tuteurs
    @GetMapping
    public List<Tuteur> getAllTuteurs() {
        return tuteurService.getAllTuteurs();
    }

    // Récupérer un tuteur par son ID
    @GetMapping("/{id}")
    public Tuteur getTuteurById(@PathVariable Long id) {
        return tuteurService.getTuteurById(id);
    }

    // Créer un nouveau tuteur
    @PostMapping
    public Tuteur createTuteur(@RequestBody Tuteur tuteur) {
        return tuteurService.createOrUpdateTuteur(tuteur);
    }

    // Mettre à jour un tuteur existant
    @PutMapping("/{id}")
    public Tuteur updateTuteur(@PathVariable Long id, @RequestBody Tuteur tuteurDetails) {
        Tuteur tuteur = tuteurService.getTuteurById(id);
        if (tuteur != null) {
            tuteur.setModules(tuteurDetails.getModules());
            tuteur.setSeances(tuteurDetails.getSeances());
            return tuteurService.createOrUpdateTuteur(tuteur);
        }
        return null;
    }

    // Supprimer un tuteur
    @DeleteMapping("/{id}")
    public void deleteTuteur(@PathVariable Long id) {
        tuteurService.deleteTuteur(id);
    }
}
