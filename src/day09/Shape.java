package day09;

public class Shape {
    private String color;

    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
    public void printInfo(){
        System.out.println("Color: "+ color);
        System.out.println("Area: "+ area());
        System.out.println("Perimeter: "+ perimeter());
    }
    @Override
    public String toString(){
        return "Shape [color=" + color +
                ", area=" + area() +
                ", perimeter=" + perimeter() + "]";
    }
}
