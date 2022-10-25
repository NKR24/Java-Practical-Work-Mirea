package num6;

public class Krug {
    public static void main(String[] args) {}
    private double S, pi = 3.14, R, P;
    public Krug(){
        this.S = S;
        this.R = R;
        this.P=P;
    }
    public double SK1(double S, double R, double pi)
    {
        S = pi* Math.pow(R,2);
        return S;
    }
    public double dlina1(double pi, double R, double P)
    {
        P= 2*pi*R;
        return P;
    }
    public double SK2(double S1, double R1, double pi)
    {
        S1 = pi* Math.pow(R1,2);
        return S1;
    }
    public double dlina2(double pi, double R1, double P1)
    {
        P1= 2*pi*R1;
        return P1;
    }
    public String srav(double R, double R1){
        if (R1 > R)
            return "Второй больше первого";
        else if(R > R1)
            return "Первый больше второго";
        else
            return "Они равны";
    }
}

