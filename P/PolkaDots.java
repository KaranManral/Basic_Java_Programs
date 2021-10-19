package P;
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class PolkaDots{
	JFrame jf=new JFrame("Polka Dots");
	JPanel jp;
	PolkaDots()
	{
		jf.setSize(150,150);
		jp=new JP();
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PolkaDots();
	}

}
class JP extends JPanel
{
	int t;
	Random r;
	Insets insets=getInsets();
	JP()
	{
		r=new Random();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i=0;i<10;i++)
		{
			t=(r.nextInt((getWidth()-insets.left-insets.right)-insets.left))/4;
			g.fillOval((r.nextInt(getWidth()-insets.left-insets.right))/2,(r.nextInt(getHeight()-insets.top-insets.bottom))/2,t,t);	
			Color c=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
			g.setColor(c);
		}
	}
}
