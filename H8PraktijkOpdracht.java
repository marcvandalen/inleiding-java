package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8PraktijkOpdracht extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String schermtekst;
    double getal;
    double getal2;




    public void init() {
        label = new Label("Type hier je 2 getalen en klik daarna op een van de 4 knoppen.");
        add(label);
        tekstvak = new TextField("", 15);
        add(tekstvak);
        tekstvak2 = new TextField("", 15);
        add(tekstvak2);
        knop = new Button("+");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        knop2 = new Button("-");
        KnopListener2 k2 = new KnopListener2();
        knop2.addActionListener( k2 );
        add(knop2);
        knop3 = new Button("*");
        KnopListener3 k3 = new KnopListener3();
        knop3.addActionListener( k3 );
        add(knop3);
        knop4 = new Button("/");
        KnopListener4 k4 = new KnopListener4();
        knop4.addActionListener( k4 );
        add(knop4);
        schermtekst="";


    }


    class KnopListener  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String a = tekstvak.getText();
            getal = Double.parseDouble( a );
            String b = tekstvak2.getText();
            getal2 = Double.parseDouble( b );
            double uitkomst = getal + getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");


        }
    }
    class KnopListener2  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String c = tekstvak.getText();
            getal = Double.parseDouble( c );
            String d = tekstvak2.getText();
            getal2 = Double.parseDouble( d );
            double uitkomst = getal - getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");




        }
    }
    class KnopListener3  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String i = tekstvak.getText();
            getal = Double.parseDouble( i );
            String f = tekstvak2.getText();
            getal2 = Double.parseDouble( f );
            double uitkomst = getal * getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");



        }
    }
    class KnopListener4  implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String g = tekstvak.getText();
            getal = Double.parseDouble( g );
            String h = tekstvak2.getText();
            getal2 = Double.parseDouble( h );
            double uitkomst = getal / getal2;
            tekstvak.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");



        }
    }

}

