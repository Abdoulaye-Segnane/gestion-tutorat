package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private Date date;
    @OneToOne
    @JoinColumn(name = "seance_id")
    private Seance seance;
    @ManyToOne
    @JoinColumn(name = "agentSuivi_id")
    private AgentSuivi agentSuivi;

    public Rapport(){
    }

    public Rapport(int id, String nom, Date date, Seance seance, AgentSuivi agentSuivi) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.seance = seance;
        this.agentSuivi = agentSuivi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public AgentSuivi getAgentSuivi() {
        return agentSuivi;
    }

    public void setAgentSuivi(AgentSuivi agentSuivi) {
        this.agentSuivi = agentSuivi;
    }



}
