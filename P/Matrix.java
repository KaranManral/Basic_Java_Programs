import java.util.*;
public class Matrix
{
    int arr[][],M,N;
    Matrix()
    {
        M=0;
        N=0;
        arr=new int[M][N];
    }

    Matrix(int mm,int nn)
    {
        M=mm;
        N=nn;
        arr=new int[M][N];
    }

    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++)
                arr[i][j]=sc.nextInt();
    }

    Matrix shift(Matrix A)
    {
        int a=1;
        Matrix B=new Matrix(M,N);
        for(int i=0;i<B.M;i++)
        {
            for(int j=0;j<B.N;j++)
            {
                if(a==A.M)
                    a=0;
                B.arr[i][j]=A.arr[a][j];
            }
            a++;
        }
        return B;
    }

    void disparray()
    {
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(int a,int b)
    {
        Matrix ob=new Matrix(a,b);
        Matrix ob1=new Matrix(a,b);
        ob.fillarray();
        ob1=ob1.shift(ob);
        ob1.disparray();
    }
}