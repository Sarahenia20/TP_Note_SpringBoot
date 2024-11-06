package com.example.demo1.Services;

import com.example.demo1.Entities.Projet;
import com.example.demo1.Repositories.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService implements IProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public Projet saveProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet getProjetById(int id) {
        return projetRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjet(int id) {
        projetRepository.deleteById(id);
    }
}
