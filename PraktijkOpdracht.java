package H4;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void paint (Graphics g) {
        g.setColor(Color.black);
        g.drawLine(30,30,500,30);
        g.drawString("Lijn",260,45);
        g.drawRect(30,70,500,300);
        g.drawString("Rechthoek",240,385);
        g.drawRoundRect(30,400,500,300,30,30);
        g.drawString("Afgeronde Rechthoek",220,730);
        g.setColor(Color.MAGENTA);
        g.fillRect(560,70,500,300);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",740,385);
        g.drawOval(560,70,500,300);
        g.setColor(Color.MAGENTA);
        g.fillOval(560,400,500,300);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",770,730);
        g.setColor(Color.MAGENTA);
        g.fillArc(1090,70,500,300,0,45);
        g.setColor(Color.black);
        g.drawOval(1090,70,500,300);
        g.drawOval(1190,430,300,300);
        g.drawString("taartpunt met ovaal er omheen",1250,385);
        g.drawString("Circle",1325,750);



    }
}
