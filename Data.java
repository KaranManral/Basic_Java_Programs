import java.util.*;
public class Data
{
    String Str;
    Data()
    {
        Str=null;
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        Str=sc.nextLine();
    }

    void computePrint()
    {
        StringTokenizer st=new StringTokenizer(Str);
        System.out.println(Str);
        while(st.hasMoreTokens())
        {
            String word=st.nextToken();
            System.out.println(word+"   "+word.length());
        }
    }
}
