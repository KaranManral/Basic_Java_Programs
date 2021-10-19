import java.util.*;
public class Adder
{
    int a[];
    Adder()
    {   
        a=new int[2];
        a[0]=0;
        a[1]=0;
    }

    void readtime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours and Minutes Respectively");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
    }

    void addtime(Adder X,Adder Y)
    {
        a[0]=X.a[0]+Y.a[0];
        a[1]=X.a[1]+Y.a[1];
        if(a[1]>60)
        {
            a[0]+=1;
            a[1]-=60;
        }
    }

    void disptime()
    {
        System.out.println("Their sum is- \t"+a[0]+"hours "+a[1]+"minutes"); 
    }

    public static void main(String[] args)
    {
        Adder ob1=new Adder();
        Adder ob2=new Adder();
        Adder ob3=new Adder();
        ob1.readtime();
        ob2.readtime();
        ob3.addtime(ob1,ob2);
        ob3.disptime();
    }
}