import java.util.*;
public class Perfect
{
    int num;
    Perfect(int nn)
    {
        num=nn;
    }
    int sum=1,j=2;
    int sum_of_factors(int i)
    {  
        if(j<=i/2)
        {
            if(i%j==0)
                sum+=j;
            j++;
            sum_of_factors(i);
        }
        return sum;
    }

    void check()
    {   
        int s=sum_of_factors(num);
        if(s==num)
            System.out.println("The number is a perfect number");
        else
            System.out.println("The number is not a perfect number");
    }

    public static void main(int a)
    {
        Perfect ob=new Perfect(a);
        ob.check();
    }
}