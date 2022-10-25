package num8;

public class Array
{
    public static void main(String[] args)
    {

        String[] a = {" Тоже "," Java "," язык "," и "," крутая "," ВТ "," кафедра "};
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        String temp;
        for (int i = 0; i < n/2; i++)
        {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
    }
}
