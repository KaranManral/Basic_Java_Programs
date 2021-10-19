import java.util.*;
public class Capital
{
    String sent;
    int freq;
    Capital()
    {
        sent="";
        freq=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
    }

    boolean isCap(String w)
    {
        if(Character.isUpperCase(w.charAt(0)))
            return true;
        return false;
    }

    void display()
    {
        int k=0;
        for(int i=0;i<sent.length();i++)
        {        String p="";
            if(sent.charAt(i)==' ')
            {
                p=sent.substring(k,i);
                k=i+1;
                if(isCap(p)==true)
                {
                    freq++;
                }
            }
        }
        System.out.println(sent);
        System.out.println("Number of words begining with capital letter are:-   "+freq);
    }

    public static void main()
    {
        Capital ob=new Capital();
        ob.input();
        ob.display();
    }
}    