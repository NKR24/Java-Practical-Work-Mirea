package num1;
import java.util.*;
public class Date_in_console {
    public static void main(String[] args) {
        System.out.println("Фамилия разработчика: ");
        Scanner in = new Scanner(System.in);
        String lastname = in.next();
        Date date = new Date();
        System.out.println("Дата получения задания: Sun Oct 23 14:39:44 MSK 2022" +"\n"+ "Фамилия разработчика: " + lastname + "\n" + "Дата и время сдачи задания: " + date);
    }
}