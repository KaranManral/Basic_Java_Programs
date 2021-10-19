import java.util.*;
public class quad
{
    float a,b,c,x1,x2;
    quad(float a,float b,float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    float discriminant()
    {
        return (float)Math.pow(b,2)-(4*a*c);
    }

    void root_equal()
    {
        System.out.println((-b/2*a));
    }

    void imag()
    {
        System.out.println("Roots are imaginary");
    }

    void root_real()
    {
        x1=(-b+(float)Math.pow((b*b)-(4*a*c),.5))/(2*a);
        x2=(-b-(float)Math.pow((b*b)-(4*a*c),.5))/(2*a);
        System.out.println("Roots are real"+x1+"\t"+x2);
    }

    void root()
    {
        quad ob=new quad(a,b,c);
        if(ob.discriminant()<0)
            ob.imag();
        else if(ob.discriminant()>0)
            ob.root_real();
        else
            ob.root_equal();
    }
}