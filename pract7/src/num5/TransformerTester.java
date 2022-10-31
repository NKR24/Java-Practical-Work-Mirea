package num5;//Интерфейс для работы со строками

public class TransformerTester{
    public static void main(String[] args) {
        System.out.println("Наоборот: "+StringTransformer.reverse("abcdefg"));
        System.out.println("Подсчёт символов: "+StringTransformer.countChars("12345678910"));
        System.out.println("Нечётные: "+StringTransformer.fromOdds("0123456789"));
    }
}