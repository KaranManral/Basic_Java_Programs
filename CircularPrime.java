import java.util.*;
public class CircularPrime
{
    int N,f,a[],no;
    CircularPrime(int n)
    {
        N=n;
        f=2;
        a=new int[(Integer.toString(N)).length()];
    }

    boolean isPrime(int x,int f)
    {
        if(x==f)
            return true;
        else if(x%f==0)
            return false;
        else if(x>f)
        {
            return isPrime(x,f+1);
        }
        else
            return false;
    }

    int combi(int x)
    {
        String s,s1="";
        s=Integer.toString(x);
        for(int i=1;i<s.length();i++)
            s1=s1+s.charAt(i);
        s1=s1+s.charAt(0);
        x=Integer.parseInt(s1);
        return x;
    }

    void cirPrime()
    {        
        int i=0;
        no=N;
        if(isPrime(N,f)==false)
        {
            System.out.println("Number is not circular prime");
            System.exit(0);
        }
        else if(isPrime(N,f))
        do
        {
            no=combi(no);
            if(isPrime(no,f)==false)
            {
                System.out.println("Number is not circular prime");
                System.exit(0);
            }
            else
            {
                a[i]=no;
                i++;
            }
        }while(no!=N);
        System.out.println("Number is circular prime and possible combinations are:-");
        for(i=0;i<(Integer.toString(N)).length();i++)
            System.out.println(a[i]);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        CircularPrime ob=new CircularPrime(n);
        ob.cirPrime();
    }
}