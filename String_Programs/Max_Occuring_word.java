class Max_Occuring_word
{
	public static void main(String[] args) {
		String str="my name is my is is my is is same";
		String []words=str.split(" ");
		int max_count=0;
		String max_word="";
		for(int i=0;i<words.length;i++)
		{
			int count=0;
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
				}

			}
			if(count>max_count)
				{
					max_count=count;
					max_word=words[i];
				}
		}
		System.out.println("maximum occuring word is "+max_word+" and count is "+max_count);
	}
}