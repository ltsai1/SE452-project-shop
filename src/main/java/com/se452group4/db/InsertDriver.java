/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se452group4.db;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import static org.springframework.core.convert.TypeDescriptor.collection;

/**
 *
 * @author Camille
 */
public class InsertDriver {
    public static void main(String[] args) throws UnknownHostException{
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db  = mongoClient.getDB("Shop");
        DBCollection clothCollection = db.getCollection("Clothes");
        BasicDBObject cloth1 = new BasicDBObject();
        cloth1.put("clothesId", 1000);
        cloth1.put("type", "Dress");
        cloth1.put("brandName", "Zara");
        cloth1.put("price", 100);
        cloth1.put("gender", "Women");
        cloth1.put("quantity", 5);
        clothCollection.insert(cloth1);
        
        
        
        DBCursor clothCursor = clothCollection.find(cloth1);
        while(clothCursor.hasNext()){
            System.out.println(clothCursor.next());
        }
    }
    
}
