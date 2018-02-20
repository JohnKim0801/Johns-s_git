import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = 4;
		int current = 0;
		int max;

		String one[] = s.nextLine().split(" ");
		String two[] = s.nextLine().split(" ");
		String three[] = s.nextLine().split(" ");
		String four[] = s.nextLine().split(" ");

		current = Integer.parseInt(one[1]) - Integer.parseInt(one[0]);

		max = current;
		current = current + Integer.parseInt(two[1]) - Integer.parseInt(two[0]);

		max = Math.max(max, current);

		current = current + Integer.parseInt(three[1]) - Integer.parseInt(three[0]);

		max = Math.max(max, current);
		current = current + Integer.parseInt(four[1]) - Integer.parseInt(four[0]);

		max = Math.max(max, current);
		
		System.out.println(max);
	}

}
