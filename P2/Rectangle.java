package P2;

public class Rectangle extends P1.Shape
{
	double l,b;
	public Rectangle(double l,double b) //Parameterized Constructor
	{
		this.l=l;
		this.b=b;
	}
	public double area() //Function to calculate area
	{
		return (l*b);
	}
	public void display() //Display function
	{
		super.display();
	}
}
