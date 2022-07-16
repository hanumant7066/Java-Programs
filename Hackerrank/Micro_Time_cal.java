import java.util.Arrays;
class Micro_Time_cal
{
	static int times=0;
	static void increseArray(int []arr){
		for(int i=0;i<arr.length;i++){
			arr[i]+=1;
		}
				times++;

		System.out.println("after "+times+" second array is "+Arrays.toString(arr));

	}
	public static void main(String[] args) {// 1234
		int []arr={2,4,5,7}; int k=10,counter=0;// 3,5,6,8 // 4,6,7,9 // 5,7,8,10
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]>=k){
					counter++;
					i++;}
			else{
				increseArray(arr);
				i=0;
				counter=0; }
			if(counter==arr.length){
				System.out.println(times);
				break;
			}
		}
			



			// for(int i=0;i<arr.length;i++)
			// {
			// 	if(arr[i]>=k){
			// 		counter++;
			// 	}
			// 	else{
			// 		increseArray(arr);
			// 		break;
			// 	}
			// }
			// if(counter==arr.length){
			// 	System.out.println(times);
			// 	break;
			// }
		
	}
}