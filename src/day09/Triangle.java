package day09;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color,double sideA,double sideB,double sideC){
        super(color);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    @Override
    public double area(){
        double s=(sideA+sideB+sideC)/2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    @Override
    public double perimeter(){
        return sideA+sideB+sideC;
    }
    public boolean isEquilateral(){
        double epsilon = 0.0001;
        return Math.abs(sideA - sideB) < epsilon && Math.abs(sideB - sideC) < epsilon;
    }
    @Override
    public String toString(){
        return "Triangle [color=" + getColor() +
                ", area=" + area() +
                ", isEquilateral=" + isEquilateral() +
                ", perimeter=" + perimeter() + "]";
    }
}
