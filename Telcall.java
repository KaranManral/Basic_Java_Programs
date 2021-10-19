import java.util.*;
public class Telcall
{
    String phno;
    int n;
    String name;
    double amt;
    Telcall(String p,String na,int m)
    {
        name=na;
        phno=p;
        n=m;
        amt=0.0;
    }

    void compute()
    {
        if(n<=100)
            amt=500.0;
        else if(n<=200)
            amt=500.0+(n*1.0);
        else if(n<=300)
            amt=500.0+(n*1.20);
        else 
            amt=500.0+(n*1.50);
    }

    void dispdata()
    {
        System.out.println("Phone Number\tName\tTotal calls\tAmount");
        System.out.println(phno+"\t"+name+"\t"+n+"\t"+amt);
    }

    public static void main(String p,String na,int m)
    {
        Telcall ob=new Telcall(p,na,m);
        ob.compute();
        ob.dispdata();
    }
}