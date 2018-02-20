
public class Encrypt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] encr = { 1, 2, 3 };
		int ans = 0;
		for (int i = 0; i < encr.length; i++) {
			int temp = 0;
			for (int j = 0; j < encr.length; j++) {

				temp = encr[i] * encr[j];

				ans = Math.max(temp, ans);

			}
System.out.println(ans);
		}
	}

}
