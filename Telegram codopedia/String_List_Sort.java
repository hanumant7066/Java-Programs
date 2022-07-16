import java.util.*;
class String_List_Sort
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("bca");
		list.add("cba");
		list.add("aaa");

		list.sort();
		System.out.println(list);
	}
}