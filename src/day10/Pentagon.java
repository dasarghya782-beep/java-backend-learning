package day10;

public class Pentagon extends Polygon{
    private double sideLength;

    public Pentagon(String color,double sideLength){
        super(color);
        this.sideLength=sideLength;
    }
    public double getSideLength() {
        return sideLength;
    }

    @Override
    public int getNumberofSides() {
        return 5;
    }

    @Override
    public double area() {
        return (5*sideLength*sideLength)/(4*Math.tan((Math.PI/5)));
    }

    @Override
    public double perimeter() {
        return 5*sideLength;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of sides: " + getNumberofSides());
        System.out.println("----------------------");
    }
}
