package num412;//Телефон

import java.io.*;
import java.util.Scanner;
public class Phone
{
    int number;
    String model;
    int weight;

    Phone()
    {

    }

    Phone(int number, String model, int weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Phone {" + "number = " + number + ", model = '" + model + '\'' + ", weight = " + weight + '}';
    }

    public static void receiveCall(String caller)
    {
        System.out.println("Звонит {" + caller + "}");
    }

    public static void getNumber(int telephoneNumber)
    {
        System.out.println("Исходящий номер {" + telephoneNumber + "}");
    }

    public static void recieveCallAndGetNumber(int telephoneNumber, String caller)
    {
        System.out.println("Звонит {" + caller + "}" + ", Исходящий номер {" + telephoneNumber + "}");
    }

    public static void sendMessage(String teleNumber) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("C:\\Users\\FOMKA\\IdeaProjects\\pract4\\gg.txt"));
        while (input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }






    public static void main(String[] args) throws FileNotFoundException {
        Phone phone1 = new Phone(1, "IPhone", 100);
        Phone phone2 = new Phone(2, "Samsung", 200);
        Phone phone3 = new Phone(3, "OnePlus", 300);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        String caller;
        System.out.println("Введите имя звонящего : ");
        Scanner scanner = new Scanner(System.in);
        caller = scanner.nextLine();

        int telephoneNumber;
        System.out.println("Введите исходящий номер : ");
        Scanner scan = new Scanner(System.in);
        telephoneNumber = scan.nextInt();



        receiveCall(caller);
        getNumber(telephoneNumber);

        recieveCallAndGetNumber(telephoneNumber, caller);

        String question;
        System.out.println("Хотите добавить абонента для отправки сообщения?");
        Scanner s = new Scanner(System.in);
        question = s.nextLine();
        while (question.equals("Да"))
        {
            String teleNumber;
            System.out.println("Введите номер которому хотите отправить сообщение : ");
            Scanner sc = new Scanner(System.in);
            teleNumber = sc.nextLine();
            if (teleNumber.length() < 10 || teleNumber.length() > 11) {
                System.out.println("Такого номера не существует, введите заново!");
                question=s.nextLine();
            }
            else
            {
                System.out.println("Добавлен: " + teleNumber);
                try (FileWriter writer = new FileWriter("C:\\Users\\FOMKA\\IdeaProjects\\pract4\\gg.txt", true))
                {
                    String text = teleNumber;
                    writer.write(text);
                    writer.append('\n');
                }
                catch (IOException ex)
                {
                    System.out.println(ex.getMessage());
                }
                System.out.println("Хотите добавить ещё абонента для отправки сообщения?");

                question=s.nextLine();
                if (question.equals("Нет"))
                {
                    System.out.println("Сообщение будет отправлено этим абонентам: ");
                    sendMessage(teleNumber);
                }
            }
        }
    }
}
