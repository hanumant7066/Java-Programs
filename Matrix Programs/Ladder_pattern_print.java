import java.util.Scanner;
class Ladder_pattern_print
{
	static void printLadderPattern(int [][]arr,int N)
	{
		int row=1;
		int col=0;
		System.out.print(arr[0][0]+" ");
		while(row<N && col<N)
		{
			System.out.print(arr[row][col]+" ");
			col++;
			System.out.print(arr[row][col]+" ");
			row++;

		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of N to form N x N matrix ");
		int N=sc.nextInt();
		int arr[][]=new int[N][N];
		System.out.println("enter the value in matrix");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		printLadderPattern(arr,N);
	}
}