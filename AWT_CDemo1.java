import java.awt.*;
import javax.swing.*;

class Projdoraemon extends JPanel{

    public void paint (Graphics g) {
       super.paint(g);
        
        g.setColor(Color.white);
        g.fillRect(100, 200, 370, 450);
       
         g.setColor(Color.cyan);
        g.fillOval(165,60,250,250);//BODY
        g.fillRect(215, 290, 150, 120);//BODY
        //  int[]x={};
        //  int[]y={};
        //  g.drawPolygon(x,y,5);
      
        


        g.setColor(Color.white);
        g.fillOval(185, 100, 200, 180); //FACE
        g.fillOval(223, 280, 120, 112); //BODY
        g.setColor(Color.red);                     //BELT
        g.fillRoundRect(203, 275, 166, 16, 15, 15);//BELT
        g.setColor(Color.yellow);     //BELL
        g.fillOval(263, 273, 30, 30);//BELL
        g.setColor(Color.black);    // BELL   
        g.fillOval(273,283,10,10);  // BELL
        g.drawLine(277,304,275,284);// BELL

        g.drawArc(248, 290, 70, 70, 0, -180);//POCKET
        g.drawLine(316, 325, 249, 325);//POCKET
        g.setColor(Color.white);
        g.fillOval(223,	80, 60, 70);//EYES
        g.fillOval(283, 80, 60, 70);//EYES
        g.setColor(Color.black);//EYES
        g.drawOval(223,80,60,70);//EYES
        g.drawOval(283,80,60,70);//EYES
        g.fillOval(260, 108, 20 ,20);//EYES
        g.fillOval(286, 108, 20, 20);//EYES
        g.setColor(Color.white);//EYES
        g.fillOval(267, 114, 6 ,6);//EYES
        g.fillOval(290, 114, 6, 6);//EYES
       
        g.setColor(Color.red);
        g.fillOval(269, 158, 27, 27);//NOSE
        g.setColor(Color.black);
        g.drawOval(269,158,27,27);//NOSE
        g.setColor(Color.white);
        g.fillOval(284, 161, 10, 13);



        g.setColor(Color.black);
        g.drawArc(190, 60, 190, 190, -45,-90);//NOSE
        g.drawLine(283, 185, 283, 250);//NOSE
        g.drawLine(200,182,248, 189);  //WHISKERS
        g.drawLine(223, 200, 248, 200);//WHISKERS
        g.drawLine(198, 217, 248, 211);//WHISKERS

        g.drawLine(319, 189, 368, 182);//WHISKERS
        g.drawLine(319,200, 372, 200);//WHISKERS
        g.drawLine(319, 211, 369, 218);//WHISKERS
       
        g.setColor(Color.white);
        g.fillOval(141,241,40,40);  //HAND
        g.fillOval(392, 305, 40, 40); //HAND
        g.fillOval(190, 405, 90, 25); //FEET
        g.fillOval(286, 405, 90, 25);//FEET
        g.setColor(Color.black);
        g.drawOval(141,241,40,40);  //HAND
        g.drawOval(392, 305, 40, 40);//HAND
        g.drawOval(190, 405, 90, 35);//FEET
        g.drawOval(286, 405, 90, 35);//FEET
    }
}
 public class AWT_CDemo1
 {
	 public AWT_CDemo1()
	 {
	     JFrame jfrm=new JFrame("DRAWING DORAEMON");
	     JPanel jpnl=new Projdoraemon();
	      jfrm.setSize(700,500);
	      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      jfrm.add(jpnl);
	      jfrm.setVisible(true);            
	   }
	 public static void main(String[] args) {
	        new AWT_CDemo1();
	        
	    }
 }
 