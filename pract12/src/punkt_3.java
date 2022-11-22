import javax.swing.*;
import java.awt.*;

public class punkt_3 extends JComponent {
    JFrame jf = new JFrame("TEST");

    punkt_3() {

        jf.setSize(600,600);
        JLabel jlabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\analo\\OneDrive\\Desktop\\giphy.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        jf.add(jlabel);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new punkt_3();
    }
}