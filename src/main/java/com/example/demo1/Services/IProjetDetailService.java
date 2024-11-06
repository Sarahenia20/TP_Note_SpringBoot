package com.example.demo1.Services;

import com.example.demo1.Entities.Projet_Details;

import java.util.List;

public interface IProjetDetailService {
    Projet_Details saveProjetDetail(Projet_Details projetDetail);
    List<Projet_Details> getAllProjetDetails();
    Projet_Details getProjetDetailById(Long id);
    void deleteProjetDetail(Long id);
}
