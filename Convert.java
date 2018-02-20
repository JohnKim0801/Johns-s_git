import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Convert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list[] = { "kg", "lb", "l", "g" };
		Double ab[] = { 2.2046d, 0.4536d, 0.2642d, 3.7854d };
		int cnt = Integer.parseInt(br.readLine());
		int total = cnt;
		
		while (cnt-- > 0) {
			String input[] = br.readLine().split(" ");

			Double d = Double.parseDouble(input[0]);
			int i = 0;
			for (i = 0; i < list.length; i++) {
				if (input[1].equals(list[i])) {
					d *= ab[i];
					break;
				}
			}
			System.out.printf("%d %.4f %s\n", total-cnt,d,list[(i%2==0)?i+1:i-1]);
		}
	}

}
