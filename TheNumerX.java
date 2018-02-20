import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TheNumerX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.print("입력해라");
		String a[] = s.nextLine().split(" ");
		int b[] = new int[Integer.parseInt(a[0])-1];
		ArrayList<Integer> ar = new ArrayList<>();
		String line[]= s.nextLine().split(" ");
		
		for (int i = 0; i < b.length; i++) {
			if (Integer.parseInt(a[1]) > Integer.parseInt(line[i]))
				ar.add(Integer.parseInt(line[i]));
		}
		Iterator<Integer> itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
