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
		 * ���� N�� � ������ ���Ѵٸ� N�� �ش��ϴ� ���� ã�� �� ���� ��ã���ش�.
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
