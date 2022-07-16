import java.util.ArrayList;
class Longest_Incresing_Subsequence
{
	// i/p= {10,22,9,33,21,50,41,60,80};
	// o/p= {10,22,33,50,60,80}, count=6;
	// 
	public static void main(String[] args) {
		int []arr={10,22,9,33,21,50,41,60,80};
		int max_int=arr[0];
		ArrayList list=new ArrayList();
		list.add(arr[0]);

		for(int i=1;i<arr.length;i++){
			if(max_int < arr[i]){
				max_int=arr[i];
				list.add(max_int);
			}
		}
		System.out.println("count is "+list.size());
		System.out.println("list is "+list);


	}
}