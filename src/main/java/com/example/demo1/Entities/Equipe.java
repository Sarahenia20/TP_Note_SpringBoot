package com.example.demo1.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    @Enumerated(EnumType.STRING)  // This annotation will store the enum as a string
    private Domaine domaine;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;
}
