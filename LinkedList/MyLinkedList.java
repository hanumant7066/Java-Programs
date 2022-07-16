import java.util.*;
public class MyLinkedList
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}


	public static void add(MyLinkedList li, int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;

		if(li.head == null){
			head=new_node;
			return;
		}
		Node last=head;
		while(last.next != null){
			last=last.next;
		}
		last.next=new_node;
	}

	public static void print(MyLinkedList li)
	{
		Node temp=li.head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}

	static void reverse(MyLinkedList li)
	{
		Node temp=li.head;

		Stack<Node> s=new Stack<>();
		if(temp.next == null || temp == null){
			return;
		}
		while(temp.next != null)
		{
			s.push(temp);
			temp=temp.next;
		}
		li.head=temp;
		while(!s.isEmpty())
		{
			temp.next=s.peek();
			System.out.println("data is "+ s.peek().data);
			s.pop();
			temp=temp.next;
		}
		System.out.println("i am returned ");
	}
	static Node head; // head of linked list


	public static void main(String[] args) 
	{
		MyLinkedList li=new MyLinkedList();
		li.add(li, 10);
		li.add(li,20);
		li.add(li,30);
		li.add(li,40);
		li.print(li);
		li.reverse(li);
		li.print(li);
	}
}