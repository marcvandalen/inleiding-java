import java.awt.*;
import java.applet.*;

public class H2O2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Marc", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("van Dalen",50,70);
    }
}

