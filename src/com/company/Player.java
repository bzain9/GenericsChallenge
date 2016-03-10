package com.company;

/**
 * Created by admin on 3/9/2016.
 */
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
