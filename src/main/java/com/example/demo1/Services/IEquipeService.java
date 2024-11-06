package com.example.demo1.Services;

import com.example.demo1.Entities.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe saveEquipe(Equipe equipe);
    List<Equipe> getAllEquipes();
    Equipe getEquipeById(int id);
    void deleteEquipe(int id);
}
