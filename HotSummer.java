import java.util.Scanner;

public class HotSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�׽�Ʈ ���� �Է� : ");
		int testcase = sc.nextInt();
		sc.nextLine();
		int total = 0;
		while (testcase-- > 0) {
			System.out.print("�ִ� ���·� �Է� : ");
			int limit = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �ҿ䷮ �Է� : ");

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
