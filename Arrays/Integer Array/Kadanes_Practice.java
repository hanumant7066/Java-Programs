class Kadanes_Practice
{

	//using Kadanes Algo sum and also that subarray having max sum
	public static void main(String[] args) {
		int []arr={1,-4,5,4,-4};
		int max_before=0,current_max=0,low_index=0,high_index=0,s=0;
		for(int i=0;i<arr.length;i++){
			current_max+=arr[i];
			if(max_before<current_max){
				max_before=current_max;
				low_index=s;
				high_index=i;
			}
			if(current_max<0){
				current_max=0; 
				s=i+1;
			}

		}
		System.out.println("maximum sum is "+max_before);
		System.out.println("SubArray having max sum is : ");
		for(int i=low_index;i<=high_index;i++){
			System.out.print(arr[i]+" ");
		}

	}

	/*

	// Using Kadanes Algo
	public static void main(String[] args) {
		int []arr={1,-4,5,4,-4};
		int current_max=0;
		int max_before=0;
		for(int i=0;i<arr.length;i++)
		{
			current_max+=arr[i];
			if(max_before<current_max)
				max_before=current_max;

			if(current_max<0){
				current_max=0;
			}

		}
		System.out.println("maximum sum is "+max_before);
	}

	*/




/*
			Withought using Kadanes Algo
	public static void main(String[] args) {
		int []arr={10,4,-1,-6,-5,4,-4};
		int max_sum=0;
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++){
			int temp_sum=arr[i];
			for(int j=i+1;j<arr.length;j++){
				temp_sum+=arr[j];
				if(max_sum<temp_sum){
				max_sum=temp_sum;
				start=i;
				end=j;
				}
			}
			
		}
		System.out.println("maximum sum is "+max_sum);
		System.out.println("and subarray is ");
		for(int k=start;k<=end;k++){
			System.out.print(arr[k]+" ");
		}
	}
	*/
}