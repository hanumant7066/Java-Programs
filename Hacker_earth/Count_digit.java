import java.util.*;
class Count_digit
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		String []arr=new String[N.length()];

		for(int i=0;i<N.length();i++)
		{
			arr[i]=String.valueOf(N.charAt(i));
		}
		System.out.println(Arrays.toString(arr));

		int odd_sum=0;
		int even_sum=0;  //  3 4 5 6 7

		for(int i=0;i<arr.length;i++)
		{
				if(i%2==0)
				{
					odd_sum+=Integer.parseInt(arr[i]);
				}
				else
					even_sum+=Integer.parseInt(arr[i]);
		}
		int result=(odd_sum>=even_sum)?odd_sum-even_sum:even_sum-odd_sum;

		System.out.println(result);





	}
}