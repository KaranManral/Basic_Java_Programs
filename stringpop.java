import java.util.*;
public class stringpop
{
    String Str,Str1;
    stringpop()
    {
        Str="";
        Str1="";
    }

    void readstring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        Str=sc.nextLine();
    }

    String MakeUnique(String wrd)
    {
        String w="";
        char s[]=wrd.toCharArray();
        char d=' ';
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
                if(s[i]==s[j])
                    s[j]=d;  
            if(s[i]!=' ')
                w=w+s[i];
        }
        return w;
    }

    void change()
    {
        int k=0,c=0;
        String s;
        for(int i=0;i<Str.length();i++)
        {
            s="";
            if(Str.charAt(i)==' '||Str.charAt(i)=='.'||Str.charAt(i)=='?'||Str.charAt(i)=='!')
            {
                s=Str.substring(k,i);
                k=i+1;
                if(s.compareTo(MakeUnique(s))==0)
                    c++;
            }
            Str1=Str1+MakeUnique(s)+" ";
        }
        System.out.println("Number of unique words \n"+c);
    }

    void display()
    {
        System.out.println("Original Sentence \n"+Str);
        System.out.println("Changed Sentence \n"+Str1+Str.charAt(Str.length()-1));
    }

    public static void main()
    {
        stringpop ob=new stringpop();
        ob.readstring();
        ob.change();
        ob.display();
    }
}