package num1;//круги и 2 класса

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(12,14,235,463);
        MovableCircle circle = new MovableCircle(41,25,4,23);
        System.out.println("MovableCircle:");
        circle.moveUp();
        circle.moveDown();
        circle.moveLeft();
        circle.moveRight();
        System.out.println("\n" + "MovablePoint:");
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

    }
}

