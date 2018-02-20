
public class KiwiJuice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * 1.from에서 to를 읽어온다. from.length까지
		 * 
		 * 2.from에서 to로 옮긴다.
		 * 
		 * 3. from+to가 만약 to의 capacity가 초과한다면
		 * 
		 * - 뺀 나머지만큼을 from에 넣는다. - 초과하지 않으면 to에 다 옮긴다.
		 * 
		 * 4. 반복한다. from.length까지 5. 실행한 결과를 return[] 배열에 넣는다.
		 * 
		 * 
		 */
		int[] capacities = { 20, 20 };
		int[] bottles = { 5, 8 };
		int[] fromId = { 0 };
		int[] toId = { 1 };

		// int[] Returns = { 0, 13 };

		int[] Returns = thePouring(capacities, bottles, fromId, toId);
	

	}

	public static int[] thePouring(int[] capacities, int[] bot, int[] fromId, int[] toId) {

		for (int i = 0; i < fromId.length; i++) {
			int f = fromId[i];
			int t = toId[i];

			int space = capacities[t] - bot[t];

			if (space >= bot[f]) {
				int vol = bot[f];
				bot[t] += vol;
				bot[f] = 0;
			} else {
				int vol = space;
				bot[t] += vol;
				bot[f] -= vol;

			}
		}
		return bot;

	}
}
