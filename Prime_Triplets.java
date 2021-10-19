import java.util.*;
class Prime_Triplets
{
    int n,c=0,S,L;
    public boolean isPrime(int x)
    {
        int ctr=0;
        for(int i=1;i<=x/2;i++)
            if(x%i==0)
                ctr++;
        if(ctr==1)
            return true;
        else 
            return false;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start and end points");
        S=sc.nextInt();
        L=sc.nextInt();
        while(S<0||S>=L)
        {
            System.out.println("Invalid Input,Please Re-enter correctly");
            S=sc.nextInt();
            L=sc.nextInt();
        }
    }

    void process()
    {
        n=S+1;
        while(n<=L)
        {
            if(isPrime(n))
            {
                if(isPrime(n+2)&&isPrime(n+6))
                {
                    System.out.println(n+"\t"+(n+2)+"\t"+(n+6));
                    c++;      
                    n+=2;
                }
                else if(isPrime(n+4)&&isPrime(n+6))
                {     
                    System.out.println(n+"\t"+(n+4)+"\t"+(n+6));
                    c++;
                    n+=4;
                }
                else
                    n++;
            }
            else
                n++;
        }
        System.out.println("Total Prime Triplets="+c);
    }

    public static void main()
    {
        Prime_Triplets ob=new Prime_Triplets();
        ob.input();
        ob.process();
    }
}