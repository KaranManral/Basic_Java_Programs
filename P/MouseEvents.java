package P;

import java.awt.*;
import java.awt.event.*;
import java.util.*; 

public class MouseEvents extends Frame
{
	int a,b;
	MouseEvents(int a,int b)
	{
		this.a=a;
		this.b=b;
		setSize(a,b);
		setTitle("Mouse Event");
		setLayout(new FlowLayout());
		Label l=new Label("Mouse Enterred the Frame");
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				add(l);
validate();
			}
			public void mouseExited(MouseEvent e)
			{
				remove(l);
validate();
			}
		});
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width of the Frame");
		int a=sc.nextInt();
		System.out.println("Enter the height of the Frame");
		int b=sc.nextInt();
		new MouseEvents(a,b);
	}

}
