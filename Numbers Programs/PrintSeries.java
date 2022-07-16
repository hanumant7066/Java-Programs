import java.util.Scanner;
class PrintSeries
{
	// print the series like 1 1 2 2 4 4 8 8 16 16 32 32....
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=1;
		int check=2;
		if(n==1)
			System.out.print("1");

		if(n==2)
			System.out.print("1 1");
		if(n==3)
			System.out.print("1 1 2");
		if(n>3){
			if(n%2==0){
				System.out.print("1 1 ");
				while(true)
				{
					int temp=num1*2;
					System.out.print(temp+" "+temp+" ");
					check+=2;
					if(n==check)
						break;
					num1=temp;
				}
			}
			else
			{
				System.out.print("1 1 ");
				while(true)
				{

					int temp=num1*2;
					System.out.print(temp+" "+temp+" ");
					check+=2;
					if(n-1==check){
						temp=temp*2;
						System.out.print(" "+temp);
						break;
					}
					num1=temp;
				}
			}
		}

	}
}