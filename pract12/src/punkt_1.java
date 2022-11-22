import javax.swing.*;
import java.awt.*;

public class punkt_1 extends JComponent {
    JFrame jf = new JFrame("TEST");

    static class task8_punkt1_GUI2 extends JPanel{
        task8_punkt1_GUI2() {
            this.setPreferredSize(new Dimension(500, 500));

        }
        public void paint(Graphics g) {
            Shape shape;
            Graphics2D gr = (Graphics2D)g;

            String[] seasons  = new String[] {"oval", "rectangle", "line", "fillO"};
            for (int i = 0; i < 20; i++) {
                shape = new Shape() {
                    @Override
                    public int getColor() {
                        return super.getColor();
                    }
                };
                gr.setColor(new Color(shape.color));
                switch (seasons[shape.ra]) {
                    case "oval": gr.drawOval(shape.posx, shape.posy, shape.w, shape.h); break;
                    case "rectangle": gr.drawRect(shape.posx, shape.posy, shape.w, shape.h); break;
                    case "fillO": gr.fillOval(shape.posx, shape.posy, shape.w, shape.h); break;
                    default: gr.drawLine(shape.posx, shape.posy, shape.w, shape.h); break;
                }
            }
        }
    }
    task8_punkt1_GUI2 task2;
    punkt_1() {
        task2 = new task8_punkt1_GUI2();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.add(task2);

        jf.pack();
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new punkt_1();
    }
}
