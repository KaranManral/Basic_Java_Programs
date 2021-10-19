package P3;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Project1 extends Frame
{
    BufferedImage i;
    Project1()
    {
        setSize(610,600);
        setLayout(null);
        setBackground(Color.cyan);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent we)
        {
        System.exit(0);
        }
      });
    }
    public void draw(Graphics g)
	{
		try {
			i=ImageIO.read(new File("C:\\Users\\admin\\downloads\\1.jpeg"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		g.drawImage(i,160,130,null);
	}
		
	public void draw1(Graphics g)
	{
		/*try {
			i=ImageIO.read(new File("C:\\Users\\admin\\downloads\\2.jpeg"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("C:/Users/admin/downloads/2.jpeg");
		Insets insets=getInsets();
		
		g.drawImage(i,insets.right-160,insets.top-130,null);
	}
    public static void main(String[] args) {
        Project1 ob = new Project1();
    }
    public void paint(Graphics g)
    {
       
        g.setColor(Color.yellow);
        g.fillArc(145,100,120,200,0,180);
        Color b = new Color(150,75,0); 
        g.setColor(b);
        g.drawLine(0,200,500,200);
        int x[]={10,100,200,10};
        int y[]={200,50,200,200};
        g.fillPolygon(x,y,4);
        int x1[]={200,300,400,200};
        int y1[]={200,50,200,200};
        g.fillPolygon(x1,y1,4);
        int x2[]={400,500,600,400};
        int y2[]={200,50,200,200};
        g.fillPolygon(x2,y2,4);
        Color c = new Color(21,151,232);
        g.setColor(c);
        int x3[]={0,200,400,250,0};
        int y3[]={600,200,200,600,600};
        g.fillPolygon(x3,y3,5);
        Color d = new Color(141,232,21);
        g.setColor(d);
        int x4[]={0,0,200,0};
        int y4[]={600,200,200,600};
        g.fillPolygon(x4,y4,4);
        g.setColor(Color.LIGHT_GRAY);
        int x8[]={10,10,30,30,10};
        int y8[]={600,300,300,600,600};
        g.fillPolygon(x8,y8,5);
        Color e = new Color(56,133,12);
        g.setColor(e);
        int x5[]={400,600,600,250,400};
        int y5[]={200,200,600,600,200};
        g.fillPolygon(x5,y5,5);
        g.setColor(Color.ORANGE);
        g.fillRect(450,500,150,100);
        g.setColor(Color.magenta);
        g.fillRect(400,500,70,100);
        g.setColor(Color.red);
        int x6[]={400,430,470,400};
        int y6[]={500,450,500,500};
        g.fillPolygon(x6,y6,4);
        Color f = new Color(12,30,133);
        g.setColor(f);
        int x7[]={430,600,600,470,430};
        int y7[]={450,450,500,500,450};
        g.fillPolygon(x7,y7,5);
        
        g.setColor(Color.LIGHT_GRAY);
        int x9[]={330,330,350,350,330};
        int y9[]={400,220,220,400,400};
        g.fillPolygon(x9,y9,5);
        g.setColor(Color.black);
        g.drawLine(30,300,330,220);
        g.drawLine(30,320,330,240);
        g.drawLine(350,220,600,130);
        g.drawLine(350,240,600,150);

        Color h = new Color(150,75,0);
        g.setColor(h);
        g.fillRect(415,530,35,70);
        g.drawRect(520,530,40,40);
        g.drawLine(540,530,540,570);
        g.drawLine(520,550,560,550);
        g.fillOval(250,570,80,30);
        g.fillOval(280,550,60,30);
        g.fillOval(330,570,70,20);
        g.fillOval(340,550,60,20);
        g.fillOval(320,400,60,30);
        g.fillOval(350,390,70,30);
        g.setColor(Color.white);
        g.drawLine(125,550,150,500);
        g.drawLine(170,300,195,250);
        g.drawLine(160,350,185,310);
        g.drawLine(200,400,220,350);
        g.drawLine(245,300,270,250);
        g.drawLine(265,330,290,280);
        g.drawLine(220,410,250,370);
        g.drawLine(220,420,240,380);
        g.drawLine(100,500,140,440);
        g.drawLine(80,580,120,540);
        g.drawLine(90,550,130,500);
        g.drawLine(250,420,280,370);
        g.drawLine(215,600,240,550);
        g.drawLine(180,580,210,530);
        g.drawLine(280,450,300,400);
        g.drawLine(260,500,280,460);
        g.drawLine(220,500,240,460);
        g.setColor(Color.YELLOW);
        g.drawLine(155,125,130,80);
        g.drawLine(160,122,150,100);
        g.drawLine(172,138,155,80);
        g.drawLine(175,107,170,60);
        g.drawLine(185,102,183,70);
        g.drawLine(198,95,200,60);
        g.drawLine(210,98,225,55);
        g.drawLine(225,103,240,55);
        g.drawLine(225,138,245,80);
        g.drawLine(245,122,272,70);
        draw(g);
        draw1(g);
    }
}