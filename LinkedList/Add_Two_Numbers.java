class Add_Two_Numbers
{
	/* i/o: (2->4->3)+(5->6->4)  digits are stored in the reverse order
	   o/p : 7->0->8
	   Explanation: 342+465=807.
	*/
	   static class Node
	   {
	   	int data;
	   	Node next;
	   	public Node(int d)
	   	{
	   		data=d;
	   	}
	   }
	   static Node createLinked_List(Node head,int data){
	   	Node newNode=new Node(data);
	   	if(head==null){
	   		head=newNode;
	   		return head;
	   	}
	   	Node temp=head;
	   	while(temp.next!=null){
	   		temp=temp.next;
	   	}
	   	temp.next=newNode;
	   	return head;

	   }
	   static void printLinkedList(Node head){
	   	if(head==null){
	   		System.out.println("linked list is empty");
	   		return;
	   	}
	   	Node temp=head;
	   	while(temp!=null){
	   		if(temp.next==null){
	   			System.out.print(temp.data);
	   			break;
	   		}
	   		System.out.print(temp.data+"->");
	   		temp=temp.next;
	   	}

	   }
	   static int getNum(Node head){
	   	if(head==null){
	   		System.out.println("NO elemenets are tehre in the list");
	   		return 0;
	   	}
	   	int num=0;
	   	Node temp=head;
	   	while(temp!=null){
	   		int num1=temp.data;
	   		num=(num*10)+num1;
	   		temp=temp.next;
	   	}
	   	int rev=0;
	   	while(num>0){
	   		int rem=num%10;
	   		rev=(rev*10)+rem;
	   		num=num/10;
	   	}
	   	return rev;
	   }
	   public static void main(String[] args) {
	   	Node head=null;
	   	head=createLinked_List(head,2);
	   	head=createLinked_List(head,4);
	   	head=createLinked_List(head,3);
	   	printLinkedList(head);
	   	System.out.println();

	   	Node head1=null;
	   	head1=createLinked_List(head1,5);
	   	head1=createLinked_List(head1,6);
	   	head1=createLinked_List(head1,4);
	   	printLinkedList(head1);
	   	System.out.println();

	   	int num1=getNum(head);
	   	System.out.println(num1);
	   	
	   	System.out.println();

	   	int num2=getNum(head1);
	   	System.out.println(num2);

	   	int sum=num1+num2;

	   	Node head3=null;
	   	while(sum>0){
	   		int rem=sum%10;
	   		head3=createLinked_List(head3,rem);
	   		sum=sum/10;
	   	}
	   	System.out.println();
	   	printLinkedList(head3);
	   	
	   }
}