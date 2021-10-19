import java.util.*;
public class Perfect1
{
    int num;
    Perfect1(int nn)
    {
        num=nn;
    }
    int sa=1;
    /*public int sum_of_factors(int i)
    {
    int j=2;
    if(i==0)
    return sa;
    else if(j==i)
    return sa;
    else if(i%j==0)
    {
    sa=sa+j++;
    }
    return sum_of_factors(i/j);
    }*/
    int sum=1,j=2;
    int sum_of_factors(int i)
    {  
        if(j==i)
            return sum;
        else if(i%j==0)
        {
            sum+=j;
            j++;
            sum_of_factors(i);
        }
        else
        {
            j++;
            sum_of_factors(i);
        }
        return sum;
    }

    void check()
    {   
        int s=sum_of_factors(num);
        if(s==num)
            System.out.println("The number is a Perfect1 number");
        else
            System.out.println("The number is not a Perfect1 number");
    }

    public static void main(int a)
    {
        Perfect1 ob=new Perfect1(a);
        ob.check();
    }
}