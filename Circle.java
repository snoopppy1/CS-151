
//CircleFrame.java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JComponent {

     // Image in which we're going to draw
     private Image image;

     // Graphics2D object ==> used to draw on
     private Graphics2D g2;

     public Circle() {
             setDoubleBuffered(false);
     }

     protected void paintComponent(Graphics g) {
             if (image == null) {
                     // image to draw null ==> we create
                     image = createImage(getSize().width, getSize().height);
                     g2 = (Graphics2D) image.getGraphics();

                     // clear draw area
                     g2.clearRect(0, 0, getSize().width, getSize().height);

                     red();
             }
             g.drawImage(image, 0, 0, null);
     }

     public void red() {
             // apply red color on g2 context
             g2.clearRect(0, 0, getSize().width, getSize().height);
             g2.setPaint(Color.red);
             g2.fillArc(0, 0, 100, 100, 0, 360);
             repaint();
     }

     public void green() {
             g2.clearRect(0, 0, getSize().width, getSize().height);
             g2.setPaint(Color.green);
             g2.fillArc(0, 0, 100, 100, 0, 360);
             repaint();
     }

     public void blue() {
             g2.clearRect(0, 0, getSize().width, getSize().height);
             g2.setPaint(Color.blue);
             g2.fillArc(0, 0, 100, 100, 0, 360);
             repaint();
     }

}