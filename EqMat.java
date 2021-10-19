import java.util.*;
public class EqMat
{
    int a[][],m,n;
    EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[m][n];
    }

    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
                a[r][c]=sc.nextInt();
        }
    }

    int check(EqMat P,EqMat Q)
    {
        if((P.m==Q.m)&&(P.n==Q.n))
        {
            for(int r=0;r<m;r++)
            {
                for(int c=0;c<n;c++)
                    if(P.a[r][c]!=Q.a[r][c])
                        return 0;
            }
        }
        else
            return 0;
        return 1;
    }

    void print()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println("\n");
        }
        System.out.println("\n\n\n");
    }

    public static void main(int a,int b,int c,int d)
    {
        EqMat ob=new EqMat(a,b);
        EqMat ob1=new EqMat(c,d);
        EqMat ob2=new EqMat(a,b);
        ob.readarray();
        ob1.readarray();
        if(ob2.check(ob,ob1)==1)
            System.out.println("Both matrices equal");
        else
            System.out.println("Both matrices not equal");
        ob.print();
        ob1.print();
    }
}