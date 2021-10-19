import java.util.*;
public class Exchange
{
    String sent,rev;
    int size;
    Exchange()
    {
        sent="";
        rev="";
        size=0;
    }

    void readsentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine()+" ";
        size=sent.length();
    }

    void exfirstlast()
    {
        String w,a;int k=0,j=0;
        for(int i=0;i<size;i++)
        {
            w="";a="";j=1;
            if(sent.charAt(i)==' ')
            {
                w=sent.substring(k,i);
                k=i+1;
                char ch=w.charAt(0);
                char ch1=w.charAt(w.length()-1);
                a+=ch1;
                while(j<w.length()-1)
                {
                    a+=w.charAt(j);
                    j++;
                }
                a+=ch;
            }
            rev+=a+" ";
        }
    }

    void display()
    {
        System.out.println("Original Sentence\n"+sent);
        System.out.println("Changed Sentence\n"+rev);
    }

    public static void main()
    {
        Exchange ob=new Exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}