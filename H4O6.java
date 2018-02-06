package H4;
import java.awt.*;
import java.applet.*;

public class H4O6 extends Applet {

    public void paint (Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(550,50,250,675);
        g.setColor(Color.red);
        g.fillOval(575,75,200,200);
        g.setColor(Color.ORANGE);
        g.fillOval(575,285,200,200);
        g.setColor(Color.GREEN);
        g.fillOval(575,495,200,200);
        g.setColor(Color.BLACK);
        g.fillRect(665,725,20,100);



    }
}
