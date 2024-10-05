package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.Seance;
import com.projet.spring.Tutorat.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeanceService {
    @Autowired
    private SeanceRepository seanceRepository;

    public List<Seance> getAllSeances(){
        return seanceRepository.findAll();
    }
    public Seance getSeanceById(Long id){
        return seanceRepository.findById(id).orElse(null);
    }
    public Seance createSeance(Seance seance){
        return seanceRepository.save(seance);
    }
    public void deleteSeance(Long id){
        seanceRepository.deleteById(id);
    }

}