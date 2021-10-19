import java.util.*;
public class SeriesSum
{
    int x,n;double sum;
    SeriesSum(int xx,int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }

    double findfact(int m)
    {
        if(m==1)
            return 1.0;
        else
            return m*findfact(m-1);
    }

    double findpower(int x,int y)
    {
        if(y==0)
            return 1.0;
        else
            return x*findpower(x,y-1);
    }

    void calculate()
    {
        int j=1;
        for(int i=2;i<=n&&j<=n-1;i=i+2)
        {
            double d=findpower(x,i);
            double g=findfact(j);
            sum+=d/g;
            j+=2;
        }
    }

    void display()
    {
        System.out.println("Sum of series="+sum);
    }

    public static void main(int a,int b)
    {
        SeriesSum ob=new SeriesSum(a,b);
        ob.calculate();
        ob.display();
    }
}