import java.util.Random;
class GuessTheNumber
{
	public static void main(String[] args) {
		Random random = new Random();
		int maximum=20;
		int minimum = 10;
		int num = random.nextInt((maximum - minimum) + 1) + minimum;
		System.out.println(num);
	}
}