import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column size of matrix respectively");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) //Loop for rows
			for(int j=0;j<n;j++) //Loop for columns
				a[i][j]=i*j; //Putting values in matrix
		
		for(int i=0;i<m;i++) //Loop for rows
		{
			for(int j=0;j<n;j++) //Loop for columns
				System.out.print(a[i][j]+"  "); //Displaying elements of matrix
			System.out.println(); //Changing line
		}
	}

}
