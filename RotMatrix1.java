import java.util.*;
public class RotMatrix1
{
    int ary[][],M,s;
    RotMatrix1(int mm)
    {
        M=mm;
        s=0;
        ary=new int [M][M];
        if(M<=2||M>=10)
        {
            System.out.println("Size out of range");
            System.exit(0);
        }
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                ary[i][j]=sc.nextInt();
            }
        }
    }

    RotMatrix1 rotate(RotMatrix1 A)
    {
        RotMatrix1 B=new RotMatrix1(M);
        int k;
        for(int r=0;r<B.M;r++)
        {
            k=M-1;
            for(int c=0;c<A.M;c++)
            {
                B.ary[r][c]=A.ary[k][r];
                k--;
            }
        }
        return B;
    }

    void show()
    {
        System.out.println("Rotated Matrix: ");
        for(int r=0;r<M;r++)
        {
            for(int c=0;c<M;c++)
                System.out.print(ary[r][c]+"\t");
            System.out.println();
        }
        s+=ary[0][0]+ary[0][M-1]+ary[M-1][0]+ary[M-1][M-1];
        System.out.println("Sum of corner elements="+s);
    }

    static void main(int a)
    {
        RotMatrix1 ob1=new RotMatrix1(a);
        RotMatrix1 ob2=new RotMatrix1(a);
        ob1.accept();
        ob2=ob2.rotate(ob1);
        System.out.println("Original Matrix: ");
        for(int r=0;r<a;r++)
        {
            for(int c=0;c<a;c++)
                System.out.print(ob1.ary[r][c]+"\t");
            System.out.println();
        }
        ob2.show();
    }
}