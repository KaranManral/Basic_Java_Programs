import java.util.*;
class Lucky
{
    public static void main(int s)
    {
        int a[]=new int[s],c=1,b[]=new int[s];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {        System.out.print("Enter the element");
            a[i]=sc.nextInt();    
        }
        while(c<a.length)
        {
            int k=0,d=0;
            for(int i=0;i<a.length-c;i=i+c+1)
            {
                a[i+c]=0;
                k++;
            }
            c++;
            b=new int[a.length-k];
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==0)
                    continue;
                else
                    b[d++]=a[i];
            }
            a=b;
        }
        for(int i=0;i<a.length;i++)
        {      
            System.out.print(a[i]+",");
        }
    }
}