package P;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dialogue extends JFrame{
	Dialogue()
	{
		setSize(300,200);
		setLayout(null);
		setLocation(541,311);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic-Tac-Toe");
		setVisible(true);		
	}
	public void paint(Graphics g)
	{
		Insets insets=getInsets();
		g.drawLine(insets.left+50,insets.top+50,insets.left+200,insets.top+50);
		g.setFont(new Font("Times New Roman",Font.BOLD,24));
	}

	public static void main(String[] args)
	{
		Dialogue d=new Dialogue();
		d.repaint();
	}
}

