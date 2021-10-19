/*Write a function to find whether a given number is prime or not. Use the same to generate   
first n prime numbers  
prime numbers up to n  
n prime numbers starting from m */ 

import java.util.*;
public class Prime {

	static boolean checkPrime(int n)    //Function to check if prime 
	{ 
	    int ctr=0; 
	    for(int i=1;i<=n/2;i++) 
	    { 
	        if(n%i==0) 
	            ctr++; 
	    } 
	    if(ctr==1) 
	        return true; 
	    else 
	        return false;     
	} 

	static void printFirstnPrime(int n)   //Printing first n prime numbers 
	{ 
	    int c=0; 
	    System.out.print("\n\n First "+n+" Prime Numbers are: "); 
	    for(int i=1;;i++) 
	    { 
	        if(checkPrime(i)==true) 
	        { 
	            System.out.print(i+"\t");    //Checking for prime 
	            c++; 
	        } 

	        if(c==n)      //Exiting loop when n prime numbers are printed 
	            break; 
	    } 
	} 

	static void printPrimeUpton(int n)   //Printing prime numbers upto n 
	{ 
	    System.out.print("\n\n Prime Numbers upto "+n+" are: "); 
	    for(int i=1;i<=n;i++) 
	    { 
	        if(checkPrime(i)==true)   //Checking for prime 
	            System.out.print(i+"\t"); 
	    } 
	} 

	static void printPrimemTon(int m,int n)   //Printing prime numbers from m to n 
	{ 
	    System.out.print("\n\n Prime Numbers from "+m+" to "+n+" are: "); 
	    for(int i=m;i<=n;i++) 
	    { 
	        if(checkPrime(i)==true)   //Checking for prime 
	            System.out.print(i+"\t"); 
	    } 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n; 
		Scanner sc=new Scanner(System.in);
	    System.out.println("\n Enter the value of n"); 
	    n=sc.nextInt(); 
	    for(;;)
	    {
	    	System.out.println("\n Enter the value of m"); 
	    	m=sc.nextInt(); 
	    	if(m>n) 
	    	{ 
	    		System.out.println("\n Wrong input m should be less than n"); 
	        	continue; 
	    	} 
	    	break;
	    }
	    printFirstnPrime(n);  //Calling function 
	    printPrimeUpton(n);  //Calling Function 
	    printPrimemTon(m,n);  //Calling Function 

	}

}
