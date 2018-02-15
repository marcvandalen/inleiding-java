package  H11;

import java.awt.*;
import java.applet.*;


public class H11O6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int y = 0;
        int width = 300;
        int height = 300;

        for(teller = 0; teller < 5; teller++) {
            x += 25;
            y += 25;
            width -= 50;
            height -= 50;
            g.drawOval( x ,y, width, height);





        }
    }
}