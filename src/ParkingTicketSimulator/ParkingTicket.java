package ParkingTicketSimulator;

/**
 * Created by Shan Gao on 9/2/15.
 */

public class ParkingTicket {

	private String make;

	private String model;

	private String color;

	private String licenseNumber;

	private int fine;

	private String nameOfPoliceOfficer;

	private int badgeNumOfPoliceOfficer;

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public int getFine() {
		return fine;
	}

	public String getNameOfPoliceOfficer() {
		return nameOfPoliceOfficer;
	}

	public int getBadgeNumOfPoliceOfficer() {
		return badgeNumOfPoliceOfficer;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public void setFine(int minutesExpired) {
		this.fine = 25;
		minutesExpired -= 60;

		while (minutesExpired > 0) {
			this.fine += 10;
			minutesExpired -= 60;
		}
	}

	public void setNameOfPoliceOfficer(String nameOfPoliceOfficer) {
		this.nameOfPoliceOfficer = nameOfPoliceOfficer;
	}

	public void setBadgeNumOfPoliceOfficer(int badgeNumOfPoliceOfficer) {
		this.badgeNumOfPoliceOfficer = badgeNumOfPoliceOfficer;
	}
}
