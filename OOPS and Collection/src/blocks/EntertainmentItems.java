package blocks;

public class EntertainmentItems implements ElectronicItems {
	int size;
	int weight;
	String colour;

	public void runsOn(String Electricity) {
		System.out.println("Runs on  Electricity");
	}
	public void runsOn(String Electricity,String Battery) {
		System.out.println("runs on electricity or battery");
		
	}
	@Override
	public void directionOfRotation() {
		}
	@Override
	public void audioOrVideo() {
		}
}

class TV extends EntertainmentItems {
	private int NoOfCopmponents;
	private void functionality() {
		System.out.println("Works on digital signals");
	}
	public void getfunctionalty() {
		functionality();
	}
	
	public int getNoOfCopmponents() {
		return NoOfCopmponents;
	}

	public void setNoOfCopmponents(int noOfCopmponents) {
		NoOfCopmponents = noOfCopmponents;
	}

	public void audioOrVideo() {
		System.out.println("Both Audio and Video supported");
	}
}

class MP3Player extends EntertainmentItems {
	public void audioOrVideo() {
		System.out.println("Only Audio supported");
	}

}

