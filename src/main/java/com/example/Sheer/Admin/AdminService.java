package com.example.Sheer.Admin;

import java.util.List;

import com.example.Sheer.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminService {
    

    private final AdminRepository adminRepository ;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    public List<Admin> Getall(){

        return adminRepository.findAll();

    }

    public String Save(Admin admin){

        adminRepository.save(admin);
        return "save";
    }

    public Admin Getbyemail(String email){

        return   adminRepository.findByEmail(email);
    }

}
