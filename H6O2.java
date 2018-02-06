package H6;
import java.awt.*;
import java.applet.*;


public class H6O2 extends Applet {
    //decleratie.
    double eenUur;
    double eenDag;
    double eenJaar;
    double eenSeconde;
    double eenMinuut;


    public void init() {
        //initialisatie.
        eenSeconde=1;
        eenMinuut=60;
        eenUur=60*eenMinuut;
        eenDag=1440*eenMinuut;
        eenJaar=525600*eenMinuut;

        }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(20,20,240,90);
        g.setColor(Color.black);
        g.drawString("-Er zitten " +eenMinuut+ " seconde in een minuut.",30,40);
        g.drawString("-Er zitten " +eenUur+ " seconde in een uur.",30,60);
        g.drawString("-Er zitten " +eenDag+ " seconde in een dag.",30,80);
        g.drawString("-Er zitten " +eenJaar+ " seconde in een jaar.",30,100);
        g.drawLine(20,20,20,110);
        g.drawLine(260,20,260,110);
        g.drawLine(20,20,260,20);
        g.drawLine(20,110,260,110);





    }
}