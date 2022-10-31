package num1;//Счет команд

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GUI extends JPanel
{
    static int x = 0;
    static int y = 0;
    public static void Set ()
    {
        JFrame jfrm = new JFrame("BetBoom");
        jfrm.setSize(400, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfrm.setVisible(true);

        JButton button1 = new JButton("AC Milan");
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        JButton button2 = new JButton("Real Madrid");
        button2.setBackground(Color.RED);
        button2.setForeground(Color.WHITE);

        jfrm.add(button1, BorderLayout.WEST);
        jfrm.add(button2, BorderLayout.EAST);

        JLabel jlab1 = new JLabel("Result: 0 X 0");
        JLabel jlab2 = new JLabel("Last Scorer: N/A");
        JLabel jlab3 = new JLabel("Winner: DRAW");
        jfrm.add(jlab1, BorderLayout.CENTER);
        jfrm.add(jlab2, BorderLayout.SOUTH);
        jfrm.add(jlab3, BorderLayout.NORTH);

        MouseListener mouseListener = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                x++;
                jlab1.setText("Result: " + x + " x " + y);
                jlab2.setText("Last Scorer: AC Milan");
                if(x > y) jlab3.setText("Winner: AC Milan");
                else if(y > x) jlab3.setText("Winner: Real Madrid");
                else jlab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button1.addMouseListener(mouseListener);

        MouseListener mouseListener2 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                y++;
                jlab1.setText("Result: " + x + " x " + y);
                jlab2.setText("Last Scorer: Real Madrid");
                if (x > y) jlab3.setText("Winner: AC Milan");
                else if (y > x) jlab3.setText("Winner: Real Madrid");
                else jlab3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        button2.addMouseListener(mouseListener2);
    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater (new Runnable()
        {
            @Override
            public void run()
            {
                Set();
            }
        });
    }

}