package H6;
import java.awt.*;
import java.applet.*;


public class H6O1 extends Applet {
    //decleratie.
    double ali;
    double jan;
    double jeannette;
    double marc;
    double hoofdBedrag;


    public void init() {
        //initialisatie.
        hoofdBedrag=113;
        ali=hoofdBedrag/4;
        jan=hoofdBedrag/4;
        jeannette=hoofdBedrag/4;
        marc=hoofdBedrag/4;



        }

    public void paint(Graphics g) {
        g.drawString("Ali",30,40);
        g.drawString("Jan",30,60);
        g.drawString("Jeannette",30,80);
        g.drawString("Marc",30,100);
        g.drawLine(30,25,160,25);
        g.drawLine(90,25,90,110);
        g.drawString(""+ali,95,40);
        g.drawString(""+jan,95,60);
        g.drawString(""+jeannette,95,80);
        g.drawString(""+marc,95,100);
        g.drawString("Bedrag:"+hoofdBedrag,49,20);



    }
}