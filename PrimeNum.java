import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int startNum = s.nextInt();
		int endNum = s.nextInt();
		int primeSum = 0; // 소수들의 합 저장

		int miniNum = 0;// 최솟값 저장
		int current = startNum;
		while (current <= endNum) {
			int count = 0; // 다시 0으로 초기화

			for (int i = 1; i <= current; i++) {

				int remainder = current % i;

				if (remainder == 0)
					count++;

			} // for
			if (count == 2) {
				if (primeSum == 0) {
					miniNum = current;
				}
				primeSum += current;
			}
			current++;
		}
		if (primeSum == 0)
			System.out.println(-1);
		else {
			System.out.println(primeSum);
			System.out.println(miniNum);
		}
	}
}
