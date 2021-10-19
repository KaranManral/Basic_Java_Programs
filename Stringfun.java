import java.util.*;
public class Stringfun
{
    String str;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.nextLine()+" ";
    }

    void words()
    {
        int w=0,v=0,u=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
            if(ch==' ')
                w++;
            if(Character.isUpperCase(ch)==true)
                u++;
        }
        System.out.println("Number of words="+w);
        System.out.println("Number of vowels="+v);
        System.out.println("Number of Upper Case characters="+u);
    }

    void frequency()
    {
        int f=0;
        char c[]=str.toCharArray();
        String s="";
        for(int a=0;a<c.length-1;a++)
        {
            for(int b=a+1;b<c.length;b++)
                if(c[a]==c[b]||c[b]==' ')
                    c[b]='\u0000';
        }
        for(int d=0;d<c.length;d++)
            if(c[d]!='\u0000')    
                s+=c[d];
        str=str.toUpperCase();
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            f=0;
            char ch=s.charAt(i);
            for(int j=0;j<str.length();j++)
            {
                char ch1=str.charAt(j);
                if(ch==ch1)
                    f++;
            }
            System.out.println("Frequency of    "+ch+"   is  "+f);
        }
    }
}