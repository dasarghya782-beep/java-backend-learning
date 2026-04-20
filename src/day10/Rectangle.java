package day10;

public class Rectangle extends Shape {
    private double length,width;

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
    public boolean isSquare(){
        return length==width;
    }
    @Override
    public double area(){
        return length*width;
    }
    @Override
    public double perimeter(){
        return 2*(length+width);
    }

}
