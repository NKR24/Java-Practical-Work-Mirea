package num418;

public class Circle extends Shape {
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){}
    public double getRadius(){

        return radius;
    }
    public void setRadius(){

        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

