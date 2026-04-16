package day09;

public class Circle extends Shape {
    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area(){
        return 3.14*radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*3.14*radius;
    }
    @Override
    public String toString(){
        return "Circle [color=" + getColor() +
                ", area=" + area() +
                ", perimeter=" + perimeter() + "]";
    }
}
