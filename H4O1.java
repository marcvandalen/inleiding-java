package H4;
import java.awt.*;
import java.applet.*;

public class H4O1 extends Applet {

    public void paint (Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawLine(50,20,20,70);
        g.drawLine(50,20,80,70);
        g.drawLine(20,70,80,70);

    }
}
