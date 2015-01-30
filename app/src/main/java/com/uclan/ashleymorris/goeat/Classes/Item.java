package com.uclan.ashleymorris.goeat.Classes;


/**
 * Created by Ashley Morris on 29/01/2015.
 *
 * A class that holds the JSON data that has been retrieved using GSON
 * To be displayed in a ListView.
 *
 */
public class Item {

    private String name;
    private Float price;
    private String description;

    public Item(){

    }

    public Item(String name, Float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
