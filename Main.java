import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1.Shape ob; //Creating object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of Shape");
		String s=sc.nextLine();
		if(s.equalsIgnoreCase("Rectangle"))
		{
			double l,b;
			System.out.println("Enter the length and breadth of rectangle");
			l=sc.nextDouble();
			b=sc.nextDouble();
			ob=new P2.Rectangle(l,b); //Initializing object
			ob.display();
		}
		else if(s.equalsIgnoreCase("Circle"))
		{
			double r;
			System.out.println("Enter the radius of circle");
			r=sc.nextDouble();
			ob=new P3.Circle(r);//Initializing object
			ob.display();
		}
		else
		{
			System.out.println("Wrong Type Entered,Program Exit");
		}
	}

}
