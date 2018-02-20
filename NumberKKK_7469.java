import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class NumberKKK_7469 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a[] = s.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int n_1 = Integer.parseInt(a[1]);
		String line[] = s.nextLine().split(" "); // 배열 숫자

		int b[] = new int[n];
		for (int i = 0; i < n; i++)
			b[i] = Integer.parseInt(line[i]);

		for (int i = 0; i < n_1; i++) {
			String qq[] = s.nextLine().split(" ");
			Q(Integer.parseInt(qq[0]), Integer.parseInt(qq[1]), Integer.parseInt(qq[2]), b);
		}

	}

	public static void Q(int a, int b, int c, int[] d) {
		int[] e = new int[b - a + 1];

	}
}
