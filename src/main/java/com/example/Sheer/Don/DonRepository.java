package com.example.Sheer.Don;

import com.example.Sheer.Client.Client;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonRepository  extends JpaRepository<Don,Long> {


    @Query("SELECT * FROM Don  WHERE client_id =? ")
    List<Don> getByClientId(Long id);

    @Query("SELECT * FROM Don  WHERE categorie_id =? ")
    List<Don> getByCategorieId(Long id);


    @Query("SELECT d FROM Don d WHERE id =? ")
    Don getDonById(Long id);


}
