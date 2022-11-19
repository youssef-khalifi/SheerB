package com.example.Sheer.Don;


import com.example.Sheer.Admin.Admin;
import com.example.Sheer.Categorie.Categorie;
import com.example.Sheer.Client.Client;
import com.example.Sheer.Role.Role;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "don")
public class Don {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "DON_NAME",length = 50,nullable = false)
    private String name;

    @Column(name = "DON_ETAT",length = 50,nullable = false)
    private String etat ;

    @Column(name = "DON_QUANTITE",nullable = false)
    private int quantite;

    @Column(name = "DON_DESCRIPTION",length = 50,nullable = false)
    private String description;

    @Column(name = "DON_CHOIX",length = 50,nullable = false)
    private String choix;

    @Column(name = "DON_DATE",length = 50,nullable = false)
    String publicationDate;

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    @Column(name = "DON_IMAGE",length = 50,nullable = false)
    private String image;

    @ManyToOne
    private Categorie categorie;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Admin admin;


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

  
   



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  

    

}
