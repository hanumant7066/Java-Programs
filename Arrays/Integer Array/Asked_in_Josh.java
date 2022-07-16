import java.util.*;
class Asked_in_Josh
{
	static int distinct=0;

	static void checkDistinct(int num){
		HashSet set=new HashSet();
		while(num>0){
			int rem=num%10;
			set.add(rem);
			num=num/10;
		}
		if(set.size()<3){
			distinct++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			checkDistinct(i);
		}
		System.out.println("allowed seats are : "+distinct);
	}
	//Anthor method;


	
}
