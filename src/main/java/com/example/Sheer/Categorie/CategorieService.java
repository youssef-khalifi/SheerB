package com.example.Sheer.Categorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;


@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;


    @Autowired
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> Getall(){

        return categorieRepository.findAll();
    }

    public void save(Categorie categorie){

        categorieRepository.save(categorie);
    }

}
