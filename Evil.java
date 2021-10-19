import java.util.*;
public class Evil
{
    int N,D=0,c=0;
    String b="",b1="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        N=sc.nextInt();
        if(N<=2||N>=100)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }

    void binary()
    {
        int n=N;
        while(n>0)
        {
            D=(D*10)+n%2;
            b+=Integer.toString(n%2);
            n=n/2;
        }
        for(int i=b.length()-1;i>=0;i--)
        b1+=b.charAt(i);
        D=Integer.parseInt(b1);
    }

    void count()
    {
        while(D>0)
        {
            if(D%10==1)
                c++;
            D/=10;
        }
    }

    void display()
    {
        if(c%2==0)
            System.out.println("EVIL NUMBER");
        else
            System.out.println("NOT AN EVIL NUMBER");
    }

    public static void main()
    {
        Evil ob=new Evil();
        ob.input();
        ob.binary();
        ob.count();
        ob.display();
    }
}