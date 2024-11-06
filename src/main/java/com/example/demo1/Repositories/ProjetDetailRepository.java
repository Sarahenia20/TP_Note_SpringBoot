package com.example.demo1.Repositories;

import com.example.demo1.Entities.Projet_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetDetailRepository extends JpaRepository<Projet_Details, Long> {
}
