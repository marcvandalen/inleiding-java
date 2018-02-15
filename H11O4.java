package  H11;

import java.awt.*;
import java.applet.*;


public class H11O4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int teller2;
        int y = 0;
        int y2 = 0;

        for(teller = 1; teller < 11; teller++) {
            y += 30;
            g.drawString("*" , 70, y );
            g.drawString("" + teller, 50, y );
            g.drawString("3" , 90, y );
            g.drawString("=" , 110, y );
        }
        for(teller2 = 3; teller2 < 33; teller2+=3) {
            y2 += 30;
            g.drawString("" + teller2, 130, y2 );

        }

    }

}