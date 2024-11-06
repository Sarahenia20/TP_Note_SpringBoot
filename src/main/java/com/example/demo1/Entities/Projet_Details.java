package com.example.demo1.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Projet_Details {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String description;
    private String technologie;
    private long cout;
    private  Date datedebut;
    @OneToOne(mappedBy="projetDetail")
    private com.example.demo1.Entities.Projet projet;


}
