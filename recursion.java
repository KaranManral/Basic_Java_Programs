import java.util.*;
public class recursion
{
    int a,b,c,limit;
    recursion()
    {
        limit=0;
        a=0;
        b=1;
        c=a+b;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the series");
        limit=sc.nextInt();
    }

    int fib(int n)
    {
        System.out.print("\t"+c+"\t");
        if(c<n)
        {
            a=b;
            b=c;
            c=a+b;
            return fib(n);
        }
        return c;
    }

    void generate_fibseries()
    {
        System.out.print(a+"\t"+b);
        fib(limit);
    }
}
 