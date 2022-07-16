import java.util.*;
class MobileKeyPadLetterCombination  //Work is in progress
{
	public static List<String> letterCombination(String digits)
	 {
	 	List<String> result=new ArrayList<>();
	 	if(digits==null || digits.equals("")){
	 		return result;
	 	}
		
		Map<Character,char[]> map=new HashMap<>();
		map.put('0',new char[]{});
		map.put('1',new char[]{});

		map.put('2',new char[]{'a','b','c'});
		map.put('3',new char[]{'d','e','f'});
		map.put('4',new char[]{'g','h','i'});
		map.put('5',new char[]{'j','k','l'});
		map.put('6',new char[]{'m','n','o'});
		map.put('7',new char[]{'p','q','r','s'});
		map.put('8',new char[]{'t','u','v'});
		map.put('9',new char[]{'w','x','y','z'});
		StringBuilder sb=new StringBuilder();
		letterCombinationHelper(digits,sb,map,result);

		return result;
	}
	private static void letterCombinationHelper(String digits,StringBuilder sb,Map<Character,char[]>map,List<String>result)
	{
		if(sb.length()==digits.length()){
			result.add(sb.toString());
			return;
		}
		for(char ch:map.get(digits.charAt(sb.length()))){
			sb.append(ch);
			letterCombinationHelper(digits,sb,map,result);
			sb.deleteCharAt(sb.length()-1);
		}
		

	}
	public static void main(String[] args) {
		String digits="5";
		List<String> li=letterCombination(digits);
		System.out.println(li);
	}
	

}











	// public static void main(String[] args) 
	// {
	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("enter the two number in the form if string");
	// 	String str=sc.next();
	// 	HashMap<char,char[]> map=new HashMap();

	// 	map.put('2',new char[]{'a','b','c'});
	// 	// map.put('3',new char[] {'d','e','f'});
	// 	// map.put('4',new char[] {'g','h','i'});
	// 	// map.put('5',new char[] {'j','k','l'});
	// 	// map.put('6',new char[] {'m','n','o'});
	// 	// map.put('7',new char[] {'p','q','r','s'});
	// 	// map.put('8',new char[] {'t','u','v'});
	// 	// map.put('9',new char[] {'w','x','y','z'});

	// // 	map.put("4",char[] new {'g','h','i'});
	// // 	map.put("5",char[] new {'j','k','l'});
	// // 	map.put("6",char[] new {'m','n','o'});
	// // 	map.put("7",char[] new {'p','q','r','s'});
	// // 	map.put("8",char[] new {'t','u','v'});
	// // 	map.put("9",char[] new {'w','x','y','z'});
	// // 

	// System.out.println(map);
	// }
