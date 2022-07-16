class NQueen_Problem
{
	static int N=4;
	static boolean isSafe(int board[][],int row,int col)
	{
		int i,j;
		//Check this row on left sides
		for(i=0;i<col;i++){
			if(board[row][i]==1)
				return false;
		}
		// check upper diagonal on left side
		for(i=row,j=col;i>=0 && j>=0;i--,j--){
			if(board[i][j]==1)
				return false;
		}
		// Check lower diagonal on left side;
		for(i=row,j=col;i<N && j>=0;i++,j--){
			if(board[i][j]==1)
				return false;
		}
		
		return true;
	}
	static boolean solveUntil(int board [][],int col)
	{
		/*Base case: if all queens are placed then return true;*/
		if(col>=N)
			return true;
		//consider this column and try placing this queen in all rows one by one
		for(int i=0;i<N;i++)
		{
			// Check if queen can be placed on board[i][col].
			if(isSafe(board,i,col))
			{
				// Place the queen in board[i][col]
				board[i][col]=1;

				//Recursion to place rest of all the queens.

				if(solveUntil(board,col+1))
					return true;

				//If placing queen in board[i][col] doesnt lead to solution, then
				// remove queen from
				//board[i][col]
				board[i][col]=0;  //Backtracking.
			}
		}
		
		// If queen can not be place in any row in this column col then return false
		return false;
	}
	public static void main(String[] args) {
		int board[][]={{0,0,0,0},
					   {0,0,0,0},
					   {0,0,0,0},
					   {0,0,0,0}};
		solveUntil(board,0);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}