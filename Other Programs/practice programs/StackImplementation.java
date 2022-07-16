import java.util.Scanner;
class Stackimplementation
{
	static int capacity=5;
	static int []arr=new int[capacity];
	static int top=-1;

	public static void main(String []args)
	{
		boolean off=true;
		Stackimplementation obj1=new Stackimplementation();
		while(off)
		{
			System.out.println("Enter the choice\n1.push\n2.pop\n3.travers\n4.peek\n5.Quit");
			Scanner obj=new Scanner(System.in);

			int ch=obj.nextInt();
			switch(ch)
			{
				case 1: System.out.println("enter the no. to push");
						int num=obj.nextInt();
						obj1.push(num);
						break;
				case 2: obj1.pop();break;
				case 3: obj1.travers();break;
				case 4: obj1.peek();break;
				case 5: off=false;break;
				default: System.out.println("invalid input");

			}
		}
	}
	void peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is underflow");
		}else
		{
			System.out.println("peeked atom is "+arr[top]);
		}
	}
	void travers()
	{
		if(isEmpty())
		{
			System.out.println("stack is underflow");
		}else
		{
			System.out.println("after traversing the elements are");
			for(int i=0;i<=top;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	void pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is underflow");

		}else
		{
			System.out.println("popped item is "+arr[top]);
			top--;
		}
	}
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
	void push(int num)
	{
		if(isFull())
		{
			System.out.println("stack is overflow");
		}else
		{
			top++;
			arr[top]=num;
			System.out.println("pushed element susccesfull");
		}
	} 
	boolean isFull()
	{
		if(top==capacity-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
}