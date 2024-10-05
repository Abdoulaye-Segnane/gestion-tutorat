package com.projet.spring.Tutorat.modele;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tuteur extends User{
    @ManyToMany
    @JoinTable(
            name = "tuteur_module",
            joinColumns = @JoinColumn(name = "tuteur_id"),
            inverseJoinColumns = @JoinColumn(name = "module_id")
    )
    private List<Module> modules;

    @OneToMany(mappedBy = "tuteur")
    private List<Seance> seances;

    public Tuteur(){
        super();
    }

    public Tuteur(long id, String firstName, String lastName, String mail, String password, Role role, List<Module> modules, List<Seance> seances) {
        super(id, firstName, lastName, mail, password, role);
        this.modules = modules;
        this.seances = seances;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }


}
