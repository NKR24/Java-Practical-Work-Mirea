package num6;//Массив книг и журналов

public class PrintableTest
{
    public static void main(String[] args) {
        Book book1 = new Book("name1");
        Book book2 = new Book("name2");
        Shop shop1 = new Shop("shop1");
        Shop shop2 = new Shop("shop2");

        Printable[] printables = {book1, book2, shop1, shop2};
        for (Printable printable : printables){
            printable.print();
        }
    }
}


