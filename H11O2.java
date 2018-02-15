package  H11;

import java.awt.*;
import java.applet.*;


public class H11O2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 20; teller > 9; teller--) {
            x += 30;
            g.drawString("", x, 305);
            g.drawString("" + teller, x, 30);
        }
    }
}