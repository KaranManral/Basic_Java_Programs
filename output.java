public class output
{
    void test()
    {
        int m,n,q=0,p;
        for(m=2;m<=3;++m)
        {
            for(n=1;n<=m;++n)
            {
                p=m+n-1;
                if(p%3==0)
                    q+=p;
                else
                    q+=p+4;
            }
        }
    }

    void main()
    {
        int x=0;
        do
        {
            if(x<3)
            {
                x+=2;
                System.out.print(x+"\t");
                continue;
            }
            else
            {
                System.out.print(++x);
                break;
            }
        }while(x<10);
    }

    int result(int m,int n)
    {
        if(n<=0)
            return 1;
        else
            return(m*result(m,n-1));
    }

    void mymethod(int counter)
    {
        if(counter==0)
            System.out.println(" ");
        else
        {
            System.out.println("Hello"+counter);
            mymethod(--counter);
            System.out.println("Hello"+counter);
        }
    }
}