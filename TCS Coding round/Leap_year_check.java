import java.util.Scanner;
class Leap_year_check
{
	// check givan year is leap year or not
	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();

		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("this is leap year");
				}
				else
				{
					System.out.println("this is not a leap year");
				}

			}
			else
			{
				System.out.println("this is leap year");
			}

		}else{
			System.out.println("this is not a leap year");
		}
	}

}