import java.util.Scanner;

public class Back1011 {

	public static void main(String[] args) {
		/*
		 * 1.x,y�� ���� �޴´�. 2. x,y�� �Ÿ��� ���Ѵ�.
		 * 
		 * 3.0 ,1,2,3... 4. ������ y-1
		 * 
		 * 5.y-1+x+1 ������ �̵��� �Ÿ��� ���� 0�� �Ǿ�� �Ѵ�.
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
//		int y = s.nextInt();
		int sum = 0;

		int count = 0; // �̵��� ��
		for (int i = 0; i < 50; i++) {
			sum += i;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
