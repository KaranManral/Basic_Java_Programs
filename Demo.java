import java.io.*;
class ElectricityBill {

	private long consumerNo;
	private double numUnitsConsumed;
	private String consumerName,consumerAddress;
	private int consumerAge;
	private static int count;
	ElectricityBill(long cn,double u,String n,String a,int age)
	{
		consumerNo=cn;
		numUnitsConsumed=u;
		consumerName=n;
		consumerAddress=a;
		consumerAge=age;
		count++;
	}
	void display()
	{
		System.out.println("Consumer Number:- "+consumerNo);
		System.out.println("Consumer Name:- "+consumerName);
		System.out.println("Consumer Age:- "+consumerAge);
		System.out.println("Consumer Address:- "+consumerAddress);
		System.out.println("Total Bill:- Rs"+calculate());
	}
	double calculate()
	{
		if(numUnitsConsumed<=100)
			return 500.0;
		else if(numUnitsConsumed<=200)
			return (1.0*numUnitsConsumed+500.0);
		else if(numUnitsConsumed<=300)
			return (1.2*numUnitsConsumed+500.0);
		else 
			return (1.5*numUnitsConsumed+500.0);
	}
	void displayCount()
	{
		System.out.println("\n Total Number of Consumer bills till now="+count);
	}
}
public class Demo extends ElectricityBill
{
	Demo(long cn,double u,String n,String a,int age)
	{
		super(cn,u,n,a,age);
	}
	public void display()
	{
		super.display();
		displayCount();
	}
	public static void main(String[] args) throws IOException
	{
		String name,address;
		long cno;
		int a;
		double u;
		int ch=1;
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Enter your name");
			name=sc.readLine();
			System.out.println("Enter your Consumer Number");
			cno=Long.parseLong(sc.readLine());
			System.out.println("Enter your age");
			a=Integer.parseInt(sc.readLine());
			while(a<0)
			{
				try {
					if(a<0)
						throw new NegativeAgeException();
				}
				catch(NegativeAgeException e)
				{
					System.out.println(e.toString());
				}
				System.out.println("Enter your age");
				a=Integer.parseInt(sc.readLine());
			}
			System.out.println("Enter your address");
			address=sc.readLine();
			System.out.println("Enter the units consumed");
			u=Double.parseDouble(sc.readLine());
			Demo ob=new Demo(cno,u,name,address,a);
			ob.display();
			System.out.println("Do you want to calculate another bill? Enter 1 if yes");
			ch=Integer.parseInt(sc.readLine());
		}while(ch==1);
	}

}
class NegativeAgeException extends Exception
{
	public String toString()
	{
		return ("Error: Age cannot be negative!");
	}
}


