import java.util.*;
public class Sample3
{
    int n,d,p,q,c1=0;
    String l,l1,l2;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower and upper limit");
        p=sc.nextInt();
        q=sc.nextInt();
        if(p>q||p>=5000||q>=5000)
        {
            System.out.println("Wrong input");
            System.exit(0);
        }
    }

    void process()
    {
        System.out.println("The Kaprekar number are:-");
        n=p;
        while(n<q)
        {
            l=Integer.toString(n);
            d=l.length();
            l1=l2="0";
            l=Integer.toString(n*n);
            d=l.length()-d;
            for(int i=0;i<d;i++)
                l1+=l.charAt(i);
            for(int i=d;i<l.length();i++)
                l2+=l.charAt(i);
            if(n==(Integer.valueOf(l1)+Integer.valueOf(l2)))
            {
                System.out.print(n+",");
                c1++;
            }
            n++;
        }
        System.out.print("\n Frequency="+c1);
    }

    public static void main()
    {
        Sample3 ob=new Sample3();
        ob.input();
        ob.process();
    }
}