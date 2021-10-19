package P2;

public class ThreeDim extends P1.TwoDim
{
	private double z;
	public ThreeDim()
	{
		super();
		z=0.0;
	}
	public ThreeDim(double a,double b,double c)
	{
		super(a,b);
		z=c;
	}
	public String toString()
	{
		return String.format("\nZ cordinate="+z);
	}
	public void print()
	{
		System.out.println("The cordinates are:"+toString());
	}
}
