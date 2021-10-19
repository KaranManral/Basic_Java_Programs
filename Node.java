public class Node
{
    int data;
    Node link;
    Node(int d,Node l)
    {
        data=d;
        link=l;
    }
    void setData(int d)
    {
        data=d;
    }
    void setLink(Node l)
    {
        link=l;
    }
    int getData()
    {
        return data;
    }
    Node getLink()
    {
        return link;
    }
}