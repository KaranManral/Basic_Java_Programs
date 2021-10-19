public class Number1
{
    int n;
    Number1(int nn)
    {
        n=nn;
    }

    int factorial(int a)
    {
        if(a==1)
            return 1;
        else
            return a*factorial(a-1);
    }

    void display()
    {
        System.out.println("Number="+n);
        System.out.println("Factorial of number="+factorial(n));
    }
}