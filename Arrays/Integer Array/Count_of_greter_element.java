import java.util.Arrays;
class Count_of_greter_element
{
	/* Given an array arr of integeres of size N, the task is to 
	find, for every element, the number of elements 
	that are greater than it.

	i/p:{4,6,2,1,8,7}
	o/p:{3,2,4,5,0,1}*/
	static void getLarger(int []arr){
		int []new_arr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i] && i!=j){
					count++;
				}
			}
			new_arr[i]=count;
		}
		System.out.println("output array is: "+Arrays.toString(new_arr));
	}
	public static void main(String[] args) {
		int []arr={4,6,2,1,8,7};
		getLarger(arr);
		
	}
}