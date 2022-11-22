package num4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Time
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println("Введите год, месяц и день месяца");
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.println("Введите время: часы, минуты");
        calendar.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        calendar.set(Calendar.MINUTE, sc.nextInt());
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println(format.format(date));
    }
}
