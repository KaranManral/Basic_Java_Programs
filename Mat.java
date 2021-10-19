import java.util.*;
public class Mat
{
    int A[][],M,N,B[];
    Mat(int m,int n)
    {
        M=m;
        N=n;
        A=new int[M][N];
        B=new int[M*N];
    }

    void input()
    {
        int k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
                B[k++]=A[i][j];
            }
        }
    }

    void sort()
    {
        int p,t;
        for(int i=0;i<M*N;i++)
        {
            p=i;
            for(int j=i+1;j<M*N;j++)
                if(B[p]>B[j])
                    p=j;
            t=B[i];
            B[i]=B[p];
            B[p]=t;
        }
    }

    Mat rearrange(Mat C)
    {
        int k=0;
        Mat D=new Mat(M,N);
        for(int i=0;i<D.M;i++)
        {
            for(int j=0;j<D.N;j++)
                D.A[i][j]=C.B[k++];
        }
        D.B=B;
        return D;
    }

    void display()
    {
        System.out.println("Smallest element="+A[0][0]);
        System.out.println("Greatest element="+A[M-1][N-1]);
        System.out.println("Rearranged Matrix");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
                System.out.print(A[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(int a,int b)
    {
        Mat ob=new Mat(a,b);
        Mat ob1=new Mat(a,b);
        ob.input();
        ob.sort();
        ob1=ob1.rearrange(ob);
        ob1.display();
    }
}