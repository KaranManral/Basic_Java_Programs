import java.util.*;
public class Account extends Bank
{
    double amt;
    Account(double p,int a,String n)
    {
        super(p,a,n);
        amt=0.0;
    }
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        amt=sc.nextDouble();
        P=P+amt;
    }
    void withdraw()
    {
        double p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        amt=sc.nextDouble();
        if(amt>P)
        System.out.println("Insufficient balance");
        else
        {
            P=P-amt;
            if(P<500)
            {
                p=(5/100.0)*P;
                System.out.println("Penalty is Rs  "+p);
                P=P-p;
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("Remaining Balance="+P);
    }
}