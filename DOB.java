import java.util.*;
public class DOB
{
    int d,m,y,day;
    DOB()
    {
        day=d=m=y=0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your date of birth");
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        if(y>2019)
        {
            System.out.println("INVALID");
            System.exit(0);
        }
    }

    void process()
    {
        int a[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int b[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%400==0||y%4==0)
        {
            if(m==2&&d>29)
            {
                System.out.println("INVALID");
                System.exit(0);
            }
            else if((m==4||m==6||m==9||m==11)&&d>30)
            {
                System.out.println("INVALID");
                System.exit(0);
            }
            else
            {
                for(int i=0;i<m-1;i++)
                    day+=a[i];
                day+=d-1;
            }
        }
        else
        {
            if(m==2&&d>28)
            {
                System.out.println("INVALID");
                System.exit(0);
            }
            else if((m==4||m==6||m==9||m==11)&&d>30)
            {
                System.out.println("INVALID");
                System.exit(0);
            }
            else
            {
                for(int i=0;i<m-1;i++)
                    day+=b[i];
                day+=d-1;
            }
        }
        System.out.println("VALID DATE\n"+day);
    }
    static void main()
    { 
        DOB ob=new DOB();
        ob.input();
        ob.process();
    }
}