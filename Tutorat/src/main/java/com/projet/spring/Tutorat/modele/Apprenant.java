package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;

    public Apprenant(){
    }
    public Apprenant(Long id, String nom, String prenom, Groupe groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }


}
