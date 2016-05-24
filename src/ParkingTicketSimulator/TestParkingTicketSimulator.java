package ParkingTicketSimulator;

/**
 * Created by Shan Gao on 9/2/15.
 */
public class TestParkingTicketSimulator {
	ParkedCar parkedCar = new ParkedCar();
	ParkingMeter parkingMeter = new ParkingMeter();
	PoliceOfficer policeOfficer = new PoliceOfficer();

	public TestParkingTicketSimulator() {
		parkedCar.setColor("Red");
		parkedCar.setLicenseNumber("001");
		parkedCar.setMake("HONDA");
		parkedCar.setModel("A");
		parkedCar.setMinutesParked(60);

		policeOfficer.setName("Jay");
		policeOfficer.setBadgeNumber(3762805);
	}

	public void testCarInPurchasedParkingTime() {
		System.out.println("Test 1: Car In Purchased Parking Time");
		parkingMeter.setMinutesPurchased(30);
		ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
		printTicket(parkingTicket);
	}

	public void testCarJustInPurchasedParkingTime() {
		System.out.println("Test 2: Car Just In Purchased Parking Time");
		parkingMeter.setMinutesPurchased(60);
		ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
		printTicket(parkingTicket);
	}

	public void testCarOutofPurchasedParkingTime() {
		System.out.println("Test 3: Car Out Of Purchased Parking Time");
		parkingMeter.setMinutesPurchased(120);
		ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
		printTicket(parkingTicket);
	}

	public void testTicketMoreThan1Hour() {
		System.out.println("Test 4: Ticket More Than One Hour");
		parkedCar.setMinutesParked(90);
		parkingMeter.setMinutesPurchased(10);
		ParkingTicket parkingTicket = policeOfficer.issueTicket(parkedCar, parkingMeter);
		printTicket(parkingTicket);
	}

	public void printTicket(ParkingTicket parkingTicket) {
		if (parkingTicket != null)
			System.out.println("Car Color: " + parkingTicket.getColor() + "\nCar Make: " + parkingTicket.getMake()
					+ "\nCar Model: " + parkingTicket.getModel() + "\nCar License Number: "
					+ parkingTicket.getLicenseNumber() + "\nFine: " + parkingTicket.getFine()
					+ "\nPolice Officer Name: " + parkingTicket.getNameOfPoliceOfficer()
					+ "\nPolice Officer Badge Number: " + parkingTicket.getBadgeNumOfPoliceOfficer());
		else
			System.out.println("The car is legal.");
	}

	public static void main(String[] args) {
		TestParkingTicketSimulator testParkingTicketSimulator = new TestParkingTicketSimulator();
		testParkingTicketSimulator.testCarInPurchasedParkingTime();
		System.out.println("");
		testParkingTicketSimulator.testCarJustInPurchasedParkingTime();
		System.out.println("");
		testParkingTicketSimulator.testCarOutofPurchasedParkingTime();
		System.out.println("");
		testParkingTicketSimulator.testTicketMoreThan1Hour();
		System.out.println("");
	}
}
