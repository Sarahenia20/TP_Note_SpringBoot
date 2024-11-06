package com.example.demo1.Services;

import com.example.demo1.Entities.Projet_Details;
import com.example.demo1.Repositories.ProjetDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetDetailService implements IProjetDetailService {

    @Autowired
    private ProjetDetailRepository projetDetailRepository;

    @Override
    public Projet_Details saveProjetDetail(Projet_Details projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<Projet_Details> getAllProjetDetails() {
        return projetDetailRepository.findAll();
    }

    @Override
    public Projet_Details getProjetDetailById(Long id) {
        return projetDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjetDetail(Long id) {
        projetDetailRepository.deleteById(id);
    }
}
