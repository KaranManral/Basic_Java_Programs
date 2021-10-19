import java.io.*;
public class ISBN
{
    String s,s1;
    int sum,a;
    ISBN()
    {   sum=0;
        s=s1="";
        a=0;
    }

    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ISBN number");
        s=br.readLine();
        if(s.length()!=10)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        if(s.charAt(s.length()-1)=='X')
        {
            for(int i=0;i<s.length()-1;i++)
                s1+=s.charAt(i);
            s1+="10";

        }
        else
        {
            s1=s;
        }
        a=Integer.parseInt(s1);
    }

    void display()
    {
        int i=1;
        if(s1.length()==11)
        {
            sum+=a%100;
            a=a/100;
            i=2;
        }
        while(a>0)
        {
            sum+=((a%10)*i);
            a=a/10;
            i++;
        }
        if(sum%11!=0)
            System.out.println("LEAVES REMAINDER – INVALID ISBN CODE");
        else
        {
            System.out.println("Sum="+sum);
            System.out.println("LEAVES NO REMAINDER – VALID ISBN CODE"); 
        }
    }

    public static void main()throws IOException
    {
        ISBN ob=new ISBN();
        ob.input();
        ob.display();
    }
}