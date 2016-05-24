package CoinToss;

import java.util.Random;

/**
 * Created by Shan Gao on 9/2/15.
 */

public class Simulation {

	public class Coin {
		private String sideUp;

		public Coin() {
			Random random = new Random();
			int index = random.nextInt(2);

			if (index == 0)
				sideUp = "heads";
			else if (index == 1)
				sideUp = "tails";
		}

		public void toss() {
			Random random = new Random();
			int index = random.nextInt(2);

			if (index == 0)
				sideUp = "heads";
			else if (index == 1)
				sideUp = "tails";
		}

		public String getSideUp() {
			return this.sideUp;
		}

	}

	public void simulate() {
		int headsCount = 0;
		int tailsCount = 0;
		Coin coin = new Coin();

		for (int i = 0; i < 20; i++) {
			coin.toss();
			System.out.println(coin.getSideUp());
			if (coin.getSideUp() == "heads")
				headsCount++;
			else
				tailsCount++;
		}

		System.out.println("Number of times heads is facing up: " + headsCount);
		System.out.println("Number of times tails is facing up: " + tailsCount);

	}
}
