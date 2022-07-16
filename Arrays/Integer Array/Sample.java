class Sample
{
	public static void main(String[] args) {
	int j=0;
	while(j<10)
	{	int i;
		for(i=0;i<10;i++)
		{
			System.out.println("The value of i is "+i);
			if(i==3)
				break;
			else
			{
				i++;
			}

			
		}
		System.out.println(i);
		System.out.println(j);
		j+=1;
	}
	}
}