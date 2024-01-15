package com.booleanuk.core;

public class Bagel {
    private String type;
    private int cost;

    public Bagel(String type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}
