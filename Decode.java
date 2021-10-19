import java.util.*;
public class Decode
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code");
        String s2="",s3="",s=sc.nextLine();
        int k=0;
        for(int i=s.length()-1;i>=0;i--)
        s3+=s.charAt(i);
        char c[]=s3.toCharArray();
        for(int i=0;i<c.length-1;i++)
        {
            String s4="";
            s4+=(c[i]-48);
            s4+=c[i+1]-48;
            if(Integer.parseInt(s4)<32)
            {
                s4+=c[i+2]-48;
                i++;
            }
            s2+=(char)Integer.parseInt(s4);
            i++;
        }
        System.out.println(s2);
    }
}