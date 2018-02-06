package H4;
import java.awt.*;
import java.applet.*;

public class H4O2 extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.gray);
        g.fillRect(20, 80, 100, 100);
        g.setColor(Color.red);
        g.drawLine(20,80,70,30);
        g.drawLine(70,30,120,80);
        g.setColor(Color.black);
        g.fillRect(80,150,20,30);
        g.setColor(Color.CYAN);
        g.fillRect(30,150,30,20);
        g.fillRect(30,110,30,20);
        g.fillRect(80,110,30,20);


    }
}