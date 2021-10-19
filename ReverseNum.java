import java.util.*;
public class ReverseNum {

	int reverse(int a) //Function to reverse a number
	{
		int rev=0; //Variable to store reversed number
		while(a>0)
		{
			rev=(rev*10)+(a%10);
			a/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ReverseNum ob=new ReverseNum();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Reversed Number="+ob.reverse(n));
	}

}
