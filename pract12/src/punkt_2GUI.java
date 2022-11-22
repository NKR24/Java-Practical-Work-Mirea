import javax.swing.*;
import java.awt.*;

public class punkt_2GUI extends JComponent {

    Image jack = new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\car.jpg").getImage();
    punkt_2GUI(String[] args) {
        this.setPreferredSize(new Dimension(500, 500));

    }
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(jack, 0, 0, 500, 500, null);

    }

}