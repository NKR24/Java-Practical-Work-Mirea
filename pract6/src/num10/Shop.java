package num10;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void deleteComputer(int n) {
        for (int i = 0; i < computers.size(); i++) {
            if (n == computers.get(i).getNumber()) {
                computers.remove(i);
                System.out.println("Компьютер удален!");
                return;
            }
        }
        System.out.println("Компьютер с таким номером не был найден!");
    }
    public Computer findComputer(int n) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getNumber()==n) {
                return computers.get(i);
            }
        }
        System.out.println("Компьютер с таким номером не был найден!");
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers  +
                '}' ;
    }
}
