package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.Groupe;
import com.projet.spring.Tutorat.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {
    @Autowired
    private GroupeRepository groupeRepository;

    public List<Groupe> getAllGroupes() {
        return groupeRepository.findAll();
    }

    public Groupe getGroupeById(Long id) {
        return groupeRepository.findById(id).orElse(null);
    }

    public Groupe createGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    public void deleteGroupe(Long id) {
        groupeRepository.deleteById(id);
    }
}
