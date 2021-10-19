public class series extends Number1
{
    int sum;
    series(int nn)
    {
        super(nn);
        sum=0;
    }

    void calsum()
    {
        for(int i=1;i<=n;i++)
            sum+=factorial(i);
    }

    void display()
    {
        super.display();
        System.out.println("Sum of series="+sum);
    }
}