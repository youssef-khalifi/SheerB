package com.example.Sheer.Don;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.Sheer.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/v1/don")
public class DonController {


    private final DonService donService ;

    @Autowired
    public DonController(DonService donService) {
        this.donService = donService;
    }


    @GetMapping("/getall")
    public List<Don> GetAll(){

        return donService.GetAll();
    }


    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody Don don){

        
        return donService.save(don);
        
    }

    @GetMapping("/getbyclient")
    public List<Don> GetbyClient(@RequestParam Long  id){

        return  donService.GetbyClient(id);
    }

    @GetMapping("/getbycategorie")
    public List<Don> GetbyCategorie(@RequestParam Long  id){

        return  donService.GetbyCtagorie(id);
    }

    @GetMapping("/getbyid")
    public Don getbyid(@RequestParam Long id){


        return donService.getdonbyid(id);

    }

    @DeleteMapping("/deletebyid")
    public  String deletebyid(@RequestParam Long id) {
        return  donService.deletebyid(id);
    }


    @PostMapping("/updateDon")
    @ResponseBody
    public boolean updateDon(@RequestParam Long id,@RequestParam String Name,@RequestParam String quantite,
                             @RequestParam String condition,@RequestParam String choose,@RequestParam String description) {


        if (donService.updateDon(id,Name,quantite,condition,description,choose)){
            return true;
        }else{
            return false;
        }


    }
}
