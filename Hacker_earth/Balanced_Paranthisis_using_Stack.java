import java.util.*;
class Balanced_Paranthisis_using_Stack
{
	public static void main(String[] args) {
		String str="{[([]]}";

		char []ch=new char[str.length()];

		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		Stack<Character> st=new Stack<Character>();
		st.push(ch[0]);

		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]=='[' || ch[i]=='(' || ch[i]=='{')
			{
				st.push(ch[i]);
			}
			else
			{
				if(ch[i]==')'){
					if(st.pop()!='('){
						System.out.println("Not balanced");
						return;
					}
				}

				if(ch[i]==']'){
					if(st.pop()!='['){
						System.out.println("Not balanced");
						return;
					}
				}
				if(ch[i]=='}'){
					if(st.pop()!='{'){
						System.out.println("Not balanced");
						return;
					}
				}
			}
		}
		System.out.println("paranthisis is balanced");
	}
}