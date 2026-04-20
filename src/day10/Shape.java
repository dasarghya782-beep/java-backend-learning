package day10;

public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

    public void printInfo(){
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("----------------------");
    }
}
