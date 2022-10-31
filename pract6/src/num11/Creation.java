package num11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.FlowLayout;
public class Creation extends JFrame {
    private JButton but = new JButton("Перевести");
    private JLabel input = new JLabel("Введите число которое хотите перевести: ");
    private JLabel translationiz = new JLabel("Перевод из: ");
    private JLabel translationv = new JLabel("В: ");
    private JRadioButton f = new JRadioButton("Фаренгейт");
    private JRadioButton c = new JRadioButton("Цельсия");
    private JRadioButton k = new JRadioButton("Кельвин");
    JTextField intp = new JTextField();
    private JRadioButton f1 = new JRadioButton("Фаренгейт");
    private JRadioButton c1 = new JRadioButton("Цельсия");
    private JRadioButton k1 = new JRadioButton("Кельвин");
    public Creation() {
        super("Creation");
        this.setBounds(100, 100, 300, 400); // размер окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(13, 1, 1, 1));
        con.add(input);
        con.add(intp);
        con.add(translationiz);
        ButtonGroup group = new ButtonGroup(); // создание кон-ра для выбора кнопки
        group.add(c);
        group.add(k);
        group.add(f);
        con.add(c);
        con.add(f);
        con.add(k);
        c.setSelected(true);
        con.add(translationv);
        ButtonGroup group1 = new ButtonGroup();
        group1.add(c1);
        group1.add(k1);
        group1.add(f1);
        con.add(c1);
        con.add(f1);
        con.add(k1);
        k1.setSelected(true);
        but.addActionListener(new result()); //создание кнопки
        con.add(but);
    }
    class result implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double num = Double.parseDouble(intp.getText());
            double с_k = 274.15, c_f = 33.8 ,f_c, f_k;
            String massage = "";
            massage += (c.isSelected() && k1.isSelected()? String.valueOf(с_k + num - 1) :
                    c.isSelected() && f1.isSelected()? String.valueOf(num * 1.8 + 32 ):
                            k.isSelected() && c1.isSelected()? String.valueOf(num - 273.15) :
                                    k.isSelected() && f1.isSelected()? String.valueOf(num * 1.8 - 459.67) :
                                            f.isSelected() && k1.isSelected()? String.valueOf(((num + 459.67)/1.8)) :
                                                    f.isSelected() && c1.isSelected()? String.valueOf((num - 32)/1.8):
                                                            c.isSelected() && c1.isSelected()? num :
                                                                    f.isSelected() && f1.isSelected()? num :
                                                                            k.isSelected() && k1.isSelected()? num :"");
            JOptionPane.showConfirmDialog(null, massage, "", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
