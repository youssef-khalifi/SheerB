package com.example.Sheer.Role;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.example.Sheer.Admin.Admin;
import com.example.Sheer.Client.Client;

@Entity
@Table(name = "role")
public class Role {
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "ROLE_NAME" , length = 50,nullable = false)
    private String name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "role")
    private List<Client> clients;

    @OneToMany(mappedBy = "rolee")
    private List<Admin> admins;
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
    }

    

    public Role(Long i, String name) {
        this.id = i;
        this.name = name;
    }

    public Role(String name) {
        this.name = name;
    }


    

}
