import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
//	14
//	push 1
//	push 2
//	top
//	size
//	empty
//	pop
//	pop
//	pop
//	size
//	empty
//	pop
//	push 3
//	empty
//	top
	
	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<>();
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int N = s.nextInt();
		s.nextLine();
		for (int i = 0; i < N; i++) {
			String command = s.nextLine();
		
			String[] tok = command.split(" ");

			switch (tok[0]) {
			case "push":
				stk.push(Integer.parseInt(tok[1]));
				break;

			case "pop":
				if (stk.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(stk.pop());
					break;
				}
			case "size":
				System.out.println(stk.size());
				break;

			case "top":
				if (stk.isEmpty()) {
					System.out.println(-1);
					break;
				} else {
					System.out.println(stk.peek());
					break;
				}
			case "empty":
				if (stk.isEmpty()) {
					System.out.println(1);
					break;
				} else {
					System.out.println(0);
					break;
				}
			}

		}
	}

}
