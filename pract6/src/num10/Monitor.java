package num10;

public class Monitor {
    private int  diagonal;
    private int frequency;

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", frequency=" + frequency +
                '}';
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getFrequency() {
        return frequency;
    }

    public Monitor(int diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }
}
