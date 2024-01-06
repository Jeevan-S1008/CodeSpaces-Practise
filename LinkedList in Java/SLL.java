class SLL
{
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size=0;
    }
    private class Node
    {
        private int value;
        private Node next;

        private Node(int value)
        {
            this.value=value;
        }
        private Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }

    }
    public void InsertFirst(int val)
    {
        Node node =new Node(val);
        node.next=head;
        head =node;
        if(tail==null)
        {
            head =tail;
        }
        size++;
    }
    public void Display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
    }
}