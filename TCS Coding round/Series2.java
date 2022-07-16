import java.util.Scanner;
class Series2
{
		// 0,0,7,6,14,12,21,18,28,24
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();

			if(N%2==1)
			{
				int ans=(N/2)*7;
				System.out.println(ans);
			}
			else
			{
				int ans=(N/2-1)*6;
				System.out.println(ans);
			}
		}



	// public static void main(String[] args) 
	// {
	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("Enter the value of N");
	// 	int N=sc.nextInt();
	// 	int a=1,b=1;
	// 	for(int i=2;i<=N;i++)
	// 	{
	// 		if(i%2!=0){
	// 			a=a*2;
	// 		}
	// 		else
	// 		{
	// 			b=b*3;
	// 		}
	// 	}
	// 	System.out.println("valu of a nd b is +"+a+" "+b);
	// 	if(N%2!=0){
	// 		int val=a/2;
	// 		System.out.println(N+" term is "+a);}
	// 	else{
	// 		int val2=b/3;
	// 		System.out.println(N+" term is "+val2);
	// 	}
	// }
}