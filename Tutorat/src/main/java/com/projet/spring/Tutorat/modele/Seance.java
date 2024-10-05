package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private StatutSeance statuts;
    private int nbreheure;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;
    @ManyToOne
    @JoinColumn(name = "tuteur_id")
    private Tuteur tuteur;
    @OneToOne
    @JoinColumn(name = "seance")
    private Rapport rapport;
    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

    public Seance(){
    }

    public Seance(long id, Date date, StatutSeance statuts, int nbreheure, Module module, Tuteur tuteur, Rapport rapport, Groupe groupe) {
        this.id = id;
        this.date = date;
        this.statuts = statuts;
        this.nbreheure = nbreheure;
        this.module = module;
        this.tuteur = tuteur;
        this.rapport = rapport;
        this.groupe = groupe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatutSeance getStatuts() {
        return statuts;
    }

    public void setStatuts(StatutSeance statuts) {
        this.statuts = statuts;
    }

    public int getNbreheure() {
        return nbreheure;
    }

    public void setNbreheure(int nbreheure) {
        this.nbreheure = nbreheure;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public User getTuteur() {
        return tuteur;
    }

    public void setTuteur(User user) {
        this.tuteur = tuteur;
    }

    public Rapport getRapport() {
        return rapport;
    }

    public void setRapport(Rapport rapport) {
        this.rapport = rapport;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe() {
        this.groupe = groupe;
    }


}
