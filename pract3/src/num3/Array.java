package num3;//случайный массив

import java.util.Random;
public class Array
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean ascOrder = true;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] < array[i]) continue;
            ascOrder = false;
            break;
        }
        System.out.print(ascOrder);
    }
}

