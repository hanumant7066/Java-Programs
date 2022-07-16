import java.util.*;
class HackerEarth   // code not working
{
	static class Node
	{
		int data;
		Node next;

		public Node(int d)
		{
			data=d;
		}
	}
	static Node createList(Node head,int data)
	{
		Node temp=new Node(data);

		if(head==null){
			head=temp;
			return head;
		}
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=temp;
		return head;
	}
	static void printList(Node head)
	{
		if(head==null)
			System.out.println("head is null");
		else
		{
			while(head!=null){
				System.out.print(head.data+" ");
				head=head.next;
			}	
		}
	}
	static Node deleteFriend(Node head)
	{
		Node prev=null;
		Node temp=head;
		Node next=head.next;
		if(head.data<next.data){
			prev=head.next;
			temp=prev.next;
			next=temp.next;
		}
		while(next!=null)
		{
			if(temp.data<next.data)
			{
				System.out.println("deleted friend is "+temp.data);
				prev.next=next;
				temp=temp.next;
				next=next.next;
				del--;
			}
			else
			{
				prev=temp;
				temp=temp.next;
				next=next.next;

			}
		}
		if(del==0)
			return head;
		else
			return deleteFriend(head);
	}
	static int del;
	public static void main(String[] args) 
	{
		Node head=null;
		System.out.println("how many node you have");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		System.out.println("how many friends you have to delete");
		del=sc.nextInt();

		System.out.println("Enter the "+N+" nodes values");

		for(int i=0;i<N;i++)
		{
			int ele=sc.nextInt();
			head=createList(head,ele);
		}
		/*head=createList(head,19);
		head=createList(head,12);
		head=createList(head,3);
		head=createList(head,4);
		head=createList(head,17);*/
		head=deleteFriend(head);
		printList(head);


		
	}
}