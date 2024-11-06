package com.example.demo1.Controllers;

import com.example.demo1.Entities.Equipe;
import com.example.demo1.Services.IEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipe")
public class EquipeController {

    @Autowired
    private IEquipeService equipeService;

    // POST: Create instance
    @PostMapping("/add")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.saveEquipe(equipe);
    }

    // GET: Get all Instances
    @GetMapping("/all")
    public List<Equipe> getAllEquipes() {
        return equipeService.getAllEquipes();
    }

    // GET: Get an Instance by id
    @GetMapping("/{id}")
    public Equipe getEquipeById(@PathVariable int id) {
        return equipeService.getEquipeById(id);
    }

    // DELETE: Delete an Instance
    @DeleteMapping("/{id}")
    public void deleteEquipe(@PathVariable int id) {
        equipeService.deleteEquipe(id);
    }
}
