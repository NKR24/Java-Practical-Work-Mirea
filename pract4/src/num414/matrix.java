package num414;

import java.util.Scanner;
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");   //1
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Введите числа в элемент массива");
        double[][] mass = new double[a][b];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mass[i][j] + " ");
                System.out.print("");
            }
            System.out.print("\n");
        }
        while (true) {
            System.out.print("Что хотим?\n" +
                    "1. Сложить с другой матрицей\n" +
                    "2. Умножить на число\n" +
                    "3. Умножить на другую матрицу\n" +
                    "4. Закончить программу\n");
            int k = in.nextInt();
            if (k == 1) {
                System.out.println("Введите размер матрицы");
                int a2 = in.nextInt(), b2 = in.nextInt();
                double[][] mass2 = new double[a2][b2];
                System.out.println("Введите числа в элемент массива");
                for (int i = 0; i < mass2.length; i++) {
                    for (int j = 0; j < mass2.length; j++) {
                        mass2[i][j] = in.nextDouble();
                    }
                }
                if (a == 2 && b == 2 && b2 == 2 && a2 == 2) {
                    double l = mass[0][0] + mass2[0][0];
                    double l1 = mass[0][1] + mass2[0][1];
                    double l2 = mass[1][0] + mass2[1][0];
                    double l3 = mass[1][1] + mass2[1][1];
                    System.out.println("Итог сложения 2-х матриц\n" + l + " " + l1 + "\n" + l2 + " " + l3);
                }
                if (a == 3 && b == 3 && b2 == 3 && a2 == 3) {
                    double l1 = mass[0][0] + mass2[0][0];
                    double l2 = mass[0][1] + mass2[0][1];
                    double l3 = mass[0][2] + mass2[0][2];
                    double l4 = mass[1][0] + mass2[1][0];
                    double l5 = mass[1][1] + mass2[1][1];
                    double l6 = mass[1][2] + mass2[1][2];
                    double l7 = mass[2][0] + mass2[2][0];
                    double l8 = mass[2][1] + mass2[2][1];
                    double l9 = mass[2][2] + mass2[2][2];
                    System.out.println("Итог сложения 2-х матриц\n" + l1 + " " + l2 + " " + l3 + "\n"
                            + l4 + " " + l5 + " " + l6 + "\n"
                            + l7 + " " + l8 + " " + l9 + "\n");
                }
            }
            if (k == 2) {
                System.out.println("Введите число на которое хотите умножить матрицу");
                double l = in.nextDouble();

                if (a == 2 && b == 2) {
                    double G1 = mass[0][0] * l;
                    double G2 = mass[0][1] * l;
                    double G3 = mass[1][0] * l;
                    double G4 = mass[1][1] * l;
                    System.out.println("Результат умножения матрицы на число\n" + G1 + " " + G2 + "\n" + G3 + " " + G4);
                }
                if (a == 3 && b == 3) {
                    double G1 = mass[0][0] * l;
                    double G2 = mass[0][1] * l;
                    double G3 = mass[0][2] * l;
                    double G4 = mass[1][0] * l;
                    double G5 = mass[1][1] * l;
                    double G6 = mass[1][2] * l;
                    double G7 = mass[2][0] * l;
                    double G8 = mass[2][1] * l;
                    double G9 = mass[2][2] * l;
                    System.out.println("Результат умножения матрицы на число\n" + G1 + " " + G2 + " " + G3 + "\n"
                            + G4 + " " + G5 + " " + G6 + "\n"
                            + G7 + " " + G8 + " " + G9 + "\n");
                }
            }
            if (k == 3) {
                System.out.println("Введите размер матрицы");
                int a2 = in.nextInt(), b2 = in.nextInt();
                double[][] mass2 = new double[a2][b2];
                System.out.println("Введите числа в элемент массива");
                for (int i = 0; i < mass2.length; i++) {
                    for (int j = 0; j < mass2.length; j++) {
                        mass2[i][j] = in.nextDouble();
                    }
                }
                if (a == 2 && b == 2 && a2 == 2 && b2 == 2) {
                    double l1 = (mass[0][0] * mass2[0][0]) + (mass[0][1] * mass2[1][0]);
                    double l2 = (mass[0][0] * mass2[0][1]) + (mass[0][1] * mass2[1][1]);
                    double l3 = (mass[1][0] * mass2[0][0]) + (mass[1][1] * mass2[1][0]);
                    double l4 = (mass[1][0] * mass2[0][1]) + (mass[1][1] * mass2[1][1]);
                    System.out.println("Результат умножения матриц\n" + l1 + " " + l2 + "\n" + l3 + " " + l4);
                }
                if (a == 3 && b == 3 && a2 == 3 && b2 == 3) {
                    double l1 = (mass[0][0] * mass2[0][0]) + (mass[0][1] * mass2[1][0]) + (mass[0][2] * mass2[2][0]);
                    double l2 = (mass[0][0] * mass2[0][1]) + (mass[0][1] * mass2[1][1]) + (mass[0][2] * mass2[2][1]);
                    double l3 = (mass[0][0] * mass2[0][2]) + (mass[0][1] * mass2[1][2]) + (mass[0][2] * mass2[2][2]);
                    double l4 = (mass[1][0] * mass2[0][0]) + (mass[1][1] * mass2[1][0]) + (mass[1][2] * mass2[2][0]);
                    double l5 = (mass[1][0] * mass2[0][1]) + (mass[1][1] * mass2[1][1]) + (mass[1][2] * mass2[2][1]);
                    double l6 = (mass[1][0] * mass2[0][2]) + (mass[1][1] * mass2[1][2]) + (mass[1][2] * mass2[2][2]);
                    double l7 = (mass[2][0] * mass2[0][0]) + (mass[2][1] * mass2[1][0]) + (mass[2][2] * mass2[2][0]);
                    double l8 = (mass[2][0] * mass2[0][1]) + (mass[2][1] * mass2[1][1]) + (mass[2][2] * mass2[2][1]);
                    double l9 = (mass[2][0] * mass2[0][2]) + (mass[2][1] * mass2[1][2]) + (mass[2][2] * mass2[2][2]);
                    System.out.println("Итог умножения 2-х матриц\n" + l1 + " " + l2 + " " + l3 + "\n"
                            + l4 + " " + l5 + " " + l6 + "\n"
                            + l7 + " " + l8 + " " + l9 + "\n");

                }
            }
            if (k == 4) {
                System.out.println("bb");
                break;
            }

        }
    }
}
