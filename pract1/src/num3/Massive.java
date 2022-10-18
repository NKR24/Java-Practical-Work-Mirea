package num3;

public class Massive {
    public static void main(String args[]) {
        double [] array = {3, 5, 7, 12, 22, 29, 68};
        double sum = 0;
        double mus = 0;
        for (double num : array) {
            sum = sum + num;

        }
        for (double i : array){
            mus =+ i;
        }
        System.out.println(sum);
        System.out.println(mus);

    }
}

