import java.util.*;
public class RotMatrix
{
    int ary[][],m,n;
    RotMatrix(int mm,int nn)
    {
        m=mm;
        n=nn;
        ary=new int [m][n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ary[i][j]=sc.nextInt();
            }
        }
    }
    RotMatrix rotate(RotMatrix A)
    {
        int k;
        for(int c=0;c<n;c++)
        {
            k=m-1;
            for(int r=0;r<m;r++)
            {
                ary[r][c]=A.ary[c][k];
                k--;
            }
        }
        return A;
    }
    void show()
    {
        System.out.println("Rotated Matrix: ");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            System.out.print(ary[r][c]+"\t");
            System.out.println();
        }
    }
    static void main(int a,int b)
    {
        RotMatrix ob1=new RotMatrix(a,b);
        RotMatrix ob2=new RotMatrix(b,a);
        ob1.accept();
        ob2.rotate(ob1);
        ob2.show();
    }
}