import java.util.Scanner;

class Matrix //Super class
{
	int a[][],r,c;
	Matrix()
	{
		r=0;
		c=0;
		a=new int[r][c];
	}
	Matrix(int x,int y)
	{
		r=x;
		c=y;
		a=new int[r][c];
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
	}
	Matrix Add(Matrix A)  //Add Function to add two similar matrices
	{
		if(r!=A.r||c!=A.c)
		{
			System.out.println("Matrices cannot be added");
			System.exit(0);
		}
		Matrix B=new Matrix(r,c);
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				B.a[i][j]=a[i][j]+A.a[i][j];
		return B;		
	}
	Matrix Product(Matrix A) //Function to multiply two matrices
	{
		if(c!=A.r)
		{
			System.out.println("Matrices cannot be multiplied");
			System.exit(0);
		}
		Matrix B=new Matrix(r,A.c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<A.c;j++)
			{
				B.a[i][j]=0;
				for(int k=0;k<c;k++)
					B.a[i][j]+=a[i][k]*A.a[k][j];
			}
		}
		return B;		
	}
	Matrix Trans() //Function to create Transpose of a Matrix
	{
		Matrix B=new Matrix(c,r);
		for(int i=0;i<c;i++)
			for(int j=0;j<r;j++)
				B.a[i][j]=a[j][i];
		return B;
	}
	void display() //Function to display Matrix
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
}

public class MatrixDemo extends Matrix  //Subclass
{

	public static void main(String[] args)
	{
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of Matrix");
		r=sc.nextInt();
		System.out.println("Enter the column size of Matrix");
		c=sc.nextInt();
		Matrix ob=new Matrix(r,c);
		ob.input();
		System.out.println("Enter the choice \n 1 for Addition \n 2 for Multiplication \n 3 for Transpose");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				int a,b;
				System.out.println("Enter row and column size of Matrix 2");
				a=sc.nextInt();
				b=sc.nextInt();
				Matrix ob1=new Matrix(a,b);
				ob1.input();
				Matrix ob2=ob1.Add(ob);
				System.out.println("1's Matrix");
				ob.display();
				System.out.println("\n 2'nd Matrix");
				ob1.display();
				System.out.println("\n Added Matrix");
				ob2.display();
				break;
			}
			case 2:
			{
				int a,b;
				System.out.println("Enter row and column size of Matrix 2");
				a=sc.nextInt();
				b=sc.nextInt();
				Matrix ob1=new Matrix(a,b);
				ob1.input();
				Matrix ob2=ob.Product(ob1);
				System.out.println("1's Matrix");
				ob.display();
				System.out.println("\n 2'nd Matrix");
				ob1.display();
				System.out.println("\n Multiplied Matrix");
				ob2.display();
				break;
			}	
			case 3:
			{
				Matrix ob1=ob.Trans();
				System.out.println("Original Matrix");
				ob.display();
				System.out.println("\n Transpose Matrix ");
				ob1.display();
				break;
			}	
			default:
			{
				System.out.println("WRONG CHOICE,Program Exit");
				System.exit(0);
			}	
		}		
	}

}