import java.util.HashSet;
class Duplicate_between_two_array
{
		public static void main(String[] args) {
		int []arr1={2,4,6,8,10,6,8,12};
		int []arr2={3,4,5,7,8,6};
		HashSet<Integer> set=new HashSet<Integer>();

		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(set.add(arr1[i])==false)
					{
						break;
					}
					System.out.println(arr1[i]);
					set.add(arr1[i]);
					break;
				}
			}
		}
	}
}