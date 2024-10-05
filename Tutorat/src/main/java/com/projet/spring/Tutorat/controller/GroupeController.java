package com.projet.spring.Tutorat.controller;

import com.projet.spring.Tutorat.modele.Groupe;
import com.projet.spring.Tutorat.service.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/groupe")
public class GroupeController {
    @Autowired
    private GroupeService groupeService;

    @GetMapping
    public List<Groupe> getAllGroupes() {
        return groupeService.getAllGroupes();
    }

    @GetMapping("/{id}")
    public Groupe getGroupeById(@PathVariable Long id) {
        return groupeService.getGroupeById(id);
    }

    @PostMapping
    public Groupe createGroupe(@RequestBody Groupe groupe) {
        return groupeService.createGroupe(groupe);
    }

    @DeleteMapping("/{id}")
    public void deleteGroupe(@PathVariable Long id) {
        groupeService.deleteGroupe(id);
    }
}
