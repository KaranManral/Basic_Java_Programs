public class CQueue0
{
    int a[],f,r,n;
    CQueue0(int nn)
    {
        n=nn;
        f=0;
        r=0;
        a=new int[n];
    }

    void push(int v)
    {
        if((f==0&&r==n)||(f==r+1))
            System.out.println("OverFlow");
        else if(r==n)
        {
            r=0;
            a[r]=v;
        }
        else
            a[r++]=v;
    }

    int pop()
    {
        int k=-99;
        if(f==r)
            System.out.println("UnderFlow");
        else if(f==n)
        {
            f=0;
            k=a[f];
        }
        else
            k=a[f++];
        return k;
    }
}