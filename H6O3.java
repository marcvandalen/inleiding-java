package H6;
import java.awt.*;
import java.applet.*;


public class H6O3 extends Applet {
    int a, b, c;
    int uitkomst;


    public void init() {
        a = 25;
        b = 3;
        c = -1;
        uitkomst = (a + b)*c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}