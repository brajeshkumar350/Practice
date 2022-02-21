package DS.linkedlist;

public class LinkListProgramme {

    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);

        //linkedList.printList();

        MyLinkedList list = new MyLinkedList();
        list.head = new Nodes(1);
        list.head.next = new Nodes(2);
        list.head.next.next = new Nodes(3);
        list.head.next.next.next = new Nodes(4);
        list.head.next.next.next.next=new Nodes(5);
       // list.head.next.next.next.next.next=new Nodes(6);
       // list.head.next.next.next.next.next.next=new Nodes(7);

       //Nodes ss= list.reverse(list.head);
        //list.reversePAirWise(list.head);
        list.printList(list.head);
        Nodes ss=list.deleteNode(3, list.head);
        System.out.println("after delete");
        list.printList(ss);

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

    void printList(Nodes s)
    {
        Nodes temp=s;

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
    void reversePAirWise(Nodes start)
    {
        Nodes temp = start;

        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {

            /* Swap the data */
            int k = temp.val;
            temp.val = temp.next.val;
            temp.next.val = k;
            temp = temp.next.next;
        }

    }
    Nodes deleteMiddleNode(Nodes start)
    {
        Nodes temp=start;

        Nodes prev=null;
        Nodes fast=start;
        while (fast != null && fast.next!=null) {
            prev = temp;
            temp = temp.next;
            fast=fast.next.next;
        }
        prev.next = temp.next;
        return start;
    }

    Nodes deleteNode(int  k,Nodes start)
    {
        Nodes temp=start;

        /* Traverse only till there are atleast 2 nodes left */
        Nodes prev=null;
        while (temp != null && temp.val!=k) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return start;
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
