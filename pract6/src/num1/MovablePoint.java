package num1;

import num1.Movable;

public class MovablePoint implements Movable {
    public int x, y, xSpeed, ySpeed;
    MovablePoint(int x,int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = x;
        this.ySpeed = x;
    }


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

    public String toString()
    {
        return null;
    }
}

