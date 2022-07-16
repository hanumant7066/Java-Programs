class Childc
{
	public void set()
	{
		System.out.println("a");
	}
}
class C extends Childc
{
	public void childmethod()
	{
		System.out.println("b");
	}
	
}
public class Third
{
	public static void main(String []args)
	{
		Childc obj=new C();
		obj.set();
		
	}
	
}
