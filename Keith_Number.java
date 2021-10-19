public class Keith_Number
{
    public static void main(int n)
    {
        int c=0,b=n,a[],s=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        a=new int[c];
        n=b;
        c=0;
        while(n!=0)
        {
            a[c++]=n%10;
            n=n/10;
        }
        while(s<=b)
        {
            s=0;
            for(int i=0;i<a.length;i++)
                s+=a[i];
            a[--c]=s;
            if(c==0)
                c=a.length;
            if(s==b)
            {
                System.out.println("YES");
                break;
            }
        }
        if(s>b)
            System.out.println("NO");
    }
}