package num5;

public interface StringTransformer {
    static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>0;--i){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    static int countChars(String str){
        return str.length();
    }
    static String fromOdds(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<str.length();i+=2)
            stringBuilder.append(str.charAt(i));
        return stringBuilder.toString();
    }
}
