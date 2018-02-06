package H5;
import java.awt.*;
import java.applet.*;

public class H5O2 extends Applet {
    //decleratie.
    int lengteValerie;
    int lengteJeroen;
    int lengtehans;
    int nulpunt;


    public void init(){
        //initialisatie.
        lengteValerie=140;
        lengteJeroen=350;
        lengtehans=280;
        nulpunt=620;

    }

    public void paint (Graphics g) {
        g.setColor(Color.black);
        g.fillRect(300,195,2,425);
        g.fillRect(300,620,450,2);
        g.drawString("20",250,550);
        g.drawString("40",250,480);
        g.drawString("60",250,410);
        g.drawString("80",250,340);
        g.drawString("100",250,270);
        g.drawString("120",250,200);
        g.setColor(Color.red);
        g.fillRect(350,nulpunt-lengteValerie,50,nulpunt-(nulpunt-lengteValerie));
        g.setColor(Color.GREEN);
        g.fillRect(500,nulpunt-lengteJeroen,50,nulpunt-(nulpunt-lengteJeroen));
        g.setColor(Color.blue);
        g.fillRect(650,nulpunt-lengtehans,50,nulpunt-(nulpunt-lengtehans));
        g.setColor(Color.black);
        g.drawString("Valerie",356,650);
        g.drawString("Jeroen",506,650);
        g.drawString("Hans",660,650);






    }
}