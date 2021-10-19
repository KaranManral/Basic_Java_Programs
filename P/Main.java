package P;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cordinates x,y,z");
		double x=sc.nextInt();
		double y=sc.nextInt();
		double z=sc.nextInt();
		P1.TwoDim ob=new P1.TwoDim(x,y);
		ob.print();
		ob=new P2.ThreeDim(x,y,z);
		ob.print();
	}

}
