import java.util.*;
public class Saddle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][],m,n;
        System.out.println("Enter no. of rows");
        m=sc.nextInt();
        System.out.println("Enter no. of coloumns");
        n=sc.nextInt();
        a=new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int min,max,d=0;
        for(int i=0;i<m;i++)
        {
            min=a[i][0];
            for(int j=1;j<n;j++)
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    d=j;
                }
            max=a[0][d];
            for(int k=0;k<m;k++)
                if(a[k][d]>max)
                    max=a[k][d];
            if(max==min)
            {
                System.out.println("Original Matrix");
                for(int x=0;x<m;x++)
                {
                    for(int y=0;y<n;y++)
                        System.out.print(a[x][y]+"\t");
                    System.out.println();
                }
                System.out.println("Saddle point :-"+min);
                System.exit(0);
            }
        }
        System.out.println("No Saddle point");
    }
}