import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Meeting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] s, int[] e) {
				if (s[1] == e[1])
					return Integer.compare(s[0], e[0]);
				else
					return Integer.compare(s[1], e[1]);
			}
		});
		int count = 0;
		int end = -1;

		for (int i = 0; i < N; i++) {
			if (arr[i][0] >= end) {
				end = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
