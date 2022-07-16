class Closest_pali_small
{
	static int min_closest=0;
	static int max_closest=0;
	static boolean checkPali(int n){  //123
		int rev=0;
		int num=n;
		while(n>0){
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==num){
			return true;
			
		}else
			return false;
	}
	public static void main(String[] args) {
		int n=109;
		for(int i=n;i>=0;i--)
		{
			if(checkPali(i)){
				min_closest=i;
				break;
			}
		}
		int start=n;

		while(true)
		{
			if(checkPali(start)){
				max_closest=start;
				break;
			}
			start++;
		}
		int small_diff=n-min_closest;
		int large_diff=max_closest-n;
		if(small_diff<large_diff){
			System.out.println("smallest one is "+min_closest);
		}else if(small_diff==large_diff){
			System.out.println("absolute difference are equal "+min_closest+" and "+max_closest);
		}else{
			System.out.println("smallest diffrenece are "+max_closest);
		}


			
		

	}
		

}