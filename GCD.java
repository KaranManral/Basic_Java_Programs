//WAP to calculate GCD of two Numbers. 

import java.util.*;
public class GCD {

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
 
	static int gcd(int n1,int n2) //Function to Calculate Greatest Common Divisor 
	{ 
	    int pro=1; 
	    for(int i=1;(i<=n1 && i<=n2);i++) 
	    { 
	        if(n1%i==0) //Checking for divisibility of n1 
	            if(n2%i==0)  //Checking for divisibility of n2 
	                if(checkPrime(i)) //Checking for Prime 
	                { 
	                    pro*=i; 
	                    n1/=i; 
	                    n2/=i; 
	                    i=1; 
	                } 
	    } 
	    return pro; 
	} 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n1,n2; 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers"); 
	    n1=sc.nextInt();
	    n2=sc.nextInt(); 
	    System.out.print("GCD of "+n1+" and "+n2+" is "+gcd(n1,n2));  //Calling GCD 
	}

}
