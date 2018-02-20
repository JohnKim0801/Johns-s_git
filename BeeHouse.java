import java.util.Scanner;

public class BeeHouse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int answer = 1;
		int add = 6;
		int room = 1;

		if (N == 1)
			System.out.println(1);
		/*
		 * 만약 N이 어떤 구간에 속한다면 N에 해당하는 곳을 찾아 그 값을 되찾아준다.
		 * 
		 */

		while (true) {
			if (N <= room)
				break;
			room += add;
			add += 6;
			answer++;

		}
		System.out.println(answer);
	}

}
