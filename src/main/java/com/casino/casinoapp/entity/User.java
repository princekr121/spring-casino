package com.casino.casinoapp.entity;

import jakarta.persistence.*;
import lombok.Data;

//This is bean class
//bean class consist of getter and setter methods
@Data
@Entity
@Table( name = "user_details")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long userId ;
    @Column(name = "username" , nullable = false , unique = true )
    private String username ;
    @Column(name = "name" , nullable = false )
    private String name ;
    @Column( name = "password" , nullable = false )
    private String password ;
    @Column( name ="wallet_amt" , nullable = false )
    private double wallet_amt ;


}
