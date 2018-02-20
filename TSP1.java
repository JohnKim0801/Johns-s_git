import java.util.Scanner;

public class TSP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a b c 라고 가정
		 * 
		 * 가는방법은
		 * a-b-c-a
		 * a-c-b-a
		 * b-a-c-b
		 * b-c-a-b
		 * c-b-a-c
		 * c-a-b-c
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase-- > 0) {
			int tec = sc.nextInt();
			if (tec < 3 && tec > 8)
				return;

		}
	}

}
