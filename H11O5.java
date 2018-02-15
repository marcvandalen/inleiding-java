package H11;

import java.awt.*;
import java.applet.*;

public class H11O5 extends Applet {
    int x;

    public void paint (Graphics g) {
        x =50;
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(50,50,x,x);
        g.drawRect(100,100,x,x);
        g.drawRect(150,150,x,x);
        g.drawRect(200,200,x,x);
        g.drawRect(250,250,x,x);



    }
}
