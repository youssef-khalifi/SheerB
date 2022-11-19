package com.example.Sheer.Client;

import java.util.List;
import java.util.Optional;


import com.example.Sheer.Don.Don;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController
@RequestMapping("api/v1/client")
public class ClientController {
    
private final ClientService  clientService;

   @Autowired
    public ClientController(ClientService clientService) {
    this.clientService = clientService;
}


    @GetMapping("/getall")
    public List<Client> get(){

       return clientService.GetAll();

    }

    @GetMapping("/getbyid")
    public Optional<Client> getbyid(@RequestParam Long id){

  
       return clientService.getbyid(id);

    }

    // get client by email

    @GetMapping("/chekUser")
    @ResponseBody
    public Boolean ChekUser(@RequestParam(defaultValue = "empty") String email, @RequestParam(defaultValue = "empty") String password ){

    Client client =  clientService.getbyemail(email);

    if(client == null){
        return false ;
    }else if (client.getPassword().equals(password)){
//clientService.getbyemail(email);
        return true;

    }else {
        return false ;
    }


    }

    //get user by email

    @GetMapping("/getbyemail")
    @ResponseBody
    public Client GetByEmail(@RequestParam(defaultValue = "empty") String email ){

        return clientService.getbyemail(email);


    }



    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody Client client){



         clientService.AddClient(client);
        return "test";
    }

    @DeleteMapping("/deletebyid")
   public  String deletebyid(@RequestParam Long id) {
   return  clientService.deletebyid(id);
    }


    @PostMapping("/updateClient")
    @ResponseBody
    public boolean updateUser(@RequestParam Long id,@RequestParam String numero,@RequestParam String ville
            ,@RequestParam String password ,@RequestParam String email) {


         if (clientService.updateUser(id, numero, ville, password ,email)){
        return true;
         }else{
             return false;
 }


    }


}
