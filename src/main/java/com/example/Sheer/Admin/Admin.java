package com.example.Sheer.Admin;

import com.example.Sheer.Don.Don;
import com.example.Sheer.Role.Role;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="admin")
public class Admin {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

 

    @Column(name="ADMIN_NAME", length=50, nullable=false)
    private String nom;

    @Column(name="ADMIN_PRENOM", length=50, nullable=false)
    private String prenom;

    @Column(name="ADMIN_VILLE", length=50, nullable=false)
    private String ville;

    @Column(name="ADMIN_EMAIL", length=50, nullable=false)
    private String email;

    @Column(name="ADMIN_PASSWORD", length=50, nullable=false)
    private String password;

    @Column(name="ADMIN_NUMERO", length=50, nullable=false)
    private String numero;

    @ManyToOne
    private Role rolee;

    @OneToMany(mappedBy = "admin")
    private List<Don> dons;

    public Role getRole() {
        return rolee;
    }

    public void setRole(Role role) {
        this.rolee = role;
    }

    public Admin() {
    }

    public Admin(String nom, String prenom, String ville, String email, String password, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.email = email;
        this.password = password;
        this.numero = numero;
    }

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    
}
