package P1;

public class TwoDim {
	
	private double x,y;
	public TwoDim()
	{
		x=0.0;
		y=0.0;
	}
	public TwoDim(double a,double b)
	{
		x=a;
		y=b;
	}
	public String toString()
	{
		return String.format("X cordinate="+x+"\nY cordinate="+y);
	}
	public void print()
	{
		System.out.println("The cordinates are:\n"+toString());
	}
}
