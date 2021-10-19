import java.util.*;
public class Mystring
{
    String str;
    int len;
    Mystring()
    {
        str="";
        len=0;
    }

    void readString()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
    }

    int code(int index)
    {
        return (int)str.charAt(index);
    }

    void word()
    {
        StringTokenizer st=new StringTokenizer(str);
        String w=st.nextToken();
        while(st.hasMoreTokens())
        {
            String w1=st.nextToken();
            if(w.length()<w1.length())
                w=w1;
        } 
        System.out.println("Longest word="+w);
    }
}