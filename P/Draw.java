package P;
import java.awt.*;
import java.awt.event.*;
public class Draw extends Frame{

	int l,d;
	Draw()
	{
		setSize(200,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		d=getWidth();
		l=getHeight();
	}

	public void paint(Graphics g)
	{
		Insets insets=getInsets();
		g.fillOval(insets.left,insets.top,d-insets.right-insets.left,l-insets.top-insets.bottom);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw ob=new Draw();
		ob.repaint();
	}

}
