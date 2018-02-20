import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int count = 0;
		int tmp = N;

		while (true) {

			int a = N / 10;
			int b = N % 10;

			if (a + b < 10)
				tmp = b * 10 + a + b;
			else
				tmp = b * 10 + (a + b) % 10;

			count++;
			
			if (tmp == N)
				break;

		}
		System.out.println(count);
	}

}
