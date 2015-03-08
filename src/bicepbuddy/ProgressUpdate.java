package bicepbuddy;


public class ProgressUpdate {
	private double weight;
	private int day;
	
	public ProgressUpdate(double newWeight, int day) {
		weight = newWeight;
		this.day = day;
	}
	
	public ProgressUpdate getProgressItem() {
		return this;
	}
}
