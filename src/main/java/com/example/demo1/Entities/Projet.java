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
public class Projet {
    @Id
    private String id;
    private String sujet;
    @OneToOne
    private Projet_Details projetDetail;
    @ManyToMany(mappedBy="projets", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

}