package day10;

public abstract class Polygon extends Shape{
    public Polygon(String color){
        super(color);
    }

    public abstract int getNumberofSides();

    public void printSideInfo(){
        System.out.println("Number of sides: " + getNumberofSides());
    }
}
