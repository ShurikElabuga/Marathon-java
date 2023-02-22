package day9.Task2;

public class Circle extends Figure {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return Math.PI * r * 2;
    }
}
