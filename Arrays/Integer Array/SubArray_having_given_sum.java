import java.util.*;
class SubArray_having_given_sum
{
	public static void main(String[] args) {
		int []arr={2,4,5,3,3,1}; 
		int target=6;

		for(int i=0;i<arr.length;i++){
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++){
				sum+=arr[j];
				List <Integer> list=new ArrayList<>();
				list.add(arr[i]);
				if(sum==target){
					list.add(arr[j]);
					System.out.println(list);
					sum-=arr[j];
					continue;
				}
				if(sum<target){
					list.add(arr[j]);
					continue;
				}
				if(sum>target){
					sum=arr[i];
					continue;
				}
				
				// if(sum<target){
				// 	sum=arr[i];
				// 	continue;
				// }
				// if(sum>targe){
				// 	sum=arr[i];
				// 	continue;
				// }
			}
		}
	}
}