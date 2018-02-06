package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8O2 extends Applet {
    TextField tekstvak;
    Button knop;
    double getal;
    double getal2;
    double getal3;
    double getal4;
    double totaal;



    public void init() {
        knop = new Button("Aantal Mannen");
        KnopListener1 kl = new KnopListener1();
        knop.addActionListener(kl);
        add(knop);
        knop = new Button("Aantal Vrouwen");
        KnopListener2 k2 = new KnopListener2();
        knop.addActionListener(k2);
        add(knop);
        knop = new Button("Aantal potentiële mannen");
        KnopListener3 k3 = new KnopListener3();
        knop.addActionListener(k3);
        add(knop);
        knop = new Button("Aantal potentiële Vrouwen");
        KnopListener4 k4 = new KnopListener4();
        knop.addActionListener(k4);
        add(knop);

    }
    public void paint(Graphics g) {
        g.drawString("Het aantal mannelijke deelneemers: " +getal, 50, 100 );
        g.drawString("Het aantal vrouwelijke deelneemers: " +getal2, 50, 120 );
        g.drawString("Het aantal potentiële mannelijke deelneemers:" +getal3, 50, 140 );
        g.drawString("Het aantal potentiële vrouwelijke deelneemers:" +getal4, 50, 160 );
        totaal = getal + getal2 + getal3 + getal4;
        g.drawString("Totaal:" +totaal, 50, 180 );
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );

            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );


            repaint();
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );


            repaint();
        }
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );



            repaint();
        }
    }

}


