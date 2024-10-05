package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int duree;
    @ManyToMany(mappedBy = "modules")
    private List<Tuteur> tuteurs;
    @OneToMany(mappedBy= "module")
    private List<Seance> seances;
    @ManyToMany(mappedBy = "modules")
    private List<Groupe> groupes;

    public Module(){
    }

    public Module(Long id, String nom, int duree, List<Tuteur> tuteurs, List<Seance> seances, List<Groupe> groupes) {
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.tuteurs = tuteurs;
        this.seances = seances;
        this.groupes = groupes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public List<Tuteur> getTuteurs() {
        return tuteurs;
    }

    public void setTuteurs(List<Tuteur> tuteurs) {
        this.tuteurs = tuteurs;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }






}