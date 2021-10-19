public class CQueue1
{
    int a[],f,r,n;
    CQueue1(int nn)
    {
        n=nn;
        f=-1;
        r=-1;
        a=new int[n];
    }

    void push(int v)
    {
        if((f==0&&r==n-1)||(f==r+1))
            System.out.println("OverFlow");
        else if(r<0)
        {
            f=r=0;
            a[r]=v;
        }
        else if(r==n-1)
        {
            r=0;
            a[r]=v;
        }
        else
            a[++r]=v;
    }

    int pop()
    {
        int k=-99;
        if(f<0)
            System.out.println("UnderFlow");
        else if(f==r)
        {
            k=a[f];
            f=r=-1;
        }
        else if(f==n-1)
        {
            k=a[f];
            f=0;            
        }
        else
            k=a[f++];
        return k;
    }
}