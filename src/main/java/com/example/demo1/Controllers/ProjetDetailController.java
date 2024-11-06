package com.example.demo1.Controllers;

import com.example.demo1.Entities.Projet_Details;
import com.example.demo1.Services.IProjetDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projet-detail")
public class ProjetDetailController {

    @Autowired
    private IProjetDetailService projetDetailService;

    // POST: Create instance
    @PostMapping("/add")
    public Projet_Details addProjetDetail(@RequestBody Projet_Details projetDetail) {
        return projetDetailService.saveProjetDetail(projetDetail);
    }

    // GET: Get all Instances
    @GetMapping("/all")
    public List<Projet_Details> getAllProjetDetails() {
        return projetDetailService.getAllProjetDetails();
    }

    // GET: Get an Instance by id
    @GetMapping("/{id}")
    public Projet_Details getProjetDetailById(@PathVariable Long id) {
        return projetDetailService.getProjetDetailById(id);
    }

    // DELETE: Delete an Instance
    @DeleteMapping("/{id}")
    public void deleteProjetDetail(@PathVariable Long id) {
        projetDetailService.deleteProjetDetail(id);
    }
}
