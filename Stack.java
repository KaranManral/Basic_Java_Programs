class Stack
{
    int cap,top; 
    String stud[];
    Stack(int max)
    {
        top=-1;
        cap=max;
        stud=new String[cap];
    }
    void push(String n)
    {
        if(top==cap-1)
        System.out.println("OVERFLOW");
        else if(top==-1)
        {
            top=0;
            stud[top]=n;
        }
        else
        stud[++top]=n;
    }
    String pop()
    {
        String w="";
        if(top<0)
        System.out.println("$$");
        else
        {
            w=stud[top];
            stud[top--]=null;
        }
        return w;
    }
}