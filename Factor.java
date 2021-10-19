//WAP to print Factors and prime factors of a number

import java.util.*;
public class Factor {

	static boolean checkPrime(int n)    //Function to check if prime 
	{ 
	    int ctr=0; 
	    for(int i=1;i<=n/2;i++) 
	    { 
	        if(n%i==0)       //Checking for divisibility
	            ctr++;      //Increasing counter if divisible..
	    } 
	    if(ctr==1) 
	        return true; 
	    else 
	        return false;     
	} 

	static void printFactors(int n)       //Function to print factors
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+"\t");
		}
	}

	static void printPFactors(int n)       //Function to print Prime factors
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			if(checkPrime(i))     //Checking for prime
				System.out.print(i+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.print("Factors of "+num+" are: ");
		printFactors(num);                                    //Calling printFactors()
		System.out.print("\nPrime Factors of "+num+" are: ");
		printPFactors(num);									//Calling printPFactors()
	}

}
