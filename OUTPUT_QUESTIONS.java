class OUTPUT_QUESTIONS
{
    int  Mystery( int num, int x, int y)
    {
        if(num<10)
            return num;
        else
        {
            int z = num % 10;
            if( z % 2 == 0 )
                return z*x + Mystery( num/10,x,y);
            else
                return z*y + Mystery( num/10,x,y);
        }
    }

    boolean  PalindromeNum( int N )
    {
        int rev= 0;
        int num=N;
        while( num>0)
        {
            int f= num/10;
            int s =10*f; 
            int digit =num-s;
            rev=  rev*10  + digit;
            num /= 10;
        }
        if(  rev==N )
            return true; 
        else
            return false;
    }

    int Check(int m,int n)
    {
        if(n==1)
            return -m--;
        else 
            return ++m+Check(m,--n);
    }

    void someFun(int x,int y)
    {
        if(x>1)
        {
            if(x%y==0)
            {
                System.out.print(y+" ");
                someFun(x/y,y);
            }
            else
                someFun(x,y+1);
        }
    }

    int print(int m,int n)
    {
        if(n>m)
            return n-=m;
        else
            return n+++--m+print(m--,++n);
    }

    void test (int count)  
    {         
        if (count == 0)  
            System.out.println(" ");    
        else          
        {              
            System.out.println("Bye"+count);   
            test(--count);            
            System.out.println(" "+count); 

        }
    } 

    int sumofDigits(int n,int p)
    {
        if(n==0)
            return 0;
        else
            return (int)Math.pow((n%10),p)+sumofDigits(n/10,p-1);
    }
}