import java.util.*;
public class Set
{
    int a[],N;
    Set(int nn)
    {
        this.N=nn;
        a=new int[N];
    }
    void inputarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<N;i++)
        a[i]=sc.nextInt();
    }
    void Union(Set A,Set B)
    {
        int i,j,k=A.N,d; 
        for(i=0;i<A.N;i++)
        {
            a[i]=A.a[i];
        }
        for(i=0;i<B.N;i++)
        {
            d=0;
            for(j=0;j<A.N;j++)
            {
                if(A.a[j]==B.a[i])
                d++;
            }
            if(d==0)
            a[k++]=B.a[i];
            N=k;
        }
    }
    void display()
    {
        for(int i=0;i<N;i++)
        System.out.print(a[i]+",");
        System.out.println("}");
    }
    public static void main(int m,int n)
    {
        Set ob1=new Set(m);
        Set ob2=new Set(n);
        Set ob3=new Set(m+n+1);
        ob1.inputarray();
        ob2.inputarray();
        ob3.Union(ob1,ob2);
        System.out.print("First Set :- {");
        ob1.display();
        System.out.print("Second Set :- {");
        ob2.display();
        System.out.print("Union Set :- {");
        ob3.display();
    }
}