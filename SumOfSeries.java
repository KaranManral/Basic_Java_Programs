import java.util.Scanner;
public class SumOfSeries {

	int calFact(int n)    //Function to calculate Factorial
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact*=i;    //Calculating Factorial
		}
		return fact;
	}

	double series1(int n)
	{
		double sum=0,a=1;
		for(int i=1;i<=n;i++)
		{
			sum+=a/i;   //Calculate sum of series 1
		}
		return sum;
	}

	double series2(int n)
	{
		double sum=0,a=1;
		for(int i=1;i<=n;i++)
		{
			sum+=a/(calFact(i));     //Calculate sum of series 1 by calculating factorial of i
		}
		return sum;
	}

	int series3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)   //Checking for even.
				sum+=(-i);
			else
				sum+=i;	
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SumOfSeries ob=new SumOfSeries();
		System.out.println("Enter a limit n of the series");
		int n=sc.nextInt();
		System.out.println("Enter the choice \n1 for Sum of series 1 \n2 for Sum of series 2 \n3 for Sum of series 3");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				{
					System.out.println("Sum of series1="+ob.series1(n));
					break;
				}
			case 2:
				{
					System.out.println("Sum of series2="+ob.series2(n));
					break;
				}
			case 3:
				{
					System.out.println("Sum of series3="+ob.series3(n));
					break;
				}
			default:
				{
					System.out.println("Wrong Choice entered,the program will exit now");
				}
		}
	}

}
