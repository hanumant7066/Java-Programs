class Product_Array_Puzzle
{
	//i/p={2,3,4,5,10}
	//o/p={600,400,300,240,120}
	public static void main(String[] args) {
		
		int []arr={10,3,5,6,2};
		int []arr1=new int[arr.length];
		int counter=0;
		while(counter<arr.length)
		{
			int product=1;
			for(int i=0;i<arr.length;i++){
				if(counter==i){
					continue;
				}
				
				
				product=product*arr[i];
				
			}
			arr1[counter]=product;
			counter++;
		}
		for(int x:arr1)
		{
			System.out.print(x+" ");
		}
	}
}