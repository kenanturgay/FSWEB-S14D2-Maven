package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Lamp lamp = new Lamp(LampType.NEON, true, 100);

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);

        Bed bed = new Bed("doble", 2, 2, 2, 3);

        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");
        Wall[] walls = new Wall[]{northWall, eastWall, southWall, westWall};


        Bedroom bedroom = new Bedroom(northWall, eastWall, westWall, southWall, ceiling, lamp, new Carpet(3, 4, PaintColor.RED), "bedroom", new Wardrobe(1, 2, 50), bed);
        bedroom.createBedroom();


    }
}