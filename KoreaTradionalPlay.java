import java.util.Scanner;

public class KoreaTradionalPlay {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = 3;
		while (N-- > 0) {

			String ans[] = s.nextLine().split(" ");
			int onecount = 0;
			for (int j = 0; j < ans.length; j++) {
				if (ans[j].equals("1"))
					onecount++;
			}
			if (onecount == 0)
				System.out.println("D");
			else if (onecount == 1)
				System.out.println("C");
			else if (onecount == 2)
				System.out.println("B");
			else if (onecount == 3)
				System.out.println("A");
			else if (onecount == 4)
				System.out.println("E");

		}
	}

}
