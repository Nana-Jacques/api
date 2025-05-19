package com.openclassrooms.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // inutile d'ajouter les getters et les setters
@Entity // indique que la classe correspond à une table de la BD
@Table(name = "employees") // indique le nom de la table assoicé
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name") // Pour indique le nom du champ correspondant en bd
    private String lastName;

    private String mail;

    private String password;

}
