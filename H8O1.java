package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8O1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String schermtekst;



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
        knop = new Button("Resset");
        KnopListener2 k2 = new KnopListener2();
        knop.addActionListener( k2 );
        add(knop);
        schermtekst="";


    }
    public void paint(Graphics g) {
        g.drawString("" +schermtekst, 50, 60 );
    }

    class KnopListener  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst =  tekstvak.getText();
            repaint();

        }
    }
    class KnopListener2  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "";
            repaint();

        }
    }
}

