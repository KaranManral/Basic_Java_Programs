public class NumberProblem
{
    int m,n;
    NumberProblem(int m,int n)
    {
        this.m=m;
        this.n=n;
    }

    int SOD(int x)
    {
        if(x==0)
            return 0;
        else
            return (x%10+SOD(x/10));
    }

    void smallestInteger()
    {
        for(int i=m+1;;i++)
        { 
            if(SOD(i)==n)
            {
                System.out.println("Smallest integer greater than "+m+" whose sum is equal to "+n+" is "+i);
                break;
            }
        }
    }

    public static void main(int a,int b)
    {
        NumberProblem ob=new NumberProblem(a,b);
        ob.smallestInteger();
    }
}