import java.util.*;
public class MatRev
{
    int arr[][],m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
    }

    int reverse(int x)
    {
        int rev=0;
        while(x>0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        return rev;
    }

    void revMat(MatRev P)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=reverse(P.arr[i][j]);
        }
    }

    void show()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(int a,int b)
    {
        MatRev ob=new MatRev(a,b);
        MatRev ob1=new MatRev(a,b);
        ob.fillarray();
        ob1.revMat(ob);
        ob1.show();
    }
}