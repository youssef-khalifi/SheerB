package com.example.Sheer.Admin;

import com.example.Sheer.Client.Client;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {


    @Query("SELECT c FROM Admin c WHERE c.email =? ")
    Admin findByEmail(String email);
}
