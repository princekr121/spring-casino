package com.casino.casinoapp.service.impl;

import com.casino.casinoapp.entity.User;
import com.casino.casinoapp.exception.ResourceNotFoundException;
import com.casino.casinoapp.repository.UserRepository;
import com.casino.casinoapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository ;
    public UserServiceImpl( UserRepository userRepository ){
        super();
        this.userRepository = userRepository ;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save( user ) ;

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll() ;
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById( id ).orElseThrow(() -> new ResourceNotFoundException("User" , "Id" , id )) ;

    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById( id ) ;
    }
}
