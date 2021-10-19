import java.util.*;
public class SumProduct {

	int sum(int a)//Function to Calculate Sum of Digits of Number
	{
		int sum=0;
		while(a>0)
		{
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	
	int product(int a)//Function to Calculate Product of Digits of number
	{
		int pro=1;
		while(a>0)
		{
			pro*=a%10;
			a/=10;
		}
		return pro;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SumProduct ob=new SumProduct();
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		System.out.println("Sum of Digits of Integer="+ob.sum(n));
		System.out.println("Product of Digits of Integer="+ob.product(n));
	}

}
