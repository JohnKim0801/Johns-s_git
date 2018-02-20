import java.util.Scanner;

public class Back1011 {

	public static void main(String[] args) {
		/*
		 * 1.x,y의 값을 받는다. 2. x,y의 거리를 구한다.
		 * 
		 * 3.0 ,1,2,3... 4. 마지막 y-1
		 * 
		 * 5.y-1+x+1 내에서 이동한 거리의 합이 0이 되어야 한다.
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
//		int y = s.nextInt();
		int sum = 0;

		int count = 0; // 이동한 수
		for (int i = 0; i < 50; i++) {
			sum += i;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
