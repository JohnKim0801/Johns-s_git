import java.util.Scanner;

public class MakingX1094 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int B, count = 0;
		while (N > 0) {
			B = N % 2;
			if (B == 1)
				count += 1;
			N = N / 2;
		}
		System.out.println(count);
	}

}
