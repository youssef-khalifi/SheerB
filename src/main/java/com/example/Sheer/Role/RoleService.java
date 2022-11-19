package com.example.Sheer.Role;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    


    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }



    public void Addrole(Role role){

        roleRepository.save(role) ;
    }


    public List<Role> Getall(){
        return roleRepository.findAll();
        
    }

    public Optional<Role> Getbyid(Long id){

       return  roleRepository.findById(id);

    }

    public void delete(long id){

        roleRepository.deleteById(id);
    }
}
