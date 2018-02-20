import java.util.Scanner;

public class Fibonaci {
	static int zero = 0, one = 0;

	public static void main(String[] args) {

		/*
		 * n=0 0 1
		 * 
		 * 
d		 * n=0 1 0 n=1 0 1 n=2 1 1 n=3 1 2 n=4 2 3
		 * 
		 */
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		while (N-- > 0) {
			int t = s.nextInt();
			fibo(t);
			System.out.print(zero+" ");
			System.out.println(one);

		}
	}

	public static int fibo(int n) {

		if (n == 0) {
			zero++;
			return 0;
		} else if (n == 1) {
			one++;
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}

	}
}
