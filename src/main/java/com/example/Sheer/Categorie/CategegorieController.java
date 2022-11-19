package com.example.Sheer.Categorie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/categorie")
public class CategegorieController {


    private final CategorieService categorieService;

    @Autowired
    public CategegorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping("/getall")
    public List<Categorie> Getall(){

        return categorieService.Getall();

    }

    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody Categorie categorie){

        categorieService.save(categorie);

        return "save success";

    }

}
