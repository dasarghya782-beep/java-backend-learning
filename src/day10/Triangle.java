package day10;

public class Triangle extends Shape{
    private double a,b,c;

    public Triangle(String color,double a, double b, double c){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public boolean isEquilateral(){
        return a == b && b == c;
    }
    @Override
    public double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double perimeter(){
        return a+b+c;
    }

}
