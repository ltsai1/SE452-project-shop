/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se452group4.db;

import com.mongodb.BasicDBObject;
import org.springframework.data.annotation.Id;

/**
 *
 * @author duely
 */
public class User extends BasicDBObject{
    
    @Id
    public String userId;
    public String firstName;
    public String lastName;
    public String email;
    public String password; // NeedTo: Hash password
    public String address;
    public String phoneNumber;
    
    public User() {
    super();
    }
    
    public User(String userID, String firstName, String lastName, String email, String password,
            String address, String phoneNumber) {
        super();
        this.userId = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
