import java.util.*;
public class Number
{
    long num;
    Number()
    {
        num=0;
    }

    Number(long n)
    {
        num=n;
    }

    void digit_Frequency()
    {
        int f=0;long n=num,k=0,l=0;
        while(n>0)
        {
            f=0;
            k=n%10;
            long a=num;
            while(a>0)
            {
                l=a%10;
                if(k==l)
                {
                    f++;
                }
                a=a/10;
            }
            System.out.println("Frequency of"+k+"is"+f);
            n=n/10;
        }
    }

    int Sum_Digits()
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(long a)
    {
        Number ob=new Number(a);
        ob.digit_Frequency();
        ob.Sum_Digits();
    }
}