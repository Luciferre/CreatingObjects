package ParkingTicketSimulator;

/**
 * Created by Shan Gao on 9/2/15.
 */
public class ParkedCar {

	private String make;

	private String model;

	private String color;

	private String licenseNumber;

	private int minutesParked;

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

	public int getMinutesParked() {
		return minutesParked;
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

	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}

}
