package com.example.Sheer.Admin;

import java.util.List;

import com.example.Sheer.Client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/admin")
public class AdminController {
    


    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/getall")
    public List<Admin> Getall(){

        return adminService.Getall();
    }


    @PostMapping("/save")
    @ResponseBody
    public String Save(@RequestBody Admin admin){

        return adminService.Save(admin);

    }
    @GetMapping("/chekUser")
    @ResponseBody
    public Boolean ChekUser(@RequestParam(defaultValue = "empty") String email, @RequestParam(defaultValue = "empty") String password ){


        Admin admin = adminService.Getbyemail(email);

        if(admin == null){
            return false ;
        }else if (admin.getPassword().equals(password)){
//clientService.getbyemail(email);
            return true;

        }else {
            return false ;
        }


    }

    @GetMapping("/getbyemail")
    @ResponseBody
    public Admin GetByEmail(@RequestParam(defaultValue = "empty") String email ){

        return adminService.Getbyemail(email);


    }
}
