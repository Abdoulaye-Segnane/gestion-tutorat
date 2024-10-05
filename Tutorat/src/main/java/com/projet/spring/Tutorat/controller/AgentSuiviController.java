package com.projet.spring.Tutorat.controller;

import com.projet.spring.Tutorat.modele.AgentSuivi;
import com.projet.spring.Tutorat.service.AgentSuiviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api.agentsuivi")
public class AgentSuiviController{
    @Autowired
    private AgentSuiviService agentSuiviService;

    // Récupérer tous les agents de suivi
    @GetMapping
    public List<AgentSuivi> getAllAgentsSuivi() {
        return agentSuiviService.getAllAgentsSuivi();
    }

    // Récupérer un agent de suivi par ID
    @GetMapping("/{id}")
    public ResponseEntity<AgentSuivi> getAgentSuiviById(@PathVariable Long id) {
        AgentSuivi agent = agentSuiviService.getAgentSuiviById(id);
        return agent != null ? new ResponseEntity<>(agent, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Créer un nouvel agent de suivi
    @PostMapping
    public ResponseEntity<AgentSuivi> createAgentSuivi(@RequestBody AgentSuivi agentSuivi) {
        try {
            AgentSuivi newAgent = agentSuiviService.createOrUpdateAgentSuivi(agentSuivi);
            return new ResponseEntity<>(newAgent, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Mettre à jour un agent de suivi existant
    @PutMapping("/{id}")
    public ResponseEntity<AgentSuivi> updateAgentSuivi(@PathVariable Long id, @RequestBody AgentSuivi agentDetails) {
        AgentSuivi agent = agentSuiviService.getAgentSuiviById(id);
        if (agent != null) {
            agent.setRapport(agentDetails.getRapport());
            AgentSuivi updatedAgent = agentSuiviService.createOrUpdateAgentSuivi(agent);
            return new ResponseEntity<>(updatedAgent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Supprimer un agent de suivi
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAgentSuivi(@PathVariable Long id) {
        try {
            agentSuiviService.deleteAgentSuivi(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
