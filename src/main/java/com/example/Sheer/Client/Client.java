package com.example.Sheer.Client;

import javax.persistence.*;

import com.example.Sheer.Admin.Admin;
import com.example.Sheer.Don.Don;
import com.example.Sheer.Role.Role;

import java.util.List;
import java.util.Optional;


@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

 

    @Column(name="CLIENT_NAME", length=50, nullable=false)
    private String nom;

    @Column(name="CLIENT_PRENOM", length=50, nullable=false)
    private String prenom;

    @Column(name="CLIENT_VILLE", length=50, nullable=false)
    private String ville;

    @Column(name="CLIENT_EMAIL", length=50, nullable=false)
    private String email;

    @Column(name="CLIENT_PASSWORD", length=50, nullable=false)
    private String password;

    @Column(name="CLIENT_NUMERO", length=50, nullable=false)
    private String numero;



    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "client")
    private List<Don> dons;







    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

   

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    


    public Client() {
    }


    public Client(String nom, String prenom, String ville, String email, String password, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.email = email;
        this.password = password;
        this.numero = numero;
    }



}
