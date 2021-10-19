class Stack1
{
    int cap,top; 
    String stud[];
    Stack1(int max)
    {
        top=0;
        cap=max;
        stud=new String[cap];
    }
    void push(String n)
    {
        if(top==cap)
        System.out.println("OVERFLOW");
        else
        stud[top++]=n;
    }
    String pop()
    {
        String w="";
        if(top==0)
        w="$$";
        else
        {
            w=stud[top-1];
            stud[--top]=null;
        }
        return w;
    }
}