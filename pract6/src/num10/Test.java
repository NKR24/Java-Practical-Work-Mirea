package num10;//Магаз компов

import java.util.Scanner;

public class Test {
    static public Computer enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию о мониторе - диагональ и частота: ");
        Monitor monitor = new Monitor(sc.nextInt(), sc.nextInt());
        System.out.println("Введите объем памяти: ");
        Memory memory = new Memory(sc.nextInt());
        System.out.println("Введите тактовую частоту процессора: ");
        Processor processor = new Processor(sc.nextInt());
        int num;
        Brand brand;
        System.out.println("Введите номер компьютера: ");
        num = sc.nextInt();
        System.out.println("Введите марку - Lenovo, Acer, HP: ");
        String brandName = sc.next();
        switch (brandName) {
            case "Lenovo":
                brand = Brand.Lenovo;
                break;
            case "HP":
                brand = Brand.HP;
                break;
            default:
                brand = Brand.Acer;
        }
        Computer computer = new Computer(brand, num, monitor, memory, processor);
        return computer;
    }

    public static void main(String[] args) {

        String command;
        Shop s = new Shop();
        Computer c;

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить компьютер");
            System.out.println("2 - Удалить компьютер");
            System.out.println("3 - Найти компьютер");
            System.out.println("4 - Показать компьютер");
            System.out.println("5 - Выйти");
            Scanner sc = new Scanner(System.in);
            command = sc.next();
            switch (command) {
                case "1":
                    s.addComputer(enter());
                    break;
                case "2":
                    System.out.println("Введите номер ");
                    s.deleteComputer(sc.nextInt());
                    break;
                case "3":
                    System.out.println("Введите номер: ");
                    System.out.println(s.findComputer(sc.nextInt()));
                    break;
                case "4":
                    System.out.println(s);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("неизвестная команда");
                    command = sc.next();
            }

        }
    }
}
