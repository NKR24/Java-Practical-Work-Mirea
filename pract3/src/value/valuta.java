package value;//Валюта

import java.util.Scanner;
public class valuta {
    public static void main(String[] args) {
        String q, q1, b;
        double r, d, e, a;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("из какой валюты?");
            q = in.next();
            System.out.println("В какую?");
            q1 = in.next();
            System.out.println("Сколько " + q + " вы хотите перевести в " + q1 + "?");
            a = in.nextDouble();
            if (q.equals("доллар")) {
                if (q1.equals("евро")) {
                    System.out.println("Перевод из " + q + " в " + q1 + ": " + a * 1.03);
                }
                if (q1.equals("руб")) {
                    System.out.println("Перевод из " + q + " в " + q1 + ": " + a * 63.68);
                }
            } else if (q.equals("евро")) {
                if (q1.equals("доллар")) {
                    System.out.println("Перевод из " + q + "а" + " в " + q1 + ": " + a * 0.9718);
                } else if (q1.equals("руб")) {
                    System.out.println("Перевод из " + q + " в " + q1 + ": " + a * 62.35);
                }
            } else if (q.equals("руб")) {
                if (q1.equals("доллар")) {
                    System.out.println("Перевод из " + q + " в " + q1 + ": " + a * 0.015703);
                } else if (q1.equals("евро")) {
                    System.out.println("Перевод из " + q + " в " + q1 + ": " + a * 0.016039);

                }
            }
        }
    }
}
