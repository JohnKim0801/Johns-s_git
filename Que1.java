import java.util.ArrayDeque;
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> que = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		s.nextLine();
		while (N-- > 0) {

			String line = s.nextLine();
			String[] command = line.split(" ");

			switch (command[0]) {
			case "push":
				que.add(Integer.parseInt(command[1]));
				break;

			case "pop":
				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(que.poll());
					break;
				}
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(0);
					break;
				}

			case "front":
				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(que.peekFirst());
					break;
				}
			case "back":
				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(que.peekLast());
					break;
				}
			}

		}
	}
}
