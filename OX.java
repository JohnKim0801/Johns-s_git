import java.util.Scanner;

public class OX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		int totalSum = 0;
		while (N-- > 0) {
			String line[] = s.nextLine().split("");
			int countSum = 0, justSum = 0;
			for (int i = 0; i < line.length; i++) {

				if (line[i].equals("O")) {
					countSum++;
					justSum += countSum;
					if (i == line.length-1)
						totalSum += justSum;
				} else if (line[i].equals("X")) {
					totalSum += justSum;
					countSum = 0;
					justSum = 0;
				}
			}
			System.out.println(totalSum);
			totalSum=0;
		}

	}

}
