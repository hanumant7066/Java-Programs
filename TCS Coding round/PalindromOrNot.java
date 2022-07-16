class PalindromOrNot
{
	public static void main(String[] args) {
	
		if(args.length==1)
		{
			int num=Integer.parseInt(args[0]);

		int temp=num;
		int sum=0;
		while(temp>0)
		{
			//int rem=temp%10;
			sum=(sum*10)+(temp%10);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Numbers are palindrom");
		else
			System.out.println("Numbers are not Palindrom");

		}


	}
}