import java.util.Arrays;
import java.util.HashSet;
class Index_find_with_given_sum
{
	static void findIndexMethod3(int []arr,int sum)
	{
		HashSet set=new HashSet();
		for(int i=0;i<arr.length;i++){
			int temp=sum-arr[i];
			if(set.contains(temp)){
				System.out.println("sum is found and the pair is "+arr[i]+","+temp);
			}
			set.add(arr[i]);
		}

	}
	static void findIndexMethod2(int []arr,int sum){
		Arrays.sort(arr);
		int low=0,high=arr.length-1;int cnt=0;
		while(low<high){
			int temp_sum1=arr[low]+arr[high];
			if(temp_sum1==sum){
				cnt++;
				break;
			}
			if(temp_sum1>sum){
					high--;
			}else{
				low++;
			}
		}
		if(cnt!=0){
				System.out.println("lower index is "+low+" higher index is "+high);	
		}else{
			System.out.println("index not found");
		}
		
	}
	static void findIndexMethod1(int []arr,int sum){
		int low=0,high=0;
		for(int i=0;i<arr.length;i++){
			int temp_sum=arr[i];
			for(int j=i+1;j<arr.length;j++){
				temp_sum+=arr[j];
				if(temp_sum==sum){
					low=i;
					high=j;
				}
				temp_sum=arr[i];
			}
		}
		if(low==0 && high==0)
		{
			System.out.println("index not found ");
			return;
		}
		System.out.println("lower index is "+low+" and higher index is "+high);
	}
	static int kadanesAlgotp(int []arr){
			int prev_sum=0,curr_sum=0;int low=0,high=0;
			for(int i=0;i<arr.length;i++){
				curr_sum+=arr[i];
				if(curr_sum>prev_sum){
					prev_sum=curr_sum;
					
					//high=i;
				}
				if(curr_sum<0){
					curr_sum=0;
					//low=i;
				}
			}
			System.out.println("maximum sum is "+prev_sum);
			return 0;
	}
	public static void main(String[] args) {
		int arr[]={1,-9,2,4,5,-6,3};
		int sum=9;
		//findIndexMethod1(arr,sum);
		findIndexMethod3(arr,sum);
		//findIndexMethod2(arr,sum); // Not working this Method;
		//kadanesAlgotp(arr);
	}
}