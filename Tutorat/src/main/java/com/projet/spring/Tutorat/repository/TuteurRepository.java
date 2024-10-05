package com.projet.spring.Tutorat.repository;

import com.projet.spring.Tutorat.modele.Tuteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuteurRepository extends JpaRepository<Tuteur, Long>{

}
