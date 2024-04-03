package org.example.model;

public class Wall {
 public String direction;

    public String getDirection() {
        return direction;
    }

    public Wall(String direction) {
        this.direction = direction;
    }
    public void create(){
        System.out.println("Wall has been built.");
    }
}
