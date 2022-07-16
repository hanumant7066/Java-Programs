import java.util.Scanner;
class PrintTwoSequence
{ 
	// series print like 1,2,1,3,2,5,3,7,5,11,8
	// One series is prime numner and another is fibbonassi series;
	public static void main(String[] args) {
		int n1=1;
		int n2=1;
		int P=3;
		
		boolean result=true;
		int count=3;
		System.out.println("Last index to value");
		Scanner sc=new Scanner(System.in);
		int last=sc.nextInt();
		System.out.print("1 2 1 ");

		while(count<last)
		{
			if(result==true)
			{
				while(true)
				{
					int cnt=0;
					for(int i=2;i<=P/2;i++)
					{
						if(P%i==0)
						{
							cnt++;

							break;
						}
					}
					if(cnt==0){
						System.out.print(" "+P);
						result=false;
						P++;
						count++;
						break;
					}
					else{
						P++;
					}
				}
			}
			else
			{
				int n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
				result=true;
				count++;
			}
		}
	}
}