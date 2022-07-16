class Reverse_word
{
	public static void main(String[] args) {
		String str="hanumant";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			temp+=ch; 
		}
		System.out.println("Reverse word is "+temp);
		StringBuilder sb=new StringBuilder(temp);
		
		System.out.println(sb);

	}
}