import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число \"от\":");
        int a = sc.nextInt();
        System.out.println("Теперь введите число \"до\":");
        int b = sc.nextInt();

        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}