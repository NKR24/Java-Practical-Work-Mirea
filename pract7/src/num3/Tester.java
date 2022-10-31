package num3;//параметризированные конструкторы

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,3, 10, 10, 0, 0);
        System.out.println(rectangle.convertToString(12,12));
        rectangle.speedTest();
    }
}
