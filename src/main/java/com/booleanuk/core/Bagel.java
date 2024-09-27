package com.booleanuk.core;

public class Bagel {
    private String type;
    private int cost;
    private int ID;

    public Bagel(String type, int cost, int productID) {
        this.type = type;
        this.cost = cost;
        this.ID = productID;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}
