package num2;//Рандомные фигуры

import javax.swing.*;
import java.awt.*;
public class Window {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Цвета и фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shap qu = new Shap();
        qu.setBackground(Color.WHITE);
        frame.add(qu);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}

