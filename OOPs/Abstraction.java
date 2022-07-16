abstract class Demo
{
	int interestRate;
	//abstract void run();
}
class Demo1 extends Demo
{
	public int getInterestRate()
	{
		interestRate = 5;
		return interestRate;
	}
	public void run()
	{
		System.out.println("Inside Demo1 class");
		//return 0;
	}
}
class Sbi extends Demo
{
	public int getInterestRate()
	{
		interestRate= 7;
		return interestRate;
	}
}
public class Abstraction extends Demo
{
	public void run()
	{
		System.out.println("HEllo WOrld Run method called");

	}

	public static void main(String[] args) {
		//System.out.println("HEllo WOrld");
		//Demo obj = new Abstraction();
		//obj.run();

		Demo1 obj1 = new Demo1();
		System.out.println(obj1.getInterestRate());

		Sbi obj = new Sbi();
		System.out.println(obj.getInterestRate());
		
	}
} 
