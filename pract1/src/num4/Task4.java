package num4;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int sum = 0, i = 0, max = 0, min = 10;
        Scanner scanner = new Scanner(System.in);
        do {
            arr[i] = scanner.nextInt();
            sum += arr[i];
            i++;
        } while (i < arr.length);
        for (i = 0; i < arr.length; i++)
        {
            if ((arr[i]) < min) {
                min = arr[i];
            } if (max < arr[i]) {
            max = arr[i];
        }
        }


        System.out.println("Сумма: " + sum);
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: "+ min);
    }
}