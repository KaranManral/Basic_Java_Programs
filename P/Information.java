package P;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Information extends Frame{

	Button a,b;
	String n,c,clg,str[];
	int r;
	double cgpa;
	Information()
	{
		a=new Button("A");
		b=new Button("B");
		try {
			input();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setSize(250,250); //Setting Size of Frame
		setTitle("Display Information"); //Setting Title of Frame
		setLayout(new FlowLayout()); //Setting Layout of Frame
		add(a);
		add(b);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				str=("Name:"+n+"\nCourse:"+c+"\nRoll No.:"+r+"\nCollege:"+clg).split("\n");
				repaint();
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				str=new String[1];
				str[0]="CGPA of previous semester:"+cgpa;
				repaint();
			}
		});
		setVisible(true);
	}
	public void paint(Graphics g)//Function to display string
	{
		super.paint(g);
		int m=0;
		if(str!=null)
		{
			for(int i=0;i<str.length;i++)
			{
				g.drawString(str[i], 20,125+m);
				m+=20;
			}
		}
	}
	void input()throws IOException //Function taking details of Student
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the following details:");
		System.out.print("Name:");
		n=br.readLine();
		System.out.print("\nCourse:");
		c=br.readLine();
		System.out.print("\nRoll No.:");
		r=Integer.parseInt(br.readLine());
		System.out.print("\nCollege:");
		clg=br.readLine();
		System.out.print("\nCGPA of previous semester:");
		cgpa=Double.parseDouble(br.readLine());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Information();
	}

}