package blocks;

public class UsabilityItems implements ElectronicItems {
	int weight;
	String colour;

	public void runsOn(String Electricity) {
		System.out.println("Runs on  Electricity");
	}

	public void runsOn(String Electricity, String Battery) {
		System.out.println("runs on electricity or battery");

	}

	@Override
	public void directionOfRotation() {
	}

	@Override
	public void audioOrVideo() {
	}

}

class Mixer extends UsabilityItems {

	public void directionOfRotation() {
		System.out.println("Rotates only Clockwise");
	}

}

class WashingMachine extends UsabilityItems {
	private int noOfComponents;

	private void functionality() {
		System.out.println("Works on programmed software");
	}

	public void getfunctionality() {
		functionality();
	}

	public int getNoOfComponents() {
		return noOfComponents;
	}

	public void setNoOfComponents(int noOfComponents) {
		this.noOfComponents = noOfComponents;
	}

	public void directionOfRotation() {
		System.out.println("Rotates both Clockwise and AntiClockwise");
	}

}