package num10;

import java.util.Scanner;
public class HowMany
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 0;
        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == ' ')
                {
                    count++;
                }
            }
        }
        if(count == 1)
        {
            System.out.println("Вы ввели " + count + " слово");
        }
        if(count == 2 || count == 3 || count == 4)
        {
            System.out.println("Вы ввели " + count + " слова");
        }
        else if(count > 4)
        {
            System.out.println("Вы ввели " + count + " слов");
        }
    }
}
