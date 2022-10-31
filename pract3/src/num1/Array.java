package num1;//вещественные числа

import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
public class Array
{
    public static void main(String[] args)
    {
        System.out.println("Классом Random:");
        Random random = new Random();
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextDouble();
        for (double i: array)
            System.out.print(" " + i + " ");
        Arrays.sort(array);
        System.out.println("\n" + Arrays.toString(array) + "\n");

        System.out.println("Классом Math:");
        double[] ar = new double[5];
        double a;
        for (int j=0; j <ar.length; j++)
        {
            a = Math.random();
            ar[j]= a;
            System.out.print (ar[j] + " ");
        }
        Arrays.sort(ar);
        System.out.println("\n" + Arrays.toString(ar));
    }
}



