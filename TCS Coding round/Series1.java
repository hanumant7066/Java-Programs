import java.util.Scanner;
class Series1

{   // 0,0,2,1,4,2,6,3,8,4,10,5,12

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		if(N%2==0){
			int ans=N/2-1;
			System.out.println(ans);
		}
		else{
			int ans=N-1;
			System.out.println(ans);
		}
	}
}






// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("enter the value of N");
// 		int N=sc.nextInt();
// 		int odd=0,even=0;
// 		for(int i=3;i<=N;i++)
// 		{
// 			if(i%2==0)
// 			{
// 				System.out.print(even+" ");
// 				even=even+6;
// 			}
// 			else
// 			{
// 				System.out.print(odd+" ");
// 				odd+=7;
// 			}
// 		}
// 		if(N%2==0){
// 			System.out.print(even+" ");
// 			System.out.println();
// 			System.out.println(N+" term is "+even);}
// 		else{
// 			System.out.print(odd+" ");
// 			System.out.println();
// 			System.out.println(N+" term is "+odd);}

// 	}
// }