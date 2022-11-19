package com.example.Sheer.Role;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    
private final RoleService roleService;

@Autowired
public RoleController(RoleService roleService) {
    this.roleService = roleService;
}

@GetMapping("/getall")
public List<Role> Getall(){

    return roleService.Getall();
    
}

@PostMapping("/save")
public String Save(@RequestBody Role role){

    roleService.Addrole(role);
    return "add succes";
}

@DeleteMapping("/delete")
public String deleteOrder(@PathVariable(value = "id") Long id) {
     
    roleService.delete(id);
     return "delete good";
}

@GetMapping("/getbyid")
public Optional<Role> getbyId(@RequestParam Long id){

  return  roleService.Getbyid(id);
}

}


