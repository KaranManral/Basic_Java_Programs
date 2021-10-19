import java.util.*;
public class ArmNum
{
    int n,l=0;
    ArmNum (int nn)
    {
        n=nn;
        while(nn>0)
        {
            l++;
            nn=nn/10;
        }
    }

    int sum_pow(int i)
    {
        if(i==0)
            return 0;
        else 
            return ((int)Math.pow(i%10,l))+sum_pow(i/10);
    }

    public void isArmstrong()
    {
        if(sum_pow(n)==n)
            System.out.println("Number is Armstrong");
        else 
            System.out.println("Number is not Armstrong");
    }

    public static void main(String[] args)
    {
        ArmNum ob=new ArmNum(Integer.parseInt(args[0]));
        ob.isArmstrong();
    }
}