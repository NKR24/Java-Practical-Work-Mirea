import javax.swing.*;

public class punkt_2 extends JComponent {
    JFrame jf = new JFrame("TEST");
    punkt_2GUI task;


    punkt_2(String[] args) {


        task = new punkt_2GUI(args);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.add(task);

        jf.pack();
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {

        new punkt_2(args);
    }
}