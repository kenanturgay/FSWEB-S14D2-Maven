package org.example.model;

public class Bedroom extends Room {
    private String name;


    private Bed bed;

    private Wardrobe wardrobe;


    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, String name, Wardrobe wardrobe , Bed bed) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp, carpet);

        this.name = name;
        this.wardrobe = wardrobe;
        this.bed = bed;



    }

    public void createBedroom(){

        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();

        wardrobe.add();
        bed.make();


        getCarpet().lying();

        getLamp().turnOn();
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", room = " + super.toString()+
                '}';
    }
}
