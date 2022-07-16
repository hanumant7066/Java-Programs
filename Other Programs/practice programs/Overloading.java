public class Overloading 
{
	protected Number m1(int i)
	{
		System.out.println("int parent method");
		return 20;
	}
}
class Child1 extends Overloading 
{
	public Integer m1(int i)
	{
		System.out.println("int child method");
		return 10;
	}
	
}
class Test
{
	public static void main(String [] args)
	{
		Overloading obj1=new Child1();
		obj1.m1(10);
	

	}
}
