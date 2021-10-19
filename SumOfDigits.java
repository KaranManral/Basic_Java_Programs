import java.util.*;
public class SumOfDigits {
	public int sumOfDigits(int a)//Function Returning Sum of Digits
	{
		if(a<=0)
			return 0;
		else
			return (a%10)+sumOfDigits(a/10);
	}
	public boolean isPrime(int x)
    {
        int ctr=0;
        for(int i=1;i<=x/2;i++)
            if(x%i==0)
                ctr++;
        if(ctr==1)
            return true;
        else 
            return false;
    }
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate sum of digits and check for prime");
		i=sc.nextInt();
		SumOfDigits ob=new SumOfDigits(); //Creating object of Sum functions
		System.out.println("Sum of Digits="+ob.sumOfDigits(i));
		if(ob.isPrime(i))
			System.out.println(i+" is Prime");
		else
			System.out.println(i+" is not Prime");
		sc.close();
	}
}