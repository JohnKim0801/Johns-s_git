
public class KiwiJuice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * 1.from���� to�� �о�´�. from.length����
		 * 
		 * 2.from���� to�� �ű��.
		 * 
		 * 3. from+to�� ���� to�� capacity�� �ʰ��Ѵٸ�
		 * 
		 * - �� ��������ŭ�� from�� �ִ´�. - �ʰ����� ������ to�� �� �ű��.
		 * 
		 * 4. �ݺ��Ѵ�. from.length���� 5. ������ ����� return[] �迭�� �ִ´�.
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
