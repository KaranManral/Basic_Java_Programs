//WAP to find Mean,Variance and Standard Deviation on n numbers.

import java.util.*;
public class Mean {

	static void input(double a[],int n) //Function to take input of n numbers 
	{ 
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter "+ n +" numbers"); 
	    for(int i=0;i<n;i++) 
	        a[i]=sc.nextDouble(); 
	} 
 
	static double calcMean(double a[],int n) //Function to calculate mean 
	{ 
	    double avg=0.0; 
	    for(int i=0;i<n;i++) 
	        avg+=a[i]; 
	    return (avg/n);     
	} 
	  
	static double calcVar(double a[],int n)//Function to calculate Variance 
	{ 
	    double avg=0.0; 
	    for(int i=0;i<n;i++) 
	        avg+=Math.pow(a[i],2); 
	    avg=(avg/n)-Math.pow(calcMean(a,n),2); 
	    return avg;     
	} 
  
	static double calcSD(double a[],int n)   //Function to Calculate Standard Deviation 
	{ 
	    return (Math.pow(calcVar(a,n),0.5)); 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of n"); 
	    n=sc.nextInt(); 
	    double a[]=new double[n]; 
	    input(a,n);//Calling input function 
   
	    System.out.println("Mean of n numbers="+calcMean(a,n)); 
	    System.out.println("Variance of n number="+calcVar(a,n)); 
	    System.out.println("Standard Deviation of n numbers="+calcSD(a,n)); 
	}

}
