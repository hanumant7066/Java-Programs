class Second_highest_and_second_lowest {
 
    // Utility function to find sum of
    // all divisor of number up to 'n'
    static int divisorSum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; ++i)
        {
        	System.out.println("Value of i is "+i);
            sum += (n / i) * i;
            System.out.println("Value of sum is "+sum);
        }

        return sum;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(divisorSum(n));
       // n = 5;
        //System.out.println(divisorSum(n));
        System.out.println("Result is "+14/4);
    }
}










// class Second_highest_and_second_lowest
// {
// 	public static void main(String[] args) {
// 		int arr[]={211,3,7,4000,9,10,1,1,1,1,1,1,2,2,2,2,3,3,3};

// 		int second_high = Integer.MIN_VALUE;
// 		int first_high = Integer.MIN_VALUE;
// 		int second_low= Integer.MAX_VALUE;
// 		int first_low = Integer.MAX_VALUE;



// 		for(int i=0;i< arr.length;i++)
// 		{
// 			if (arr[i] > first_high)
// 			{
// 				second_high = first_high;
// 				first_high = arr[i];
// 			}
// 			if (arr[i] > second_high && arr[i] < first_high)
// 			{
// 				second_high = arr[i];
// 			}

// 			// to find first minimum and second minimum
// 			if (arr[i] < first_low)
// 			{
// 				second_low = first_low;
// 				first_low = arr[i];
// 			}
// 			if ( arr[i] < second_low && arr[i] > first_low)
// 			{
// 				second_low = arr[i];
// 			}
// 		}
// 		System.out.println("Second Highest and first Highest"+second_high+" "+first_high);
// 		System.out.println("Second lowest and first lowest"+second_low+" "+first_low);
// 	}
// }