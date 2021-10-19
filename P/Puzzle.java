package P;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.Timer;
import javax.swing.*;
import java.util.*;

public class Puzzle
{
	private Timer timer;
	private long st=-1,d=180000;
	JFrame jf=new JFrame("Puzzle");
	JButton[] b=new JButton[16]; //Array of Buttons for Puzzle Pieces
	JMenuBar mb=new JMenuBar();
	JMenu m=new JMenu("Options");
	JMenu n=new JMenu("TimeLeft:");
	JMenuItem m1=new JMenuItem("Solve");
	JMenuItem m2=new JMenuItem("Shuffle");
	Puzzle() //Constructor
	{
		jf.setSize(208,208);
		jf.setLayout(new GridLayout(4,4));
		jf.setResizable(false);
		jf.setJMenuBar(mb);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.add(m1);
		m.add(m2);
		mb.add(m);
		mb.add(n);
		for(int i=0;i<15;i++) //Allocating memory to each button
			b[i]=new JButton(Integer.toString(i+1));
		b[15]=new JButton(""); //Declaring last button's label null
		Collections.shuffle(Arrays.asList(b)); //Shuffling Array of Buttons 
		for(int i=0;i<16;i++) //Adding buttons to frame
			jf.add(b[i]);
		jf.setVisible(true);
		action();
	}
	
	private void action() //Method to record action performed on each button
	{
		timer=new Timer(10,new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(st<0)
					st=System.currentTimeMillis();
				long ct=System.currentTimeMillis()-st;
				if(ct>=d)
				{
					ct=d;
					st=d;
					congo();
				}
				SimpleDateFormat df=new SimpleDateFormat("mm:ss:SSS");
				df.setTimeZone(TimeZone.getTimeZone("UTC"));
				n.setText("TimeLeft: "+df.format(d-ct));
			}
		});
		for(int i=0;i<16;i++)
			b[i].addActionListener(new ActionListener()
					{
				public void actionPerformed(ActionEvent e) 
				{		
					timer.start();
					for(int i=0;i<16;i++) //Moving buttons if empty space is available
					{
						if(e.getSource()==b[i])
						{
							if(i>=4&&i<=11)
							{
								String s=b[i+1].getText();
								String s1=b[i-1].getText();
								String s2=b[i+4].getText();
								String s3=b[i-4].getText();
								String s4=b[i].getText();
								if(s.equals(""))
								{
									b[i+1].setText(s4);
									b[i].setText(s);
								}
								if(s1.equals(""))
								{
									b[i-1].setText(s4);
									b[i].setText(s1);
								}
								if(s2.equals(""))
								{
									b[i+4].setText(s4);
									b[i].setText(s2);
								}
								if(s3.equals(""))
								{	
									b[i-4].setText(s4);
									b[i].setText(s3);									
								}
							}
							else
							{
								if(i==0)
								{
									String s=b[i+1].getText();
									String s2=b[i+4].getText();
									String s4=b[i].getText();
									if(s.equals(""))
									{
										b[i+1].setText(s4);
										b[i].setText(s);										
									}
									if(s2.equals(""))
									{
										b[i+4].setText(s4);
										b[i].setText(s2);										
									}
								}
								else if(i<4)
								{
									String s=b[i+1].getText();
									String s1=b[i-1].getText();
									String s2=b[i+4].getText();
									String s4=b[i].getText();
									if(s.equals(""))
									{
										b[i+1].setText(s4);
										b[i].setText(s);										
									}
									if(s1.equals(""))
									{
										b[i-1].setText(s4);
										b[i].setText(s1);										
									}
									if(s2.equals(""))
									{
										b[i+4].setText(s4);
										b[i].setText(s2);										
									}
								}
								else if(i>11&&i!=15)
								{
									String s=b[i+1].getText();
									String s1=b[i-1].getText();
									String s3=b[i-4].getText();
									String s4=b[i].getText();
									if(s.equals(""))
									{
										b[i+1].setText(s4);
										b[i].setText(s);										
									}
									if(s1.equals(""))
									{
										b[i-1].setText(s4);
										b[i].setText(s1);										
									}
									if(s3.equals(""))
									{	
										b[i-4].setText(s4);
										b[i].setText(s3);										
									}
								}
								else
								{
									String s1=b[i-1].getText();
									String s3=b[i-4].getText();
									String s4=b[i].getText();
									if(s1.equals(""))
									{
										b[i-1].setText(s4);
										b[i].setText(s1);
										
									}
									if(s3.equals(""))
									{	
										b[i-4].setText(s4);
										b[i].setText(s3);					
									}
								}
							}
						}
						//Checking if the puzzle is solved
						if(b[0].getText().equals("1")&&b[1].getText().equals("2")&&b[2].getText().equals("3")&&b[3].getText().equals("4")&&b[4].getText().equals("5")&&b[5].getText().equals("6")&&b[6].getText().equals("7")&&b[7].getText().equals("8")&&b[8].getText().equals("9")&&b[9].getText().equals("10")&&b[10].getText().equals("11")&&b[11].getText().equals("12")&&b[12].getText().equals("13")&&b[13].getText().equals("14")&&b[14].getText().equals("15")&&b[15].getText().equals(""))
						{
							b[15].setText("16");
								congo(); //Calling function that displays Congratulations on completion of puzzle
							break;
						}
					}
				}
					});
		m1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				sortButton();
				congo();
			}
				});
		m2.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				shuffleAgain();
				timer.stop();
				st=-1;
			}
				});
	}
	private void sortButton() //Solving Puzzle
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		for(int i=0;i<16;i++)
			b[i].setText(Integer.toString(a[i]));
	}
	private void shuffleAgain() //Function to shuffle the buttons again
	{
		String a[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""};
		Collections.shuffle(Arrays.asList(a));
		for(int i=0;i<16;i++)
			b[i].setText(a[i]);
	}
	
	
	private void congo()
	{	
		timer.stop();
		JFrame ob=new JFrame();
		JButton b1=new JButton("Play Again");
		JButton b2=new JButton("Exit");
		jf.setEnabled(false);
		ob.setSize(200,105);
		ob.setLayout(new FlowLayout());
		ob.setResizable(false);
		ob.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel l=new JLabel();
		if(st==d)
			l.setText("Sorry,You Lose");
		else
			l.setText("Congrats,You Won");
		l.setOpaque(true);
		l.setFont(new Font("Times New Roman",Font.BOLD,19));
		l.setForeground(new Color(255,215,0));
		l.setBackground(new Color(0,0,128));
		ob.add(l);
		ob.add(b1);
		ob.add(b2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ob.dispose();
				jf.dispose();
				Puzzle.main(null);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		ob.setVisible(true);
	}

	public static void main(String[] args) {
		new Puzzle();
	}
}