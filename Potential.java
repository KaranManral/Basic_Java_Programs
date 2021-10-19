import java.util.*;
public class Potential
{
    String S,St[];
    int c=0,s=0,a[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        S=sc.nextLine().toUpperCase();
        int l=S.length();
        if(S.charAt(l-1)!='.')
            if(S.charAt(l-1)!='!')
                if(S.charAt(l-1)!='?')
                {
                    System.out.println("Wrong Input");
                    System.exit(0);
                }
        int k=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
                c++;
                k=i+1;
            }
        }
        a=new int[c+1];
        St=new String[c+1];
        c+=1;
    }

    int sum(String w)
    {
        for(int i=0;i<w.length();i++)
            s+=(int)w.charAt(i);
        return s;
    }

    void display()
    {
        String p,o="";
        int l=0,k=0;
        for(int i=0;i<S.length();i++)
        {
            p="";
            if(S.charAt(i)==' '||S.charAt(i)=='.'||S.charAt(i)=='?'||S.charAt(i)=='!')
            {
                p=S.substring(l,i);
                l=i+1;
                St[k]=p;
                a[k]=sum(p);
                k++;
                s=0;
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c-i-1;j++)
            {
                if(a[j]<a[i])
                {
                    o=St[j];
                    St[j]=St[i];
                    St[i]=o;
                }
            }
        }
        for(int i=0;i<c;i++)
            System.out.print(St[i]+" ");
    }

    public static void main()
    {
        Potential ob=new Potential();
        ob.input();
        ob.display();
    }
}    