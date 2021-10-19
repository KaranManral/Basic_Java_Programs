import java.util.*;
public class Combine
{
    int com[],size;
    Combine(int nn)
    {
        size=nn;
        com=new int[nn];
    }

    void inputarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
            com[i]=sc.nextInt();
    }

    void sort()
    {
        int p,t;
        for(int i=0;i<size;i++)
        {
            p=i;
            for(int j=i+1;j<size;j++)
                if(com[p]>com[j])
                    p=j;
            t=com[i];
            com[i]=com[p];
            com[p]=t;
        }
    }

    void mix(Combine A,Combine B)
    {
        int k=A.size;
        for(int i=0;i<A.size;i++)
        {
            com[i]=A.com[i];
        }
        for(int i=0;i<B.size;i++)
        {
            com[k++]=B.com[i];
        }
    }

    void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(com[i]+" ");
    }

    public static void main(int a,int b)
    {
        Combine ob=new Combine(a);
        Combine ob1=new Combine(b);
        Combine ob2=new Combine(a+b);
        ob.inputarray();
        ob1.inputarray();
        ob2.mix(ob,ob1);
        ob2.sort();
        ob2.display();
    }
}