import java.util.Scanner;
class Snake_pattern_print
{
	static void printSnakePattern(int [][]arr,int N)
	{
		for(int i=0;i<N;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}else
			{
				for(int j=N-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of N to form NxN matrix ");
		int N=sc.nextInt();
		int arr[][]=new int[N][N];
		System.out.println("enter the value in matrix");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		printSnakePattern(arr,N);
	}
}