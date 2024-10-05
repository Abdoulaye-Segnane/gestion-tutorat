package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AgentSuivi extends User{
    @OneToMany(mappedBy = "agentSuivi")
    private List<Rapport> rapport;

    public AgentSuivi(){
    }

    public AgentSuivi(long id, String firstName, String lastName, String mail, String password, Role role, List<Rapport> rapport) {
        super(id, firstName, lastName, mail, password, role);
        this.rapport = rapport;
    }

    public List<Rapport> getRapport() {
        return rapport;
    }

    public void setRapport(List<Rapport> rapport) {
        this.rapport = rapport;
    }



}
