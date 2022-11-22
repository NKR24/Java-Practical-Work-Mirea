package num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

    public class Date_in_application extends JFrame {
    private JLabel mydate = new JLabel("Введите свою дату ");
    private JLabel date = new JLabel("Сегодняшняя дата: ");
    JRadioButton labelDate;
    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
    String dateToday = formattedDate.format(calendar.getTime());
    JTextField intp = new JTextField(); // пишу
    private JButton but = new JButton("Cравнить");

    public Date_in_application() {
        super("Date");
        this.setBounds(100, 100, 300, 400); // размер окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        labelDate = new JRadioButton(dateToday);
        con.setLayout(new GridLayout(13, 1, 1, 1));
        con.add(mydate);
        con.add(intp);
        con.add(date);
        con.add(labelDate); // дата с кнопкой
        //ButtonGroup group = new ButtonGroup(); // создание кон-ра для выбора кнопки
        but.addActionListener(new result()); //создание кнопки
        con.add(but);
    }
    class result implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String num = String.valueOf(intp.getText());
            if(num.equals(dateToday)) {
                JOptionPane.showMessageDialog(null, "True");
            }
            else {
                JOptionPane.showMessageDialog(null, "False");
            }
        }
    }
}
