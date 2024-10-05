package com.projet.spring.Tutorat.service;

import com.projet.spring.Tutorat.modele.Module;
import com.projet.spring.Tutorat.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules(){
        return moduleRepository.findAll();
    }
    public Module getModuleById(Long id){
        return moduleRepository.findById(id).orElse(null);
    }
    public Module createModule(Module module){
        return moduleRepository.save(module);
    }
    public void deleteModule(Long id){
        moduleRepository.deleteById(id);
    }
}
