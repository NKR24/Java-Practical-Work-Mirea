package num10;

public class Computer {
    private Brand brand;
    private int number;
    private Monitor monitor;
    private Memory memory;
    private Processor processor;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand=" + brand +
                ", number=" + number +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", processor=" + processor +
                '}';
    }

    public Computer(Brand brand, int number, Monitor monitor, Memory memory, Processor processor) {
        this.brand = brand;
        this.number = number;
        this.monitor = monitor;
        this.memory = memory;
        this.processor = processor;
    }
}
