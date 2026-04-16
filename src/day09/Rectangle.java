package day09;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double area(){
        return length*width;
    }
    @Override
    public double perimeter(){
        return 2*(length+width);
    }
    public boolean isSquare(){
        return length==width;
    }
    @Override
    public String toString(){
        return "Rectangle [color=" + getColor() +
                ", area=" + area() +
                ", isSquare=" + isSquare() +
                ", perimeter=" + perimeter() + "]";
    }
}
