package CoinToss;

/**
 * Created by Shan Gao on 9/2/15.
 */
public class TestSimulation {

	public static void main(String args[]) {
		Simulation simulation = new Simulation();
		for (int i = 0; i < 3; i++) {
			System.out.println("Test " + (i + 1) + ":");
			simulation.simulate();
			System.out.println("");
		}
	}
}
