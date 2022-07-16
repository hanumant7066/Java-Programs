import java.util.*;
public class Hackerrank_exam_question12
{
	public static void main(String[] args) 
	{
		int []arr1={5,3,1,4,6};

		int []arr2={9,8,3,15,1};// 1/3/8/9/15

		//Arrays.sort(arr2)

		long sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			int num=arr1[i];
			while(true){
				int cnt=0;
				for(int j=0;j<arr2.length;j++)
				{
					if(num==arr2[j]){
						sum+=(num-arr1[i]);
						System.out.println("sum value is "+sum);
						arr2[j]=Integer.MAX_VALUE;
						cnt++;
						break;

					}
				}
				if(cnt!=0)
					break;
				num++;

			}
		}
		System.out.println(sum);	
	}
}