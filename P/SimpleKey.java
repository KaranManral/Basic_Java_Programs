package P;
import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame implements KeyListener 
{
	String msg="";
	String keyState="";
	public SimpleKey()
	{
		addKeyListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void keyPressed(KeyEvent Ke)
	{
		keyState="Key Down";
		int key=Ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
			{
				msg+="<F1>";
				break;
			}
			case KeyEvent.VK_F2:
			{
				msg+="<F2>";
				break;
			}
			case KeyEvent.VK_F3:
			{
				msg+="<F3>";
				break;
			}
			case KeyEvent.VK_PAGE_UP:
			{
				msg+="<PgUp>";
				break;
			}
			case KeyEvent.VK_PAGE_DOWN:
			{
				msg+="<PgDown>";
				break;
			}
			case KeyEvent.VK_LEFT:
			{
				msg+="<Left Arrow>";
				break;
			}
			case KeyEvent.VK_RIGHT:
			{
				msg+="<Right Arrow>";
				break;
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent Ke)
	{
		keyState="Key Up";
		repaint();
	}
	public void keyTyped(KeyEvent Ke)
	{
		msg+=Ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 100);
		g.drawString(keyState, 20, 50);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleKey appwin=new SimpleKey();
		appwin.setSize(new Dimension(200,150));
		appwin.setTitle("SimpleKey");
		appwin.setVisible(true);
	}

}

