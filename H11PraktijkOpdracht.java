package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H11PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String schermtekst;
    int teller;

    int tafel;



    public void init() {
        label = new Label("Type hier een getal en de tafel van het nummer komt tevoorschijn.");
        add(label);
        tekstvak = new TextField("", 15);
        add(tekstvak);
        knop = new Button("ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        schermtekst = "";



    }

    public void paint(Graphics g) {

        int y = 70;

        for (teller = 1; teller < 11; teller++) {
            g.drawString("*", 70, y);
            g.drawString("" + teller, 50, y);
            g.drawString("" + tafel, 90, y);
            g.drawString("=", 110, y);
            g.drawString("" + tafel * teller, 130, y);
            y += 30;

        }

    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel = Integer.parseInt( tekstvak.getText() );
            repaint();







        }
    }
}


