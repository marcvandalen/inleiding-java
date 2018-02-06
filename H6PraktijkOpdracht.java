package H6;
import java.awt.*;
import java.applet.*;


public class H6PraktijkOpdracht extends Applet {
    //decleratie.
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double aantalCijfers;
    double gemiddeldeCijfer;



    public void init() {
        //initialisatie.
        cijfer1=5.9;
        cijfer2=6.3;
        cijfer3=6.9;
        aantalCijfers=3;
        gemiddeldeCijfer=(cijfer1+cijfer2+cijfer3)/aantalCijfers;
        gemiddeldeCijfer = (int) (gemiddeldeCijfer * 10);
        gemiddeldeCijfer = gemiddeldeCijfer/ 10;



    }
    public void paint(Graphics g) {
        g.drawString("Gemiddelde cijfer is: "+gemiddeldeCijfer,40,40);


    }
}