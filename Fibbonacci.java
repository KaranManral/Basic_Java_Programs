//WAP to print Fibbonacci Series
import java.io.*;
public class Fibbonacci {
	static void printSeries(int n)//Function to print Fibonacci Series 
	{ 
	    int a=1,b=1,c; 
	    System.out.print(a); 
	    for(int i=1;i<n;i++) 
	    { 
	        System.out.print(" "+b+" "); 
	        c=a+b; 
	        a=b; 
	        b=c; 
	    } 
	} 
	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		int n; 
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter n upto which Fibonacci Series is to be printed"); 
	    n=Integer.parseInt(in.readLine()); 
	    printSeries(n);//Calling printSeries 
	}

}
