package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8O3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String schermtekst;
    double getal;




    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak = new TextField("", 20);
        label = new Label("Type hier ->");
        add(label);
        add(tekstvak);
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        schermtekst="";


    }
    public void paint(Graphics g) {
        g.drawString("bedrag inclusief btw:" + getal, 50, 60 );
    }

    class KnopListener  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            getal = Double.parseDouble( tekstvak.getText() )*1.21;
            repaint();

        }
    }


}




