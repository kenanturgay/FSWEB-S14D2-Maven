package org.example.model;

import org.example.model.enums.PaintColor;


public class Carpet {
    private PaintColor color;
    private int width;
    private int height;


    public Carpet(int width, int height, PaintColor color) {
        this.color = color;

        this.height = height;

        this.width = width;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public PaintColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
