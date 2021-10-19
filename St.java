import java.io.*;
class St
{
    String s,s1;
    int v,c;
    St()
    {
        s=s1="";
    }

    void input()throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence in given format");
        s=sc.readLine().toLowerCase();
        if(s.charAt(s.length()-1)!='.')
            if(s.charAt(s.length()-1)!='?')
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
    }

    String cap(String a)
    {
        char c[]=a.toCharArray(),t;
        t=c[0];
        c[0]=Character.toUpperCase(t);
        a="";
        for(int i=0;i<c.length;i++)
            a+=c[i];
        return a;
    }

    void display()
    {
        String p;
        int k=0;
        System.out.println("Word\t      Vowels\t  Consonents");
        for(int i=0;i<s.length();i++)
        {
            v=c=0;
            if(s.charAt(i)==' '||s.charAt(i)=='.'||s.charAt(i)=='?')
            {
                p=s.substring(k,i);
                k=i+1;
                s1+=cap(p)+s.charAt(i);
                for(int j=0;j<p.length();j++)
                    if(p.charAt(j)=='e'||p.charAt(j)=='u'||p.charAt(j)=='o'||p.charAt(j)=='i'||p.charAt(j)=='a')
                        v++;
                c=p.length()-v;
                System.out.println(cap(p)+"\t\t"+v+"\t    "+c);
            }
        }
        System.out.println(s1);
    }

    public static void main()throws IOException
    {
        St ob=new St();
        ob.input();
        ob.display();
    }
}