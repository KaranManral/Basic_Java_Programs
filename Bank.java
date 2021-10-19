public class Bank
{
    String name;
    int accno;
    double P;
    Bank(double p,int a,String n)
    {
        P=p;
        accno=a;
        name=n;
    }
    void display()
    {
        System.out.println("NAME-"+name);
        System.out.println("ACCOUNT NUMBER-"+accno);
    }
}