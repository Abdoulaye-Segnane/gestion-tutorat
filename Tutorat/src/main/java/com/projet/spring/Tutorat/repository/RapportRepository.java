package com.projet.spring.Tutorat.repository;

import com.projet.spring.Tutorat.modele.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepository extends JpaRepository<Rapport, Long> {
}
