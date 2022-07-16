class Year_month_print
{
	public static void main(String[] args) {
		String str="2020-01-08";
		//  o/p must be "09-september-2020";
		String year="";
		for(int i=0;i<4;i++){
			char ch=str.charAt(i);
			year+=ch;
		}
		String month="";
		for(int i=5;i<7;i++){
			char ch=str.charAt(i);
			month+=ch;
		}
		String date="";
		for(int i=8;i<str.length();i++){
			char ch=str.charAt(i);
			date+=ch;
		} 
		

		switch(month)
		{
			case "01":
				System.out.println(year+"-January-"+date);
				break;
			case "02":
				System.out.println(year+"-February-"+date);
				break;
			case "03":
				System.out.println(year+"-march-"+date);
				break;
			case "05":
				System.out.println(year+"-may-"+date);
				break;
			case "06":
				System.out.println(year+"-june-"+date);
				break;
			case "07":
				System.out.println(year+"-jully-"+date);
				break;
			case "08":
				System.out.println(year+"-auguest-"+date);
				break;
			case "09":
				System.out.println(year+"-september-"+date);
				break;
			case "10":
				System.out.println(year+"-octomber-"+date);
				break;
			case "11":
				System.out.println(year+"-November-"+date);
				break;
			case "12":
				System.out.println(year+"-december-"+date);
				break;
			case "04":
				System.out.println(year+"-april-"+date);
				break;
			default:
				System.out.println("Invlid month endtered");
			
		}
	}
}