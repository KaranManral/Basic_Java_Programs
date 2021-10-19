package P;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Emoji extends Frame implements ActionListener 
{
	BufferedImage i;
	String s="";
	Button b=new Button("Smilie");
	Button b1=new Button("Sad");
	Button b2=new Button("Upside-Down Smilie");
	Button b3=new Button("Smile-Cry");
	Emoji()
	{
		setSize(400,400);
		setLayout(new FlowLayout());
		setTitle("Emoji");
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setBackground(Color.BLACK);

		add(b);
		add(b1);
		add(b2);
		add(b3);
	}
	public void setShape()
	{	
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			s="Smilie";
			repaint();
		}
		if(e.getSource()==b1)
		{
			s="Sad";
			repaint();
		}
		if(e.getSource()==b2)
		{
			s="Upside-Down Smilie";
			repaint();
		}
		if(e.getSource()==b3)
		{
			s="Smile-Cry";
			repaint();
		}
	}
	public void draw(Graphics g)
	{
		Insets insets=getInsets();
		g.setColor(Color.yellow);
		g.fillOval(insets.left+20,50+insets.top,230, 230);
		g.setColor(Color.black);
		g.fillOval(insets.left+75,insets.top+100 ,30, 30);
		g.fillOval(insets.right+168,insets.top+100 ,30, 30);
		g.drawArc(insets.left+60, insets.bottom+120, 150, 150, -155, 130);
	}
	public void draw1(Graphics g)
	{
		Insets insets=getInsets();
		g.setColor(Color.yellow);
		g.fillOval(insets.left+20,50+insets.top,230, 230);
		g.setColor(Color.black);
		g.fillOval(insets.left+75,insets.top+100 ,20, 20);
		g.fillOval(insets.right+180,insets.top+100 ,20, 20);
		g.drawArc(insets.left+60, insets.bottom+200, 150, 150, 155, -130);
	}
	public void draw2(Graphics g)
	{
		Insets insets=getInsets();
		g.setColor(Color.yellow);
		g.fillOval(insets.left+20,50+insets.top,230, 230);
		g.setColor(Color.black);
		g.fillOval(insets.left+75,insets.bottom+240 ,20, 20);
		g.fillOval(insets.right+180,insets.bottom+240 ,20, 20);
		g.drawArc(insets.left+60, 90+insets.top, 150, 150, 155, -130);
	}
	public void draw3(Graphics g)
	{
		try {
			i=ImageIO.read(new File("D:\\Eclipse\\JAVA_CODES\\src\\P\\drop.jpg"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		Insets insets=getInsets();
		g.setColor(Color.yellow);
		g.fillOval(insets.left+20,50+insets.top,230, 230);
		g.setColor(Color.black);
		g.fillOval(insets.left+75,insets.top+100 ,30, 30);
		g.fillOval(insets.right+168,insets.top+100 ,30, 30);
		g.drawArc(insets.left+60, insets.bottom+120, 150, 150, -155, 130);
		g.drawImage(i,insets.right+160,insets.top+130,null);
	}
	public void paint(Graphics g)
	{
		Insets insets=getInsets();
		if(s.equals("Smilie"))
		{
			g.clearRect(insets.left,insets.top, 400, 400);
			draw(g);
		}
		if(s.equals("Sad"))
		{
			g.clearRect(insets.left,insets.top, 400, 400);
			draw1(g);
		}
		if(s.equals("Upside-Down Smilie"))
		{
			g.clearRect(insets.left,insets.top, 400, 400);
			draw2(g);
		}
		if(s.equals("Smile-Cry"))
		{
			g.clearRect(insets.left,insets.top, 400, 400);
			draw3(g);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emoji a=new Emoji();
		a.setShape();
	}

}
