package com.casino.casinoapp.controller;

import com.casino.casinoapp.entity.User;
import com.casino.casinoapp.service.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService ;

    public UserController( UserService userService ){
        super();
        this.userService = userService ;
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user ){

        //return userService.saveUser( user ) ;
        return new ResponseEntity<User>( userService.saveUser( user) , HttpStatus.CREATED ) ;

    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers() ;
    }




}
