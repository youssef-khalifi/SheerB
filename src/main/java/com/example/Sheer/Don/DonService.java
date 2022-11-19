package com.example.Sheer.Don;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.Sheer.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonService {
    

    private final DonRepository donRepository;

    @Autowired
    public DonService(DonRepository donRepository) {
        this.donRepository = donRepository;
    }

    public List<Don> GetAll(){

        return donRepository.findAll();
    }

    public String save(Don don){

         donRepository.save(don);
         return "succes";
    }

    public List<Don> GetbyClient(Long id){

        return  donRepository.getByClientId(id);
    }

    public List<Don> GetbyCtagorie(Long id){

        return  donRepository. getByCategorieId(id);
    }

    public String deletebyid(Long id){

        donRepository.deleteById(id);
        return   "don deleted";
    }




    public Don getdonbyid(Long id){


        return donRepository.getDonById(id) ;
    }

    public boolean updateDon(Long id,  String Name ,String quantite,String condition,String description,String choose) {


        Don dondb = donRepository.getDonById(id);

        // crush the variables of the object found

        int quantit = Integer.parseInt(quantite);
        dondb.setName(Name);
        dondb.setChoix(choose);
        dondb.setDescription(description);
        dondb.setEtat(condition);

        dondb.setQuantite(quantit);

        donRepository.save(dondb);

        return true;
    }

}
