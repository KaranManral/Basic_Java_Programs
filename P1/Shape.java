package P1;

public abstract class Shape
{
	public abstract double area();
	public void display()
	{
		System.out.println("The area is "+area());
	}
}
