import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class staafdiagram extends Applet{
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    Label label;
    Label label4;
    Label label2;
    Label label3;
    Button knop;
    int teller;
    int nulpunt;
    int persoon1;
    int persoon2;
    int persoon3;
    int persoon4;


    public void init(){
        label = new Label("persoon 1");
        add(label);
        tekstvak1 = new TextField("0", 5);
        add(tekstvak1);
        label2 = new Label("persoon 2");
        add(label2);
        tekstvak2 = new TextField("0", 5);
        add(tekstvak2);
        label3 = new Label("persoon3");
        add(label3);
        tekstvak3 = new TextField("0", 5);
        add(tekstvak3);
        label4 = new Label("persoon4");
        add(label4);
        tekstvak4 = new TextField("0", 5);
        add(tekstvak4);
        knop = new Button("ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        persoon1=0;
        persoon2=0;
        persoon3=0;
        persoon4=0;



    }
    public void paint(Graphics g){
        int y =100;
        nulpunt=700;
        for (teller = 200; teller >=0; teller-=20) {
            g.setColor(Color.gray);
            g.drawLine(50,y,650,y);
            g.setColor(Color.black);
            g.fillRect(50, 100, 2, 600);
            g.fillRect(50, 700, 600, 2);
            g.drawString(""+ teller, 20,y);
            y +=60;
            g.setColor(Color.blue);
            g.fillRect(130,nulpunt-persoon1,50,nulpunt-(nulpunt-persoon1));
            g.setColor(Color.red);
            g.fillRect(260,nulpunt-persoon2,50,nulpunt-(nulpunt-persoon2));
            g.setColor(Color.green);
            g.fillRect(390,nulpunt-persoon3,50,nulpunt-(nulpunt-persoon3));
            g.setColor(Color.yellow);
            g.fillRect(520,nulpunt-persoon4,50,nulpunt-(nulpunt-persoon4));
            g.setColor(Color.black);
            g.drawString("persoon1", 130,720);
            g.drawString("persoon2", 260,720);
            g.drawString("persoon3", 390,720);
            g.drawString("persoon4", 520,720);



        }

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            persoon1 = Integer.parseInt( tekstvak1.getText() )*3;
            persoon2 = Integer.parseInt( tekstvak2.getText() )*3;
            persoon3 = Integer.parseInt( tekstvak3.getText() )*3;
            persoon4 = Integer.parseInt( tekstvak4.getText() )*3;


            repaint();







        }
    }

}
