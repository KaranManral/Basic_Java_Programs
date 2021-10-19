import java.io.*;
public class Rearrange1
{
    String wrd,newwrd;
    Rearrange1()
    {
        wrd="";
        newwrd="";
    }

    void readword()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word in Upper case");
        wrd=br.readLine();
    }

    void freq_vow_con()
    {
        int v=0,c=0;
        for(int i=0;i<wrd.length();i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
            else
                c++;
        }
        System.out.println("Frequency of Vowels="+v);
        System.out.println("Frequency of Consonents="+c);
    }

    void arrange()
    {
        String a="",b="";
        for(int i=0;i<wrd.length();i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                a+=ch;
            else
                b+=ch;
        }
        newwrd+=a+b;
    }

    void display()
    {
        System.out.println("Original Word="+wrd);
        System.out.println("Rearranged Word="+newwrd);
    }

    public static void main()throws IOException
    {
        Rearrange1 ob=new Rearrange1();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}