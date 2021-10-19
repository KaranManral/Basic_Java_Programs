package P;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Colour extends JFrame implements ActionListener{

	JButton b=new JButton("Red"); //Button for Red Color
	JButton b1=new JButton("Blue"); //Button for Blue Color
	JLabel l=new JLabel(); //Label to display color
	JPanel jp;
	Colour()
	{
		jp=new JPanel(); 
		setSize(300,300);
		jp.setLayout(new FlowLayout());
		setTitle("Color");
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Setting Close Operation
		jp.add(b);
		jp.add(b1);
		jp.add(l);
		add(jp);
		setVisible(true);
	}
	public void setColor()
	{	
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			b1.setForeground(Color.black);
			b.setForeground(Color.red);
			l.setText("This is Red");
			jp.setBackground(Color.red); //Setting background red on red button press
		}
		if(e.getSource()==b1)
		{
			b.setForeground(Color.black);
			b1.setForeground(Color.blue);
			l.setText("This is Blue");
			jp.setBackground(Color.blue);//Setting background blue on blue button press
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour ob=new Colour();
		ob.setColor();
	}

}
