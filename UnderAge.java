
public class UnderAge extends Exception {
	private int age;
	UnderAge(int a) //Constructor
	{
		age=a;
	}
	public String toString() //Overriding toString()
	{
		return ("Under Age ["+age+"]");
	}
}
