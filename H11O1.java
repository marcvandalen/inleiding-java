package  H11;

import java.awt.*;
import java.applet.*;


public class H11O1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 30;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" , x, 305 );
            g.drawString("" + teller, x, 30 );
        }
    }
}
