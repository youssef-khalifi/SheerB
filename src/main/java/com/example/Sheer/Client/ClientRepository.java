package com.example.Sheer.Client;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository  extends JpaRepository<Client,Long>{
    

    @Query("SELECT c FROM Client c WHERE c.email =? ")
    Client findByEmail(String email);

    @Query("SELECT c FROM Client c WHERE c.id =? ")
    Client getById(Long id);

}
