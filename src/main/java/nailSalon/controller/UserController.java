package nailSalon.controller;

import nailSalon.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/nailsalon")
public class UserController {
   private UserService userService;

   public UserController(UserService userService){
       this.userService = userService;
   }

    @GetMapping
    public String getAllUsers(){
        return "index";
    }

    @PostMapping
    public void createUser(){

    }

    @PatchMapping
    public void updateUser(){
    }

    @DeleteMapping
    public void deleteUser(){

    }

}
