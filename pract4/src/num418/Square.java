package num418;

public class Square extends Rectangle{
    protected double side;
    public Square(){
    }
    public Square(double side){this.side = side;}
    public Square(double side, String color, boolean filled){}
    public double getSide(){
        return 0;
    }
    public void setSide(){}
    public void setWidth(){}
    public void setLength(){}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

