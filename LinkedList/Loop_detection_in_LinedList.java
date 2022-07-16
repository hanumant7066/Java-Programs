import java.util.*;
class Loop_detection_in_LinedList
{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static void detectLoopMethod2(Node head){ // method takes O(n) time and O(1) space
		Node p1=head;						  //This is also called as Flyods algorithm
		Node p2=head;
		Node prev=null;
		int count=0;
		while(p1!=null && p2!=null && p2.next!=null)
		{
			prev=p1;
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2){
				count++;
				break;
			}

		}
		if(count==1){
			System.out.println("loop detected and it is at "+p1.data+" and its privious data is "+prev.data);
			prev.next=null;
			System.out.println("After removing cycle list is ");
			printLinkedList(head);}

		else
			System.out.println("loop Not detected");

	}
	static void detectLoopMethod1(Node head){         // method takes O(n) time and O(n) space
		ArrayList<Node> map=new ArrayList<Node>(); 
		Node prev=null; 
		Node temphead=head;              // We can also use HashSet here..it is good to use Hashset
		while(head.next!=null){
				if(map.contains(head))
				{
					System.out.println("Loop found ");
					System.out.println("loop found at data "+prev.data);
					prev.next=null;

					printLinkedList(temphead);
					return;
				}
			map.add(head);
			prev=head;
			head=head.next;
		}
		System.out.println("Loop not found ");


	}
	static Node insertNode(Node head,int data){
		Node newNode=new Node(data);
		Node temp=head;

		if(head==null){
			head=newNode;
			return head;
			
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			if(newNode.data==50){    //This logic is for making loop in linkedlist
				temp.next=head;
				return head;
			}
			temp.next=newNode;
			return head;
		}
	}
	static void printLinkedList(Node head){
		if(head==null){
			System.out.println("Linked is empty");
		}else{
			Node temp=head;
			System.out.println("Linked list items are: ");
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Node head=null;	
		head=insertNode(head,10);
		head=insertNode(head,20);
		head=insertNode(head,30);
		head=insertNode(head,40);
		head=insertNode(head,50);

		detectLoopMethod1(head);
	}
}