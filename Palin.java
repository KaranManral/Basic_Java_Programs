import java.util.*;
public class Palin
{
    int num,revnum;
    Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int reverse(int y)
    {
        if(y==0)
        return revnum;
        else
        revnum=revnum*10+y%10;
        return reverse(y/10);
    }
    void check()
    {   
        if(reverse(num)==num)
        {
            System.out.println("The number is Palindrome");
        }
        else
            System.out.println("The number is not Palindrome");
    }
    public static void main()
    {
        Palin ob=new Palin();
        ob.accept();
        ob.check();
    }
}