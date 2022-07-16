public class Linked_List
{
    class Node{
        private int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
        
    }
    Node reverseLinkedList(Node head)
    {
        if(head==null){
            System.out.println("empty linked list");
            return head;
        }else{
            Node prev=null;
            Node current=head;
            Node next=null;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
            return head;
        }

    }
    Node insertAt(Node head, int data,int index)
    {
        Node newNode=new Node(data);

        if(index==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        int count=0;

        Node prev=null;
        Node current=head;
        while(current.next!=null){
            prev=current;
            current=current.next;
            count++;
            if(count==index){
                prev.next=newNode;
                newNode.next=current;
                return head;
            }
        }
        System.out.println(index+" index not found");
        return head;
    }

    Node createlinkedlist(Node head,int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;

        if(head==null){
            head=newNode;
            return head;
        }
        else
        {
            Node last = head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next=newNode;
            return head;
        }
    }
    void printLinkedList(Node head)
    {
        if(head==null)
            System.out.println("Linked list is empty");
        else{
            Node last=head;
            while(last!=null){
                System.out.print(last.data+" ");
                last=last.next;
            }
        }
    }
    Node deleteAt(Node head,int index)
    {
        if(head==null){
            System.out.println("list is empty");
            return head;
        }
        if(index==0){
            head=head.next;
            return head;
        }
        int count=0;
        Node prev=null;
        Node current=head;
        while(current.next!=null){
            prev=current;
            current=current.next;
            count++;
            if(count==index){
                prev.next=current.next;
                return head;
            }
        }
        System.out.println("index not found to delete element");
        return head;
    }
    Node sort_Linked_List(Node head)
    {
    	if(head==null || head.next==null){
    		return head;
    	}
    	Node current=head;
    	
    	
    	while(current.next!=null)
    	{
    		Node next=current.next;
    		while(next!=null)
    		{
    			if(current.data> next.data)
    			{

    			     int temp=current.data;
                     current.data=next.data;
                     next.data=temp;
    				
    			}
    			next=next.next;
    		}
    		
    		current=current.next;

    	}
    	return head;
    }
    void mergeTwoSortedLists(Node head1,Node head2)
    {
        //if(head1==null || head2==null)
            //return head1;
        Node newhead;
        if(head1.data>head2.data)
        {
            newhead=new Node(head2.data);
            newhead.next=null;
            head2=head2.next;
        }else{
            newhead=new Node(head1.data);
            newhead.next=null;
            head1=head1.next;
        }
        Node temp=newhead;
        while(head1!=null && head2!=null)
        {
            
            if(head1.data>head2.data){
                Node h1=new Node(head2.data);
                h1.next=null;
                newhead.next=h1;

                head2=head2.next;
            }else{
                Node h2=new Node(head1.data);
                h2.next=null;
                newhead.next=h2;
                head1=head1.next;
            }
        }
        while(head1!=null){
            Node h1=new Node(head1.data);
            h1.next=null;
            newhead.next=h1;
            head1=head1.next;
        }
        while(head2!=null){
            Node h2=new Node(head2.data);
            h2.next=null;
            newhead.next=h2;
            head2=head2.next;
        }
        //Linked_List obj4=new Linked_List();
        //obj4.printLinkedList(newhead);
        if(temp==null)
            System.out.println("Linked list is empty");
        else{
            System.out.println("sorted linked list is ");
            Node last=temp;
            while(last!=null){
                System.out.print(last.data+" ");
                last=last.next;
            }
        }
        
    }


    Node head=null;
    Node head1=null;
    Node head3=null;
    public static void main(String[] args) {
        Linked_List obj=new Linked_List();
        obj.printLinkedList(obj.head);


        obj.head=obj.createlinkedlist(obj.head,10);
        obj.head=obj.createlinkedlist(obj.head,20);
        obj.head=obj.createlinkedlist(obj.head,30);
        obj.head=obj.createlinkedlist(obj.head,40);
        obj.head=obj.createlinkedlist(obj.head,50);

        obj.printLinkedList(obj.head);

        obj.head=obj.reverseLinkedList(obj.head);
        System.out.println();
        System.out.println("after reversing linked list");
        System.out.println();
        obj.printLinkedList(obj.head);

        System.out.println();

        obj.head=obj.insertAt(obj.head,70,2);
        System.out.println("after performing insert operation");
        System.out.println();
        obj.printLinkedList(obj.head);

        System.out.println();
        System.out.println("after performing delete operation ");
        obj.head=obj.deleteAt(obj.head,3);
        obj.printLinkedList(obj.head);

        
       System.out.println();
        System.out.println("after Sorting linked list ");
        obj.head=obj.sort_Linked_List(obj.head);   //sot function not working curently;
        obj.printLinkedList(obj.head); 

        obj.head1=obj.createlinkedlist(obj.head1,5);
        obj.head1=obj.createlinkedlist(obj.head1,15);
        obj.head1=obj.createlinkedlist(obj.head1,35);
        obj.head1=obj.createlinkedlist(obj.head1,35);
        obj.head1=obj.createlinkedlist(obj.head1,45);

        System.out.println();
        System.out.println("this is second linked list");
        obj.printLinkedList(obj.head1);

        //obj.mergeTwoSortedLists(obj.head,obj.head1);

       // System.out.println("merged linked list is ");

        //obj.printLinkedList(head3);
     /*   Linked_List obj3=new Linked_List();
        obj3.head3=obj3.createlinkedlist(obj3.head1,19);
        obj3.head3=obj3.createlinkedlist(obj3.head1,12);
        obj3.head3=obj3.createlinkedlist(obj3.head1,3);
        obj3.head3=obj3.createlinkedlist(obj3.head1,4);
        obj3.head3=obj3.createlinkedlist(obj3.head1,7);


        System.out.println();

        System.out.println("third linked list is");
        System.out.println();
        obj3.printLinkedList(obj3.head3);*/

    }
}
