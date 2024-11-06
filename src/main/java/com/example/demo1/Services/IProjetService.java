package com.example.demo1.Services;

import com.example.demo1.Entities.Projet;

import java.util.List;

public interface IProjetService {
    Projet saveProjet(Projet projet);
    List<Projet> getAllProjets();
    Projet getProjetById(int id);
    void deleteProjet(int id);
}
