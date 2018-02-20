import java.util.Scanner;

public class HotSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 숫자 입력 : ");
		int testcase = sc.nextInt();
		sc.nextLine();
		int total = 0;
		while (testcase-- > 0) {
			System.out.print("최대 전력량 입력 : ");
			int limit = sc.nextInt();
			sc.nextLine();
			System.out.print("전력 소요량 입력 : ");

			String line = sc.nextLine();
			String[] a = line.split(" ");

			for (int i = 0; i < a.length; i++) {
				total += Integer.parseInt(a[i]);
			}

			
			System.out.println((total<=limit)?"YES":"NO");
//			if (total <= limit) {
//				System.out.println("YES");
//				total = 0;
//
//			} else {
//				System.out.println("NO");
//				total = 0;
//
//			}
		}

	}

}
