import java.util.*;

class Rational
{
	int numerator,denomenator;
	Rational()
	{
		numerator=0;
		denomenator=1;
	}
	Rational(int n,int d)
	{
		numerator=n;
		denomenator=d;
	}
	private boolean checkPrime(int n)    //Function to check if prime 
	{ 
	    int ctr=0; 
	    for(int i=1;i<=n/2;i++) 
	    { 
	        if(n%i==0)       //Checking for divisibility
	            ctr++;      //Increasing counter if divisible..
	    } 
	    if(ctr==1) 
	        return true; 
	    else 
	        return false;     
	}
	private int gcd(int n1,int n2) //Function to Calculate Greatest Common Divisor
	{
		int pro=1;
		for(int i=1;(i<=n1)&&(i<=n2);i++)
		{
			if(n1%i==0) //Checking for divisibility of n1
				if(n2%i==0)  //Checking for divisibility of n2
					if(checkPrime(i)) //Checking for Prime
					{
						pro*=i;
						n1/=i;
						n2/=i;
						i=1;
					}
		}
		return pro;
	}
	void print()
	{
		System.out.println("Rational Number="+numerator+"/"+denomenator);
	}
	Rational add(Rational f)
	{
		Rational f1=new Rational();
		int lcm=denomenator*f.denomenator;
		f1.numerator=(numerator*f.denomenator)+(f.numerator*denomenator);
		f1.denomenator=lcm;
		return f1;
	}
	Rational pro(Rational f)
	{
		Rational f1=new Rational();
		f1.numerator=numerator*f.numerator;
		f1.denomenator=denomenator*f.denomenator;
		return f1;
	}
	Rational simplify()
	{
		Rational ob=new Rational();
		int temp=gcd(numerator,denomenator);
		ob.numerator=numerator/temp;
		ob.denomenator=denomenator/temp;
		return ob;
	}
}

public class RationalDemo extends Rational {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator of rational number");
		int n=sc.nextInt();
		System.out.println("Enter the denomenator of rational number");
		int d=sc.nextInt();
		Rational ob=new Rational(n,d);
		System.out.println("Enter the choice \n 1 to print simplified rational number \n 2 to perform addition \n 3 to perform multiplication");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				ob.print();
				Rational ob1=new Rational();
				ob1=ob.simplify();
				System.out.println("After Simplification");
				ob1.print();
				break;
			}
			case 2:
			{
				System.out.println("Enter the numerator of rational number");
				int a=sc.nextInt();
				System.out.println("Enter the denomenator of rational number");
				int b=sc.nextInt();
				Rational ob1=new Rational(a,b);
				Rational ob2=new Rational();
				ob.print();
				ob1.print();
				ob2=ob.add(ob1);
				System.out.println("After Additon");
				ob2.print();
				ob2=ob2.simplify();
				System.out.println("Simplified Answer");
				ob2.print();
				break;
			}
			case 3:
			{
				System.out.println("Enter the numerator of rational number");
				int a=sc.nextInt();
				System.out.println("Enter the denomenator of rational number");
				int b=sc.nextInt();
				Rational ob1=new Rational(a,b);
				Rational ob2=new Rational();
				ob.print();
				ob1.print();
				ob2=ob.pro(ob1);
				System.out.println("After Multiplication");
				ob2.print();
				ob2=ob2.simplify();
				System.out.println("Simplified Answer");
				ob2.print();
				break;
			}
			default:
			{
				System.out.println("Wrong choice entered,Program will exit");
				System.exit(0);
			}
		}
	}

}
