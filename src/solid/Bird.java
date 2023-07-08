package solid;

import solid.enums.Color;

public abstract class Bird {
    private int wings;
    private int legs;
    private Color color;

    public void eat(){
        System.out.println("Eat like a bird");
    }

    public int getWings() {
        return wings;
    }

    public Bird setWings(int wings) {
        this.wings = wings;
        return this;
    }

    public int getLegs() {
        return legs;
    }

    public Bird setLegs(int legs) {
        this.legs = legs;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Bird setColor(Color color) {
        this.color = color;
        return this;
    }
}
