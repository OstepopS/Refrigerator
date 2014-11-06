package com.example.caspergron.myapplication;

import java.util.Date;

/**
 * Created by CasperGron on 11/6/2014.
 */
public class ItemListRefrigerator {
    private int id;
    private String name;
    private String amount;
    private Date expiration;

    public ItemListRefrigerator(){}

    public ItemListRefrigerator(String name, String amount){
        super();
        this.name = name;
        this.amount = amount;
    }
    public String ToString(){
        return "ItemListRefrigerator [id=" + id + ",name=" + ", amount=" + ", expiration" + "]";
    }
}

