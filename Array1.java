import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String N = s.next();
		String line[] = N.split("");

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < line.length; i++) {
			arr.add(Integer.parseInt(line[i]));
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		
		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext())
			System.out.print(itr.next());
	}

}
