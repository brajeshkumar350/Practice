package DS;

public class LinkListProgramme {

    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);

        //linkedList.printList();

        MyLinkedList list = new MyLinkedList();
        list.head = new Nodes(85);
        list.head.next = new Nodes(15);
        list.head.next.next = new Nodes(4);
        list.head.next.next.next = new Nodes(20);

        list.reverse(list.head);
        list.printList();

    }
}
class Nodes{
    int val;
    Nodes next;
    Nodes(int val)
    {
        this.val=val;
        next=null;
    }

}
class MyLinkedList
{
    Nodes head;
    void add(int data)
    {
        Nodes toAdd=new Nodes(data);
        if(head==null){
            head=toAdd;
            return;
        }
        Nodes temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=toAdd;
    }

    void printList()
    {
        Nodes temp=head;

        while(temp!=null)
        {
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }

    Nodes reverse(Nodes start)
    {
        Nodes current=start;
        Nodes prev=null;
        while(current!=null)
        {
            Nodes temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;

    }
    Nodes reverseByRec(Nodes head)
    {
        while(head==null || head.next==null){
            return head;}
        Nodes newNodes=reverse(head.next);
        Nodes headNext=head.next;
        headNext=head;
        head.next=null;
        return newNodes;

    }
}
