import java.util.Scanner;

public class Olympiade1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int cnt = 0, sosuCnt = 0;
		
		for (int i = 1; i <= N; i++) {
			int num2 = s.nextInt();
			sosuCnt = 0;

			for (int j = 1; j <= num2; j++) {
				if (num2 % j == 0)
					sosuCnt++;
			}

			if (sosuCnt == 2)
				cnt++;
		}
		System.out.print(cnt);

	}
}
