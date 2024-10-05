package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.AgentSuivi;
import com.projet.spring.Tutorat.repository.AgentSuiviRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentSuiviService {
    @Autowired
    private AgentSuiviRepository agentSuiviRepository;

    public List<AgentSuivi> getAllAgentsSuivi() {
        return agentSuiviRepository.findAll();
    }
    public AgentSuivi getAgentSuiviById(Long id) {
        return agentSuiviRepository.findById(id).orElse(null);
    }

    // Créer ou mettre à jour un agent de suivi
    public AgentSuivi createOrUpdateAgentSuivi(AgentSuivi agentSuivi) {
        return agentSuiviRepository.save(agentSuivi);
    }

    // Supprimer un agent de suivi par ID
    public void deleteAgentSuivi(Long id) {
        agentSuiviRepository.deleteById(id);
    }
}
