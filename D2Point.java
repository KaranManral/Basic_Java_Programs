import java.util.*;
public class D2Point
{
    double x,y;
    D2Point()
    {
        x=0.0;
        y=0.0;
    }

    D2Point(double nx,double ny)
    {
        x=nx;
        y=ny;
    }

    double distance2d(D2Point b)
    {
        double d=Math.pow((Math.pow((b.x-x),2)+Math.pow((b.y-y),2)),.5);
        return d;
    }
}