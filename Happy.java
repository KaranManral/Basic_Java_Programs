import java.util.*;
class Happy
{
    int n;
    Happy()
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    int sum_sq_digits(int x)
    {
        if(x==0)
            return x;
        else
            return (int)Math.pow(x%10,2)+sum_sq_digits(x/10);
    }

    void ishappy()
    {
        int a=sum_sq_digits(n);
        while(a>9)
            a=sum_sq_digits(a);
        if(a==1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }

    public static void main(int a)
    {
        Happy ob=new Happy();
        ob.getnum(a);
        ob.ishappy();
    }
}