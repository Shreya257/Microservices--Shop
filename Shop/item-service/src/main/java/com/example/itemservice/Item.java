package com.example.itemservice;
public class Item {
    private final int id;
    private final String name;

    public Item(final int id,  final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
