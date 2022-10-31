package num1;

public class MovableCircle extends MovablePoint implements Movable {
    private MovablePoint center;
    MovableCircle(int x,int y, int xSpeed, int ySpeed)
    {
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        System.out.println("x = " + x);
    }

    @Override
    public void moveDown() {
        System.out.println("y = " + y);
    }

    @Override
    public void moveLeft() {
        System.out.println("xSpeed = " + xSpeed);
    }

    @Override
    public void moveRight() {
        System.out.println("ySpeed = " + ySpeed);
    }
    public  String toString()
    {
        return null;
    }
}

