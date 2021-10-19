package P;
import java.awt.*;
import java.awt.event.*;
public class ResizeCross extends Frame {

	int w,h;
	ResizeCross()
	{
		setSize(150,150);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		w=getWidth();
		h=getHeight();
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				if(w==250||h==250)
				{
					w=150;
					h=150;
				}
				else
				{
					h+=10;
					w+=10;
				}
				setSize(w,h);
			}
		});
	}
	public void paint(Graphics g)
	{
		Insets insets=getInsets();
		g.drawLine(insets.left,insets.top,w-insets.right,h-insets.bottom);
		g.drawLine(w-insets.right,insets.top, insets.left,h-insets.bottom);
	}
	public static void main(String[] args) {
		ResizeCross ob=new ResizeCross();
		ob.repaint();
	}

}
