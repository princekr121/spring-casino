package com.casino.casinoapp.service;

import com.casino.casinoapp.entity.User;

import java.util.List;

public interface UserService {

     User saveUser( User user ) ;
     List<User> getAllUsers() ;
    User getUserById(long id ) ;

    public void deleteUserById( long id ) ;

}
