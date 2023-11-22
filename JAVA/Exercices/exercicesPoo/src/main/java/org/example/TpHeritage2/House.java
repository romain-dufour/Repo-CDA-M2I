package org.example.TpHeritage2;

public class House {
    protected int surface;
    protected Door door;
    public House(int surface, Door door) {
        this.surface = surface;
        this.door = door;
    }
    public int getSurface() {
        return surface;
    }
    public void setSurface(int surface) {
        this.surface = surface;
    }
    public Door getDoor() {
        return door;
    }
    public void setDoor(Door door) {
        this.door = door;
    }

    public void Display () {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m²");
        door.Display();
    }

    public  void GetDoor(){

    }

    public class Door {
        protected String color;

        public Door(String color) {
            this.color = color;
        }
        public void Display () {
            System.out.println("Je suis une porte, ma couleur est " + color);
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    }
}
