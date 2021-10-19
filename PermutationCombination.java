import java.util.Scanner;
public class PermutationCombination {

	int calFact(int n)    //Function to calculate Factorial
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact*=i;    //Calculating Factorial
		}
		return fact;
	}

	double permutation(int n,int r)             //Function to calculate permutaion
	{
		double permu;
		permu=calFact(n)/calFact((n-r));      //Calculating Permutaion
		return permu;
	}

	double combination(int n,int r)                //Function to calculate combination
	{
		double combi;
		combi=calFact(n)/(calFact(r)*calFact((n-r)));         //Calculating combination
		return combi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PermutationCombination ob=new PermutationCombination();
		int n=0,r=0,i=0;
		double permu,combi;
		while(i!=1)
		{
			System.out.println("Enter value of n");
			n=sc.nextInt();
			System.out.println("Enter value of r");
			r=sc.nextInt();
			if(r>n)
			{
				System.out.println("WRONG INPUT,re-enter");
			}
			else
				i=1;
		}
		permu=ob.permutation(n,r);          //Calling permutaion()
		combi=ob.combination(n,r);			//Calling Combination()
		System.out.println("Permutaion of n,r= "+permu);
		System.out.println("Combination of n,r= "+combi);
	}

}
