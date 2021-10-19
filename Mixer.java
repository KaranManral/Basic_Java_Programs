import java.util.*;
public class Mixer
{
    int arr[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array in ascending order without any duplicates");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    Mixer mix(Mixer A)
    {
        Mixer B=new Mixer(n+n);
        for(int i=0;i<A.n;i++)
            B.arr[i]=arr[i];
        int k=n;
        for(int i=0;i<A.n;i++)
        {
            B.arr[k]=A.arr[i];
            k++;
        }
        return B;
    }

    void display()
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(int a)
    {
        Mixer ob=new Mixer(a);
        Mixer ob1=new Mixer(a);
        Mixer ob2=new Mixer(a+a);
        ob.accept();
        ob1.accept();
        ob2=ob.mix(ob1);
        ob2.display();
    }
}