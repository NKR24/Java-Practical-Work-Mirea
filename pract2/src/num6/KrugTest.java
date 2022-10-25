package num6;

import java.util.Scanner;

public class KrugTest
{
    public static void main(String[] args) {
        Krug a = new Krug();
        Scanner in = new Scanner(System.in);
        double S1 = 0, S = 0, pi = 3.14, P = 0, P1 = 0;
        System.out.println("Введите радиус для 1-го круга");
        double R = in.nextDouble();
        System.out.println("Площадь 1-го круга: "+ a.SK1(S, R, pi));
        System.out.println("Периметр 1-го круга: " + a.dlina1(pi, R, P) + "\n");
        System.out.println("Введите радиус для 2-го круга");
        double R1 = in.nextDouble();
        System.out.println("Площадь 2-го круга: "+ a.SK2(S1, R1, pi));
        System.out.println("Периметр 2-го круга: " + a.dlina2(pi, R1, P1) + "\n");
        System.out.println("Сравнение окружностей по радиусу: " + a.srav(R,R1));
    }
}