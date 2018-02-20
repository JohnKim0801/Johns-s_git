import java.util.Scanner;

public class Back2577Num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();

		String a = A * B * C + "";
		String b[] = a.split("");
		String c[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[j].equals(c[i]))
					count++;
			}
			System.out.println(i+"ดย"+count+"น๘");
		}
	}

}
