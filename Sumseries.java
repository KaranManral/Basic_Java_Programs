import java.util.*;
class Sumseries
{
    int X,n;
    double sum;
    Sumseries()
    {
        X=0;
        n=0;
        sum=1.0;
    }

    int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        return fact;
    }

    double term(int p,int q)
    {
        return p/factorial(q);
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X and n");
        X=sc.nextInt();
        n=sc.nextInt();
    }

    void displaysum()
    {
        System.out.println("Sum of series="+sum);
    }

    double calsum()
    {
        int p,q,j=1;
        for(int i=1;i<=(2*n)-1;i=i+2)
        {
            sum+=term((int)Math.pow(X,i),j);
            j++;
        }
        return sum;
    }
}