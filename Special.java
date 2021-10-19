public class Special
{
    int N,Sum;
    Special()
    {
        N=0;
        Sum=0;
    }

    void getnum(int nn)
    {
        N=nn;
    }

    void SOD(int x)
    {
        if(x!=0)
        {
            Sum+=x%10;
            SOD(x/10);
        }
    }

    int prod(int x)
    {
        if(x==0)
            return 1;
        else
            return (x%10)*prod(x/10);
    }

    void isSpecial()
    {
        if(N==(Sum+prod(N)))
            System.out.println("Number is Special");
        else
            System.out.println("Number is not Special");
    }
}