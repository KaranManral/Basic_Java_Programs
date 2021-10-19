class Link
{
    int lnk[],F,R,Size;
    Link(int s)
    {
        Size=s;
        F=R=0;
        lnk=new int[Size];
    }

    void insertFront(int v)
    {
        if(F>=0&&F==R)
            lnk[F--]=v;
        else
            System.out.println("OUT OF SIZE");
    }

    void deleteRear()
    {
        int k=0;
        if(R==F)
            System.out.println("Empty");
        else
            lnk[--R]=k;
    }
}