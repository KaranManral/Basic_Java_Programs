package P;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DisplayText extends JFrame{

	String s;
	JPanel jp;
	DisplayText(String s)
	{
		this.s=s;
		jp=new JPanel();
		setSize(300,300);
		jp.setLayout(new FlowLayout());
		jp.setBackground(Color.pink);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp.add(new JLabel(s));
		add(jp);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be displayed");
		String s=sc.nextLine();
		new DisplayText(s);
	}

}
