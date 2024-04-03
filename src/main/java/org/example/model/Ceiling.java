package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }
    public PaintColor getColor(){
        return paintedColor;
    }
    public void create(){
        System.out.println("Ceiling has been built.");
    }
}
