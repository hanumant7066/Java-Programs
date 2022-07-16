import java.util.*;
import java.math.*;

class BinaryToDecimal
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int decimal=0;
		int pow=1;

		while(num>0)
		{
			int rem=num%10;
			decimal+=(rem*pow);
			num=num/10;
			pow*=2;

		}
		System.out.println("Decimal number is "+decimal);
	}
}