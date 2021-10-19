import java.util.*;
public class Emrip
{
    int n,rev,f;
    Emrip(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }

    int isprime(int x)
    {
        if(x==f)
            return 1;
        else if(x%f==0)
            return 0;
        else if(f<x)
        {
            f++;
            isprime(x);
        }
        return 1;
    }

    void isEmrip()
    {
        int a=n;
        while(a>0)
        {
            rev=rev*10+(a%10);
            a/=10;
        }
        if(isprime(n)==1&&isprime(rev)==1)
            System.out.println("Number is Emrip");
        else
            System.out.println("Number is not Emrip");
    }

    public static void main(int na)
    {
        Emrip ob=new Emrip(na);
        ob.isEmrip();
    }
}