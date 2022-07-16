import java.util.HashSet;
class Distinct_count_in_window
{
	//input={1,2,1,3,4,2,3};   k=4;
	 //o/p=3,4,4,3
	// explanation: first window is {1,2,1,3} count of distinct numbers is 3;
	//              second window is {2,1,3,4} count of distinct number is 4;
	//              third window is {1,3,4,2} count of distinct number is 4;
	//              third window is {3,4,3,2} count of distinct number is 3;
	public static void main(String[] args) {
		int []arr={1,2,1,3,4,2,3};   int k=4;
		int len=arr.length;
		int counter=0;
		while(counter<=len-k){
			HashSet<Integer> set=new HashSet();
			int []a=new int[k];
			 int cnt=0;
			for(int i=counter;i<counter+k;i++){
				a[cnt]=arr[i];
				set.add(a[cnt]);
				cnt++;
			}
			
			System.out.print(set.size()+" ");
			counter++;

		}
		
	}
    
}  