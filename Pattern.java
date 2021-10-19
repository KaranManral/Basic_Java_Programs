import java.util.*; 
public class Pattern {

	static void print1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)			//Printing Spaces  
				System.out.print(" ");
			for(int j=1;j<=(i*2-1);j++)		//Printing Stars  
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void print2(int n)				//Function to print given pattern  
	{
		for(int i=1;i<=n;i++) 
		{
			for(int k=1;k<=i;k++)		//Printing left side stars  
				System.out.print("*");
			for(int j=n;j>=i;j--)		//Printing Spaces  
				System.out.print(" ");
			for(int l=n;l>=i;l--)		//Printing Spaces for right stars  
				System.out.print(" ");
			for(int m=1;m<=i;m++)		//Printing Right Stars  
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void print3(int n)		//Function to print given pattern  
	{
		for(int i=1;i<=n/2+1;i++)		//Printing Upper Diamond  
		{
			for(int k=n;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=(i*2-1);j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n/2;i>=1;i--)			//Printing Lower Diamond  
		{
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int k=(i*2-1);k>=1;k--)
				System.out.print("*");
			System.out.println();
		} 
	}
	
	static void print4(int n)			//Function to print given pattern  
	{
		int k;
		System.out.println("1");
		for(int i=1;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
				System.out.print(" ");
			for(k=1;k<=i;k++)
				System.out.print(k);	
			for(int l=k;l>=1;l--)
				System.out.print(l);
			System.out.println();
		} 
	} 

	static void print5(int n)		//Function to print given pattern  
	{
		int c=1;
		int k;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(k=0;k<=i;k++)
			{
				if(i==0||k==0)
					c=1;
				else
					c=c*(i-k+1)/k;
				System.out.print(" "+c);
			} 
			System.out.println();
		}
	}

	static void print6()		//Function to print pattern upto line 5  
	{
		for(int r=0;r<5;r++)		//Loop for rows  
		{ 
			for(int c=65;c<=69-r;c++)		//Loop to print first half  
				System.out.print((char)c);	
			for(int i=1;i<=r*2-1;i++)		//Loop for spaces  
				System.out.print(" ");	
			if(r==0)
				System.out.print("\b");		//Removing extra E  
			for(int j=69+r;j<=73;j++)	//Loop for printing second half  
				System.out.print((char)j);	
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,ch;
			System.out.println("Enter choice: \n 1 for first pattern \n 2 for second pattern \n 3 for third pattern \n 4 for fourth pattern \n 5 for fifth pattern \n 6 for sixth pattern"); 
			ch=sc.nextInt(); 
			switch(ch)
			{ 
				case 1: 
				{
					System.out.println("Enter the number of lines to be printed in pattern");
					n=sc.nextInt();
					print1(n); 
					break;
				} 
				case 2: 
				{
					System.out.println("Enter the number of lines to be printed in pattern");
					n=sc.nextInt();
					print2(n);
					break;
				}
				case 3: 
				{
					System.out.println("Enter the number of lines to be printed in pattern");
					n=sc.nextInt();
					print3(n);
					break; 
				}
				case 4: 
				{
					System.out.println("Enter the number of lines to be printed in pattern");
					n=sc.nextInt();
					print4(n); 
					break;
				}
				case 5: 
				{
					System.out.println("Enter the number of lines to be printed in pattern");
					n=sc.nextInt();
					print5(n);
					break;
				} 
				case 6: 
				{
					print6();
					break;
				}
				default: 
				{
					System.out.println("WRONG CHOICE,PROGRAM EXIT");
					System.exit(0);
				}
			}

	}
}
