import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class K11004 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line[] = br.readLine().split(" ");
		String line2[] = br.readLine().split(" ");
		int a[] = new int[line2.length];
		for (int i = 0; i < line2.length; i++) {
			a[i] = Integer.parseInt(line2[i]);
		}
		Arrays.sort(a);
		System.out.println(a[Integer.parseInt(line[1]) - 1]);

	}

}
