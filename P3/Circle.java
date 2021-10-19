package P3;

public class Circle extends P1.Shape
{
	double r;
	public Circle(double r) //Parameterized Constructor
	{
		this.r=r;
	}
	public double area() //Calculating Area
	{
		return (3.14*r*r);
	}
	public void display() //Display Function
	{
		super.display();
	}
}
