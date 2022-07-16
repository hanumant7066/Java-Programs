import java.util.*;
public class Amazone_asked // longest no. of zeros or 1ns in array
{
	public static void main(String[] args) {
		int []arr={0,0,1,1,1,1,0,0,0};
		int n=arr.length;
		int largest=1;
		int counter=0;
		Stack<Integer> stack=new Stack<Integer>();
		while(counter<n)
		{
			while(counter<n && arr[counter]==0){
				stack.push(arr[counter]);
				counter++;
			}
			if(stack.size()>largest)
				largest=stack.size();
			stack.clear();
			while(counter<n && arr[counter]==1){
				stack.push(arr[counter]);
				counter++;
			}
			if(stack.size()>largest)
				largest=stack.size();
			stack.clear();
		}
		System.out.println(largest);
	}
}