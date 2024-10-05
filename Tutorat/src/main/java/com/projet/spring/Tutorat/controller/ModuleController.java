package com.projet.spring.Tutorat.controller;

import com.projet.spring.Tutorat.modele.Module;
import com.projet.spring.Tutorat.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/modules")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    @GetMapping
    public List<Module> getAllModules(){
        return moduleService.getAllModules();
    }
    @GetMapping("/{id}")
    public Module getModuleById(@PathVariable Long id){
        return moduleService.getModuleById(id);
    }
    @PostMapping("/modules")
    public Module createModule(@RequestBody Module module){
        return moduleService.createModule(module);
    }
    @DeleteMapping("/{id}")
    public void deleteModule(Long id){
        moduleService.deleteModule(id);
    }


}

