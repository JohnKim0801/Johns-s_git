import java.util.Scanner;

public class Sugar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int five = N / 5, three = 0;N%=5;

		while (five >= 0) {
			if (N % 3 == 0) {
				three = N / 3;
				N %= 3;
				break;
			}
			five--;
			N+=5;
		}
		System.out.printf("%d", N == 0 ? five + three : -1);
	}

}
