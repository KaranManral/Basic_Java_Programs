import java.util.*;
public class DecToBin {

	static String reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		return s1;
	}
	
	int decToBin(int a) //Recursive Function to convert +ve no. into binary
	{
		if(a<=0)
			return 0;
		else
			return (a%2)+10*decToBin(a/2);
	}
	
	String decBin(int a)//Function to return binary of +ve no. using String
	{
		String s="",s1="";
		while(a>0)
		{
			int d=a%2;
			s+=Integer.toString(d);
			a/=2;
		}
		s1=reverse(s);
		s="";
		for(int i=0;i<(32-s1.length());i++)
			s+="0";
		s+=s1;
		return s;
	}
	
	String negBin(String s)
	{
		String s1="";
		int c=0;
		for(int i=31;i>=0;i--)
		{
			if(c<1)
			{
				if(s.charAt(i)=='1')
				{
					s1+=s.charAt(i);
					c++;
				}
				else
					s1+=s.charAt(i);
			}
			else
			{
				if(s.charAt(i)=='1')
					s1+="0";
				else
					s1+="1";
			}
		}
		s=reverse(s1);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DecToBin ob=new DecToBin();
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=Math.abs(a);
		if(a>=0)
		{
			System.out.println("Binary using recursion \n"+ob.decToBin(a));
			System.out.println("Binary using string \n"+ob.decBin(a));
			System.out.println("Binary using inbuilt function \n"+Integer.toBinaryString(a));//Using inbuilt function to calculate binary of any number
		}
		else
		{	
			String s=ob.decBin(b);
			System.out.println("Binary using string \n"+ob.negBin(s));
			System.out.println("Binary using inbuilt function \n"+Integer.toBinaryString(a));//Using inbuilt function to calculate binary of any number
		}
	}

}
