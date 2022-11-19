package com.example.Sheer.Categorie;

import com.example.Sheer.Admin.Admin;
import com.example.Sheer.Don.Don;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id ;

    @Column(name = "CATEGORIE_NAME",length = 50,nullable = false)
    private String nom;

  @OneToMany(mappedBy = "categorie")
   private List<Don> dons;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
