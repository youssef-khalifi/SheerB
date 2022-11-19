package com.example.Sheer.Client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;

    }



    public List<Client> GetAll(){

        return clientRepository.findAll();
    }

    public void  AddClient(Client client){

        clientRepository.save(client);
        
    }

    public Optional<Client> getbyid(Long id){

        return clientRepository.findById(id);


    }

    public String deletebyid(Long id){

        clientRepository.deleteById(id);
        return   "client deleted";
      }


      public Client getbyemail(String email){

        return   clientRepository.findByEmail(email);
      }



    public boolean updateUser(Long id, String Numero, String ville, String password ,String email) {


            Client clientdb = clientRepository.getById(id);

        // crush the variables of the object found
        clientdb.setNumero(Numero);
        clientdb.setVille(ville);
        clientdb.setPassword(password);
        clientdb.setEmail(email);
        clientRepository.save(clientdb);

        return true;
    }



    
}
