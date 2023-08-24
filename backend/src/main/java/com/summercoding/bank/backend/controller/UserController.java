package com.summercoding.bank.backend.controller;

import com.summercoding.bank.backend.Business.UserManager;
import com.summercoding.bank.backend.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/bank/user")
public class UserController {
 @Autowired
    UserManager userManager;

    @GetMapping(path = "/id/{id}")

    public User getOne(@PathVariable(value = "id")Long userId){
        return userManager.getUserById(userId);

    }
    @PostMapping(path = "/save")

    public ResponseEntity saveUser(@RequestBody User user){
        userManager.saveUser(user.getLogin(),user.getPassword(),user.getNom(),user.getDateNaiss());
        return new ResponseEntity("SUCCESS", HttpStatus.OK);

    }

}
