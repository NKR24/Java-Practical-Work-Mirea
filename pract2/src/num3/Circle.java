package num3;

public class Circle
{
    private double R = 0.0;
    private Point P;
    Circle()
    {
        this.P = new Point();
    }
    Circle(double x, double y)
    {
        this.P = new Point(x, y);
    }
    Circle(double x, double y, double r)
    {
        this.P = new Point(x, y);
        this.R = r;
    }
    public double getR()
    {
        return R;
    }
    public void setR()
    {
        this.R = R;
    }
    public void setP(double x, double y, Point P)
    {
        this.P.SetXY(x, y);
        this.P = P;
    }
    public String toString()
    {
        return String.format("Круг {Радиус = %f, %s}", R, P);
    }
}
