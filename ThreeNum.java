import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ThreeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a[] = s.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			arr.add(Integer.parseInt(a[i]));
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		Iterator<Integer> itr = arr.iterator();
		
		System.out.println(itr.next());
	}

}
