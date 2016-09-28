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
public class Transactions extends BasicDBObject {
    @Id
    public String transactionId;
    public String userId;
    public String firstName;
    public String lastName;
    public Integer billingAddress;
    public Integer itemsPurchased;
    public Integer subtotal;
    public Integer shippingTotal;
    public Integer grandTotal;
    
    public Transactions() {
    super();
    }
    
    public Transactions(String transactionId, String userId, String firstName, String lastName,
            Integer billingAddress, Integer itemsPurchased, Integer subtotal, Integer shippingTotal, Integer grandTotal) {
        super();
        this.transactionId = transactionId;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.itemsPurchased = itemsPurchased;
        this.subtotal = subtotal;
        this.shippingTotal = shippingTotal;
        this.grandTotal = grandTotal;
    }
}
