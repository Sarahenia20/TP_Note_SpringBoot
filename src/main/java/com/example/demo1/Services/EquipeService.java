package com.example.demo1.Services;

import com.example.demo1.Entities.Equipe;
import com.example.demo1.Repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService implements IEquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public Equipe saveEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(int id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipe(int id) {
        equipeRepository.deleteById(id);
    }
}
