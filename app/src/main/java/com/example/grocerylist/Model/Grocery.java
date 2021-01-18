package com.example.grocerylist.Model;

public class Grocery {

    private String name;
    private String quantity;
    private String dateTimeAdded;
    private int id;

    public Grocery(){

    }

    public Grocery(String name, String quantity, String dateTimeAdded, int id) {
        this.name = name;
        this.quantity = quantity;
        this.dateTimeAdded = dateTimeAdded;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDateTimeAdded() {
        return dateTimeAdded;
    }

    public void setDateTimeAdded(String dateTimeAdded) {
        this.dateTimeAdded = dateTimeAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
