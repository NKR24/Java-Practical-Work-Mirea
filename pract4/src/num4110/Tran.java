package num4110;

import java.util.Scanner;

public class Tran extends Absra {
    public void car() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 4)
            System.out.println("Cтолько пассажиров невозможно увести на одном авто");
        else {
            System.out.println("Время поездки от Мирэа до Гольяново составляет: 50 мин без пробок");
            System.out.println("Cтоимость поездки составит: 981 руб");
            System.out.println("Перевозка груза бесплатно!");
        }
    }

    @Override
    public void airplane() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 215)
            System.out.println("Cтолько пассажиров невозможно увести на одном cамолете");
        else {
            System.out.println("Время полета от Шереметьево до Санкт-Петербурга составляет: 1 час 40 мин");
            System.out.println("Cтоимость поездки составит: от 1304 руб до 3500 руб");
            System.out.println("Сколько примерно весит ваш груз?");
            double  b = in.nextDouble();
            if(b > 23)
                System.out.println("Стоимость перевозки груза 100 евро за 1 кг");
            else
                System.out.println("Стоимость перевозки груза бесплатна");
        }
    }

    public void train() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 522)
            System.out.println("Cтолько пассажиров невозможно увести на одном поезде");
        else {
            System.out.println("Время пути от Москвы до СПБ составляет: 4 часа");
            System.out.println("Cтоимость поездки составит: 3000 руб");
            System.out.println("Стоимость перевозки груза бесплатна");
        }
    }
    public void ship() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько пассажиров? ");
        int a = in.nextInt();
        if (a > 120)
            System.out.println("Cтолько пассажиров невозможно увести на одном корабле");
        else {
            System.out.println("Время пути от Сочи до Краснодара: 7 часов 32 мин");
            System.out.println("Cтоимость поездки составит: 4000 руб");
            System.out.println("Стоимость перевозки груза бесплатна");
        }
    }
}

