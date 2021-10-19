import java.util.*;
public class SwapSort
{
    String wrd,swapwrd,sortwrd;
    int len;
    SwapSort()
    {
        wrd="";
        swapwrd="";
        sortwrd="";
        len=0;
    }

    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        wrd=sc.nextLine().toUpperCase();
        len=wrd.length();
    }

    void swapword()
    {
        char t;
        char s[]=wrd.toCharArray();
        t=s[0];
        s[0]=s[len-1];
        s[len-1]=t;
        for(int i=0;i<len;i++)
        swapwrd=swapwrd+s[i];
    }
    
    void sortword()
    {
        char t;
        char s[]=wrd.toCharArray();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1-i;j++)
            {
                if(s[j+1]<s[j])
                {
                    t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        for(int i=0;i<len;i++)
        sortwrd=sortwrd+s[i];
    }
    
    void display()
    {
        System.out.println("Original Word -:"+wrd);
        System.out.println("Swapped Word -:"+swapwrd);
        System.out.println("Sorted Word -:"+sortwrd);
    }
    
    public static void main()
    {
        SwapSort ob=new SwapSort();
        ob.readword();
        ob.swapword();
        ob.sortword();
        ob.display();
    }
}