import java.util.Scanner;
class QueueImplementation
{
	static int cap=5;
	static int []arr=new int[cap];
	static int front=0,rear=0;

	public static void main(String []args)
	{
		boolean off=true;
		while(off)
		{
				Scanner sc=new Scanner(System.in);

			System.out.println("enter the choice\n1.enque\n2.deque\n3.travers\n4.quit");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1: enque();break;
				case 2: deque();break;
				case 3: travers();break;
				case 4: off=false;break;
				default: System.out.println("invalid input");
			}
		}
	}
	public static void enque()
	{
		if(rear==cap)
		{
			System.out.println("queue is overflow");
		}else
		{
				Scanner sc=new Scanner(System.in);

			System.out.println("enter the element to enque");
			int ele=sc.nextInt();
			arr[rear]=ele;
			rear++;
		}
	}
	public static void deque()
	{
		if(front==rear)
		{
			System.out.println("queue is underflow");
		}else
		{
			System.out.println("deleted element is "+arr[front]);
			for(int i=0;i<rear-1;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
		}
	}
	public static void travers()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
		}else
		{
			System.out.println("after traversing the elements are");
			for(int i=front;i<rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}