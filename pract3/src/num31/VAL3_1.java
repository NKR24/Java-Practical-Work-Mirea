package num31;//Оболочки

public class VAL3_1{
    public static void main(String[] args) {
        Double obj = new Double(7.45);
        String st = "76.3";
        Double x = Double.valueOf(obj);// 1
        x  = Double.parseDouble(st);// 2
        int intVal = obj.intValue();// 3
        byte byteVal = obj.byteValue();
        short shortVal = obj.shortValue();
        float floatVal = obj.floatValue();
        String StrVal  = obj.toString();
        System.out.println(intVal);// 4
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(floatVal);
        System.out.println(StrVal);
        double c2 = 3.14; // 5 -- double - String
        String d = Double.toString(c2);
        System.out.println(d);
    }
}

