class Count_iland
{
	static int countiIsland(int [][]arr,int row ,int col)
	{
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]==1)
				{
					if(((i==0 || arr[i-1][j]==0) && (j==0 || arr[i][j-1]==0)) && ((i!=0 || j!=0)&&(arr[i-1][j-1]==0))) 
					{
						count++;
					}
				}
			}
		}return count;

	}
	public static void main(String []args)
	{
		int [][]arr={ {1,1,0,0,0,0},
					  {1,1,0,1,0,0},
					  {0,0,0,0,1,0},
					  {0,0,0,0,0,0},
					  {0,0,0,1,1,0}
					};
		int row=5;
		int col=6;
		int cnt=countiIsland(arr,row,col);
		System.out.println(cnt);
	}
}