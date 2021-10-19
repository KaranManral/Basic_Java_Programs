import java.util.*;
public class Indexarray
{
    int arr[];
    Indexarray()
    {
        arr=new int[100];
    }

    void fillarr()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100;i++)
        {
            System.out.println("Enter Employee Code");
            arr[i]=sc.nextInt();
        }
    }

    void sortarr()
    {
        int t,p;
        for(int i=0;i<99;i++)
        {
            p=i;
            for(int j=i+1;j<100;j++)
            {
                if(arr[p]>arr[j])
                    p=j;
            }
            t=arr[i];
            arr[i]=arr[p];
            arr[p]=t;
        }
    }

    int binarysearch(int a[],int c)
    {
        int u=100,l=0;
        while(l<u)
        {
            int p=(u+l)/2;
            if(c<a[p])
            {
                u=p;
                l+=1;
            }
            else if(c==a[p])
                return 1;
            else
            {
                l=p;
                u-=1;
            }
        }
        return 0;
    }
}