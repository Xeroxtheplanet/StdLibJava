package practicePackage._03_classesObjects.attempts;

public class CarTrip {
	public double distance, time; //in kms and hours respectively
	
	


	/**
	 * May be helpful for other methods
	 * 
	 * @param d: value meant for distance
	 * @param t: value meant for time
	 * 
	 * assign the higher of 0 and d into distance
	 * assign the higher of 0 and t into time
	 */
	public CarTrip(double d, double t) {
		if (d <this.distance) {
			this.distance=0;
		}
		else {
		this.distance = d;
		}
		if (t <this.time) {
			this.time=0;
		}
		else {
		this.time = t;
		}
	}

	/**
	 * return details in the format "distance kms travelled in time hours"
	 * For example, if distance = 2.5, time = 1.2, return "2.5 kms travelled in 1.2 hours" 
	 */
	public String toString() {
		
		return this.distance+" kms travelled in "+this.time+" hours"; //to be completed
	}
}