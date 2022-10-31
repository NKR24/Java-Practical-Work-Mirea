package num4110;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String b;
        Tran c = new Tran();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("На чем cовершим поездку?");
            b = in.next();
            if (b.equals("Авто"))
                c.car();
            else if (b.equals("Самолет"))
                c.airplane();

            else if (b.equals("Поезд"))
                c.train();

            else if (b.equals("Корабль"))
                c.ship();
            else
                System.out.println("Такого вида транспрта нет");
        }
    }
}

