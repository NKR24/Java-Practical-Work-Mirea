package num418;

public  abstract class Shape{
    protected String color;
    protected boolean filled;
    public Shape(){
        this.filled = filled;
        this.color = color;
    }
    public Shape(String color, boolean filled){};
    public  String getColor(){
        return color;
    }

    public void setColor() {

    }

    public  boolean isFilled(){
        return filled;
    }
    public  void setFilled(boolean filled){

    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    protected void print() {
    }
}

