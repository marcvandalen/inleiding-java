package  H11;

import java.applet.Applet;
import java.awt.*;


public class H11O7 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int y = 0;
        int width = 750;
        int height = 750;

        for(teller = 0; teller < 50; teller++) {
            x += 7.5;
            y += 7.5;
            width -= 15;
            height -= 15;
            g.drawOval( x ,y, width, height);





        }
    }
}