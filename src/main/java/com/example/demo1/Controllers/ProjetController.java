package com.example.demo1.Controllers;

import com.example.demo1.Entities.Projet;
import com.example.demo1.Services.IProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projet")
public class ProjetController {

    @Autowired
    private IProjetService projetService;

    // POST: Create instance
    @PostMapping("/add")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    // GET: Get all Instances
    @GetMapping("/all")
    public List<Projet> getAllProjets() {
        return projetService.getAllProjets();
    }

    // GET: Get an Instance by id
    @GetMapping("/{id}")
    public Projet getProjetById(@PathVariable int id) {
        return projetService.getProjetById(id);
    }

    // DELETE: Delete an Instance
    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable int id) {
        projetService.deleteProjet(id);
    }
}
