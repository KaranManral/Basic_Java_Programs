public class D3Point extends D2Point
{
    double z;
    D3Point()
    {
        super();
        z=0.0;
    }

    D3Point(double nx,double ny,double nz)
    {
        super(nx,ny);
        z=nz;
    }

    double distance3d(D3Point b)
    {
        double d=Math.pow((Math.pow((b.x-x),2)+Math.pow((b.y-y),2))+Math.pow((b.z-z),2),.5);
        return d;
    }

    public static void main(double nx,double ny,double nz,double nx1,double ny1,double nz1)
    {
        D2Point ob=new D2Point(nx,ny);
        D3Point ob1=new D3Point(nx,ny,nz);
        D2Point ob2=new D2Point(nx1,ny1);
        D3Point ob3=new D3Point(nx1,ny1,nz1);
        System.out.println(ob2.distance2d(ob));
        System.out.println(ob3.distance3d(ob1));
    }
}