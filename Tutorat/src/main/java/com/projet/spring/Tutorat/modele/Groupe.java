package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "groupe")
    private List<Apprenant> apprenants;
    @OneToMany(mappedBy = "groupe")
    private List<Seance> seances;
    @ManyToMany
    @JoinTable(
            name = "groupe_module",
            joinColumns = @JoinColumn(name = "groupe_id"),
            inverseJoinColumns = @JoinColumn(name = "module_id")
    )
    private List<Module> modules;

    public Groupe(){
    }
    public Groupe(Long id, String nom, List<Apprenant> apprenants, List<Seance> seances, List<Module> modules) {
        this.id = id;
        this.nom = nom;
        this.apprenants = apprenants;
        this.seances = seances;
        this.modules = modules;
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

    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }




}
