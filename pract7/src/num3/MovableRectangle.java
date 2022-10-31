package num3;

public class MovableRectangle extends MovablePoint implements Movable {
    private int topLeft;
    private int bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, int topLeft, int bottomRight) {
        super(x, y, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void speedTest(){
        if (xSpeed == ySpeed){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public String convertToString(int topLeft, int bottomRight){
        String str1 = new Integer(topLeft).toString();
        String str2 = new Integer(topLeft).toString();
        return "topLeft: "+str1 + " topRight: " + str2;
    }

    @Override
    public String toString() {
        return "MovaibleRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
