package org.example.model;

public class Wardrobe {
    private int width;
    private double weight;
    private int height;


    public Wardrobe(int width, int height, double weight) {
        this.width = width;

        this.height = height;

        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
