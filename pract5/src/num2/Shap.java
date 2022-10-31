package num2;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;
public class Shap extends JPanel {
    public void paintComponent (Graphics g) {
        this.setBackground(Color.WHITE);
        Random ra = new Random();
        ra.nextInt();

        g.setColor(Color.BLACK);
        g.drawLine(10, 15, 50, 41);

        g.setColor(Color.BLUE);
        g.drawRect(10, 50, 40, 40);

        g.setColor(Color.cyan);
        g.fillOval(10, 95, 40, 40);

        g.setColor(Color.yellow);
        g.fillRect(10, 140, 40, 40);

        g.setColor(Color.GREEN);
        g.fill3DRect(10, 190, 40, 40,true);

        g.setColor(Color.MAGENTA);
        g.fill3DRect(10, 240, 40, 40,false);

        g.setColor(Color.RED);
        g.drawRect(10, 290, 40, 40);

        g.setColor(Color.PINK);
        g.clearRect(10, 340,40, 40);

        g.setColor(Color.PINK);
        g.fillOval(10, 390,40, 40);

        g.setColor(Color.BLACK);
        g.drawString("PLS GI", 20, 450);

        g.setColor(Color.blue);
        g.fillOval(60, 10, 40, 40);

        g.setColor(Color.cyan);
        g.drawLine(60, 50, 110, 90);


        g.setColor(Color.BLUE);
        g.drawRect(60, 90, 40, 40);
        g.setColor(Color.BLUE);
        g.fillOval(60, 90, 40, 40);

        g.setColor(Color.BLACK);
        g.fillOval(60, 140, 40, 40);

        g.setColor(Color.CYAN);
        g.fillRect(60, 190, 40, 40);

        g.setColor(Color.BLACK);
        g.fill3DRect(60, 240, 40, 40,false);

        g.setColor(Color.MAGENTA);
        g.fill3DRect(60, 290, 40, 40,true);


        g.setColor(Color.MAGENTA);
        g.fillOval(60, 340, 40, 40);

        g.setColor(Color.RED);
        g.drawRect(60, 390, 40, 40);

        g.setColor(Color.BLACK);
        g.drawString("VE ME 5...", 60, 450);

    }

}
