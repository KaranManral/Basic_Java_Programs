import java.util.*;
class Complex
{
	double x,y;
	Complex(double r,double i) //Parameterized Constructor
	{
		x=r;
		y=i;
	}
	
	Complex() //Default Constructor
	{
		x=0.0;
		y=0.0;
	}
	Complex add(Complex c) //Function to perform add operation	
	{
		Complex c1=new Complex();
		c1.x=x+c.x;
		c1.y=y+c.y;
		return c1;
	}
	Complex pro(Complex c) //Function to perform multiplication
	{
		Complex c1=new Complex();
		c1.x=(x*c.x)-(y*c.y);
		c1.y=(x*c.y)+(c.x*y);
		return c1;
	}
	public String toString()
	{
		return String.format(x+" + i "+y);
	}
}
public class ComplexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of a complex number");
		x=sc.nextDouble();
		y=sc.nextDouble();
		Complex ob=new Complex(x,y);
		System.out.println("Enter the choice \n 1 to add two numbers \n 2 to multiply two numbers");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter the real and imaginary part of 2nd complex number");
				x=sc.nextDouble();
				y=sc.nextDouble();
				Complex ob1=new Complex(x,y);
				Complex ob2=ob.add(ob1);
				System.out.println("1st complex number="+ob.toString());
				System.out.println("2nd complex number="+ob1.toString());
				System.out.println("Added complex number="+ob2.toString());
				break;
			}
			case 2:
			{
				System.out.println("Enter the real and imaginary part of 2nd complex number");
				x=sc.nextDouble();
				y=sc.nextDouble();
				Complex ob1=new Complex(x,y);
				Complex ob2=ob.pro(ob1);
				System.out.println("1st complex number="+ob.toString());
				System.out.println("2nd complex number="+ob1.toString());
				System.out.println("Multiplied complex number="+ob2.toString());
				break;
			}
			default:
			{
				System.out.println("Wrong Input,Program will exit now");
				System.exit(0);
			}
		}
	}

}
