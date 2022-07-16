import java.util.Arrays;
class Merge_sort_two_sorted_Array
{
	public static void main(String[] args) {
		int []mat1={1,3,5,6,7,9};
		int []mat2={2,2,4,5,8};
		//o/p={1,2,2,3,4,5,5,6,7,8,9};
		int size=mat1.length+mat2.length;
		int []mat3=new int[size];

		int i=0;
		int j=0;
		int counter=0;
		for(;i<mat1.length && j<mat2.length;) // comented coe also work
		{
			if(mat1[i]<=mat2[j])
			{
				mat3[counter]=mat1[i];
				counter++;
				i++;
			}
			else{
				mat3[counter]=mat2[j];
				counter++;
				j++;
			}


		}
		// while(i<mat1.length && j<mat2.length)
		// {
		// 	if(mat1[i]<=mat2[j])
		// 	{
		// 		mat3[counter]=mat1[i];
		// 		counter++;
		// 		i++;
		// 	}
		// 	else{
		// 		mat3[counter]=mat2[j];
		// 		counter++;
		// 		j++;
		// 	}
		
		// }
		if(i==mat1.length)
		{
			while(counter<size)
			{
				mat3[counter++]=mat2[j++];
			}
		}
		else
		{
			while(counter<size)
				mat3[counter++]=mat1[i++];
		}
		System.out.println(Arrays.toString(mat3));
	}
}