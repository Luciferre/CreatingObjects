package ParkingTicketSimulator;

/**
 * Created by Shan Gao on 9/2/15.
 */
public class PoliceOfficer {

	private String name;

	private int badgeNumber;

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public boolean examineExpiredCar(ParkedCar parkedCar, ParkingMeter parkingMeter) {

		if (parkedCar.getMinutesParked() > parkingMeter.getMinutesPurchased())
			return true;

		return false;
	}

	public ParkingTicket issueTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {

		if (examineExpiredCar(parkedCar, parkingMeter)) {
			ParkingTicket parkingTicket = new ParkingTicket();
			parkingTicket.setBadgeNumOfPoliceOfficer(this.getBadgeNumber());
			parkingTicket.setColor(parkedCar.getColor());
			parkingTicket.setFine(parkedCar.getMinutesParked() - parkingMeter.getMinutesPurchased());
			parkingTicket.setLicenseNumber(parkedCar.getLicenseNumber());
			parkingTicket.setMake(parkedCar.getMake());
			parkingTicket.setModel(parkedCar.getModel());
			parkingTicket.setNameOfPoliceOfficer(this.getName());
			return parkingTicket;
		}
		return null;
	}
}
