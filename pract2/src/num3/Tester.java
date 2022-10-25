package num3;

import java.util.*;
public class Tester
{
    public static void main(String[] args)
    {
        int length = 3;
        Random random = new Random();
        List <Circle> circles = new ArrayList<Circle>();
        for (int i = 0; i < length; i++)
            circles.add(new Circle(random.nextDouble(100), random.nextDouble(100), random.nextDouble(50)));
        for (Circle gg: circles)
            System.out.println(gg);
    }
}