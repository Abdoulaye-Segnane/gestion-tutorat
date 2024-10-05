package com.projet.spring.Tutorat.controller;

import com.projet.spring.Tutorat.modele.Apprenant;
import com.projet.spring.Tutorat.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprenants")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;

    @GetMapping
    public List<Apprenant> getAllApprenants() {
        return apprenantService.getAllApprenants();
    }

    @GetMapping("/{id}")
    public Apprenant getApprenantById(@PathVariable Long id) {
        return apprenantService.getApprenantById(id);
    }

    @PostMapping
    public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
        return apprenantService.createApprenant(apprenant);
    }

    @DeleteMapping("/{id}")
    public void deleteApprenant(@PathVariable Long id) {
        apprenantService.deleteApprenant(id);
    }
}
