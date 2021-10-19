import java.util.*;
public class stringSort
{
    String Str;
    stringSort()
    {
        Str="";
    }

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        Str=sc.nextLine().toUpperCase();
    }

    String Sort(String s)
    {
        char p[],t;
        p=s.toCharArray();
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<(p.length-1-i);j++)
            {
                if((int)p[j+1]<(int)p[j])
                {
                    t=p[j];
                    p[j]=p[j+1];
                    p[j+1]=t;
                }
            }
        }
        s="";
        for(int i=0;i<p.length;i++)
            s+=p[i];
        return s;
    }

    void print()
    {
        System.out.println("Original String:-  "+Str);
        System.out.println("Sorted String:-  "+Sort(Str));
    }

    public static void main()
    {
        stringSort ob=new stringSort();
        ob.read();
        ob.print();
    }
}