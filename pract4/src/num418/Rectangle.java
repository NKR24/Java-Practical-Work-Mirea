package num418;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length , String color, boolean filled){}
    public void setRadius(){}
    public void setWidth(){

        this.width = width;
    }
    public double getWidth(){

        return width;
    }
    public void setLength(){this.length = length;}
    public double getLength(){return length;}
    public Rectangle(){}
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
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

