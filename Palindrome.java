import java.util.*;
public class Palindrome
{
    String s;
    int c;
    Palindrome()
    {
        s="";
        c=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in given format");
        s=sc.nextLine().toUpperCase();
        int c=s.length()-1;
        if(s.charAt(c)!='.')
        {
            if(s.charAt(c)!=',')
                if(s.charAt(c)!='?')
                    if(s.charAt(c)!='!')
                    {
                        System.out.println("Wrong input");
                        System.exit(0);
                    }
        }
    }

    boolean isPalin(String str)
    {
        String s1="";
        for(int i=str.length()-1;i>=0;i--)
            s1+=str.charAt(i);
        if(s1.equals(str)==true)
            return true;
        else 
            return false;
    }

    void display()
    {
        String p="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            p="";
            if(s.charAt(i)==' '||s.charAt(i)=='.'||s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)=='!')
            {
                p=s.substring(k,i);
                k=i+1;
                if(isPalin(p))
                {
                    System.out.print(p+" ");
                    c++;
                }
            }
        }
        if(c==0)
            System.out.println("NO PALINROMIC WORDS");
        else
            System.out.println("\nNumber of Palindrome Words = "+c);
    }

    public static void main()
    {
        Palindrome ob=new Palindrome();
        ob.input();
        ob.display();
    }
}