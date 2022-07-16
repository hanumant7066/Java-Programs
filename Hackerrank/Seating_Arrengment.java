import java.util.Scanner;
class Seating_Arrengment
{
	public static void main(String[] args) {
			System.out.println("Welcome to seating arrengement of train..type any seat Number"+
				"to know its type.... ");
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int next=N;
			if(N>0 || N<100){
				if(N%6==0 || N%6==1){
					System.out.println("Seat type is :Window Seat (WS)");
					if(N%6==0){
						next+=1;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
					if(N%6==1){
						next+=11;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
				}
				else if(N%6==2 || N%6==5){
					System.out.println("Seat type is :Middle Seat (MS)");
					if(N%6==2){
						next+=9;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
					if(N%6==5){
						next+=3;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
				}
				else if(N%6==3 || N%6==4){
					System.out.println("Seat type is :Upper Seat (US)");
					if(N%6==3){
						next+=7;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
					if(N%6==4){
						next+=5;
						System.out.println("Next seat no. of "+N+" is "+next);
					}
				}

			}
			else{
				System.out.println(N+" seat number not available");
			}
		}	
}
