
public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [4][];
		int k=0;
		for (int i=0;i<4;i++) {
			a[i]=new int[4-i];
			for(int j=0;j<4-i;j++)
				a[i][j]=k++;
		}
		for (int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
