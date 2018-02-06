package H5;
import java.awt.*;
import java.applet.*;

public class H5O1 extends Applet {

    public void paint (Graphics g) {
        g.setColor(Color.black);
        g.drawLine(30,30,230,30);
        g.drawString("Lijn",110,45);
        g.drawRect(30,75,200,100);
        g.drawString("Rechthoek",100,190);
        g.drawRoundRect(30,220,200,100,30,30);
        g.drawString("Afgeronde Rechthoek",75,340);
        g.setColor(Color.MAGENTA);
        g.fillRect(260,75,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",280,190);
        g.drawOval(260,75,200,100);
        g.setColor(Color.MAGENTA);
        g.fillOval(260,220,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",320,340);
        g.setColor(Color.MAGENTA);
        g.fillArc(500,70,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(500,70,200,100);
        g.drawOval(550,220,100,100);
        g.drawString("taartpunt met ovaal er omheen",515,190);
        g.drawString("Circle",585,340);



    }
}
