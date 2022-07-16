

class MyArrayList
{
	int []arr;
	int count;
	int capacity;
	public MyArrayList()
	{
		arr= new int[10];
		count=0;
		capacity = 10;
	}
	public void add(int element)
	{
		if (count == capacity)
		{
			capacity *= 2; 
			int temp[]=new int[capacity];
			for(int i =0;i<count;i++)
			{
				temp[i]=arr[i];
			}
			arr=temp;
		}
		arr[count]=element;
		count++;
	}
	public static void main(String[] args) {
		MyArrayList li = new MyArrayList();
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);
		li.add(10);
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		System.out.println("Now the capacity is"+li.arr.length);


	}
}







// import java.util.*;
// public class MyArrayList
// {
// 	static int capacity = 1, count=0;// current_capacity = 
// 	static int [] arr;// = new int[capacity];
	
// 	public MyArrayList()
// 	{
// 		arr=new int[1];
// 	}
// 	public static void resize()
// 	{
// 		capacity = (capacity * 2);
// 		int temp []=new int[capacity];
// 		for (int i=0;i<count;i++)
// 		{
// 			temp[i]=arr[i];
// 		}
// 		arr=temp;
// 		//System.out.println("Content is "+Arrays.toString(arr));

// 	}
// 	public static void add(int element)
// 	{
// 		MyArrayList li=new MyArrayList();
// 		if (count == capacity)
// 		{
// 			li.resize();
// 			System.out.println("condition is True");
// 		}
// 		arr[count]=element;
// 		count++;
// 	}
// 	public static void main(String[] args) {
// 		MyArrayList obj = new MyArrayList();

// 		System.out.println("Size of ArryList is "+obj.capacity);

// 		obj.add(10);
// 		obj.add(20);
// 		obj.add(30);
// 		obj.add(40);
// 		System.out.println("Content is "+Arrays.toString(arr));

// 		obj.add(50);
// 		obj.add(60);
// 		System.out.println("Size of ArryList is "+obj.capacity);
// 		System.out.println("Content is "+Arrays.toString(arr));

// 	}
// }