package DS;

public class LinkListProgramme {

    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);

        linkedList.printList();

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
}
