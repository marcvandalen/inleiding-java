package  H11;

import java.applet.Applet;
import java.awt.*;


public class H11O8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x ;
        int y ;
        int width = 0;
        int height = 0;

        for(teller = 0; teller < 50; teller++) {
            x = 20;
            y = 20;
            width += 5;
            height += 5;
            g.drawOval( x ,y, width, height);





        }
    }
}