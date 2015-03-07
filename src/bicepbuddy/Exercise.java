package bicepbuddy;

public class Exercise {
	private String name;
	private String desc;
	private String type; //anaerobic/aerobic
	private Integer sets;
	private Integer reps;
	private Boolean isDone;
	private Integer duration;
	public Boolean core; //is exercise core or auxiliary

	public Exercise(String name, String desc, String type, Integer sets,
			Integer reps, Integer duration) {
		this.name = name;
		this.desc = desc;
		this.type = type;
		this.setSets(sets);
		this.setReps(reps);
		this.isDone = false;
		this.setDuration(duration);
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.desc;
	}

	public String type() {
		return this.type;
	}

	public Boolean getDone() {
		return this.isDone;
	}

	public void setDone(Boolean status) {
		this.isDone = status;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getSets() {
		return sets;
	}

	public void setSets(Integer sets) {
		this.sets = sets;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}
}
