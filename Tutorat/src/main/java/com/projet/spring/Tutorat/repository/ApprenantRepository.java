package com.projet.spring.Tutorat.repository;

import com.projet.spring.Tutorat.modele.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
}
