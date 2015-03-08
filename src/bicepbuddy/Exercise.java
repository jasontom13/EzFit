package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import exercises.Back.ChinUp;
import exercises.Biceps.CableCurl;
import exercises.Biceps.ConcentrationCurl;
import exercises.Biceps.HammerCurl;
import exercises.Biceps.InclineDumbellCurl;
import exercises.Biceps.PreacherCurl;
import exercises.Biceps.ReverseCurl;
import exercises.Biceps.StraightBarCurl;
import exercises.Chest.Butterfly;
import exercises.Legs.Squats;
import exercises.Shoulders.AlternatingDeltoidRaise;
import exercises.Shoulders.ArmCircles;
import exercises.Shoulders.ArnoldDumbbellPress;
import exercises.Shoulders.BackFlyersWithBands;
import exercises.Traps.CleanShrugs;
import exercises.Triceps.BodyUp;
import exercises.Triceps.CableOneArmTricepExtension;
import exercises.Triceps.CloseGripBarbellBenchPress;
import exercises.Triceps.DumbbellOneArmTricepsExtension;
import exercises.Triceps.ParallelBarDip;
import exercises.Triceps.SeatedTricepsPress;
import exercises.Triceps.StandingBentOverOneArmDumbbellTricepsExtension;
import exercises.Triceps.TricepsPushdown;

public abstract class Exercise implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1870576966012056821L;
	private String name;
	private String desc;
	private Integer sets;
	private Integer reps;
	private Boolean isDone;
	private Integer duration;
	private Boolean core; //is exercise core or auxiliary
	private Boolean liked;
	
	protected Integer easyDuration;
	protected Integer easyReps;
	protected Integer easySets;
	protected Integer mediumDuration;
	protected Integer mediumReps;
	protected Integer mediumSets;
	protected Integer hardDuration;
	protected Integer hardReps;
	protected Integer hardSets;

	public Exercise(String name, String desc, Integer sets, Integer reps, Boolean isDone, Integer duration, Boolean core) {
		this.name = name;
		this.desc = desc;
		this.sets = sets;
		this.reps = reps;
		this.isDone = false;
		this.duration = duration;
		this.core = core;
		this.liked = false;
	}
	
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.desc;
	}

	public Boolean getLiked() {
		return this.liked;
	}
	
	public void setLiked(Boolean liked) {
		this.liked = liked;
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
	
	public Boolean getCore() {
		return this.core;
	}
	
	public void setDifficulty(String difficulty) {
		if (difficulty.equals("Easy")) {
			this.sets = easySets;
			this.reps = easyReps;
			this.duration = easyDuration;
		} else if (difficulty.equals("Medium")) {
			this.sets = mediumSets;
			this.reps = mediumReps;
			this.duration = mediumDuration;
		} else {
			this.sets = hardSets;
			this.reps = hardReps;
			this.duration = hardDuration;
		}
	}
	
	public ArrayList<Exercise> randomize(ArrayList<Exercise> list) {
		Collections.shuffle(list); //returns void
		return list;
	}
	
	
	/* Make a list of exercises for each target area */

	public ArrayList<Exercise> getBicepExercises() {

		ArrayList<Exercise> bicepList = new ArrayList<Exercise>();

		// add ...
		bicepList
				.add(new CableCurl(
						"Cable Curl",
						"1.	Stand up with your torso upright while holding a cable curl bar that is attached to a low pulley. Grab the cable bar at shoulder width and keep the elbows close to the torso. The palm of your hands should be facing up (supinated grip). This will be your starting position. \n2.	While holding the upper arms stationary, curl the weights while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the bar is at shoulder level. Hold the contracted position for a second as you squeeze the muscle. \n3.	Slowly begin to bring the curl bar back to starting position as your breathe in.",
						0, 0, false, 0, false));
		bicepList
				.add(new ConcentrationCurl(
						"Concentration Curl",
						"Sit down on a flat bench with one dumbbell in front of you between your legs. "
								+ "Your legs should be spread with your knees bent and feet on the floor. \n2.Use your right arm to pick the dumbbell up. Place the "
								+ "back of your right upper arm on the top of your inner right thigh. Rotate the palm of your hand until it is facing forward away "
								+ "from your thigh. Tip: Your arm should be extended and the dumbbell should be above the floor. This will be your starting position. "
								+ "\n3. While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. "
								+ "Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Tip: At the top of the movement make sure "
								+ "that the little finger of your arm is higher than your thumb. This guarantees a good contraction. Hold the contracted position for a second as "
								+ "you squeeze the biceps. \n4. Slowly begin to bring the dumbbells back to starting position as your breathe in. Caution: Avoid swinging motions at any time.",
						0, 0, false, 0, false));
		bicepList
				.add(new HammerCurl(
						"Hammer Curl",
						"1.	Stand up with your torso upright and a dumbbell on each hand being held at arms length. The elbows should be close to the torso."
								+ "\n2.	The palms of the hands should be facing your torso. This will be your starting position."
								+ "\n3.	Now, while holing your upper arm stationary, exhale and curl the weight forward while contracting the biceps. Continue to raise the weight until the biceps are fully contracted and the dumbbell is at shoulder level. Hold the contracted position for a brief moment as you squeeze the biceps. Tip: Focus on keeping the elbow stationary and only moving your forearm."
								+ "\n4.	After the brief pause, inhale and slowly begin the lower the dumbbells back down to the starting position.",
						0, 0, false, 0, false));
		bicepList
				.add(new InclineDumbellCurl(
						"Incline Dumbbell Curl",
						"1.	Sit back on an incline bench with a dumbbell in each hand held at arms length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position."
								+ "\n2.	While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second."
								+ "\n3.	Slowly begin to bring the dumbbells back to starting position as your breathe in.",
						0, 0, false, 0, false));
		bicepList
				.add(new PreacherCurl(
						"Preacher Curl",
						"1.	To perform this movement you will need a preacher bench and an E-Z bar. Grab the E-Z curl bar at the close inner handle (either have someone hand you the bar which is preferable or grab the bar from the front bar rest provided by most preacher benches). The palm of your hands should be facing forward and they should be slightly tilted inwards due to the shape of the bar."
								+ "\n2.	With the upper arms positioned against the preacher bench pad and the chest against it, hold the E-Z Curl Bar at shoulder length. This will be your starting position."
								+ "\n3.	As you breathe in, slowly lower the bar until your upper arm is extended and the biceps is fully stretched."
								+ "\n4.	As you exhale, use the biceps to curl the weight up until your biceps is fully contracted and the bar is at shoulder height. Squeeze the biceps hard and hold this position for a second.",
						0, 0, false, 0, false));
		bicepList
				.add(new ReverseCurl(
						"Reverse Curl",
						"1.	Stand up with your torso upright while holding a barbell at shoulder width with the elbows close to the torso. The palm of your hands should be facing down (pronated grip). This will be your starting position."
								+ "\n2.	While holding the upper arms stationary, curl the weights while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the bar is at shoulder level. Hold the contracted position for a second as you squeeze the muscle."
								+ "\n3.	Slowly begin to bring the bar back to starting position as your breathe in.",
						0, 0, false, 0, false));
		bicepList
				.add(new StraightBarCurl(
						"StraightBarCurl",
						"1. Stand up straight while holding an EZ "
								+ "curl bar at the wide outer handle. The palms of your hands should be facing forward "
								+ "and slightly tilted inward due to the shape of the bar. Keep your elbows close to "
								+ "your torso. This will be your starting position.\n2. Now, while keeping your upper "
								+ "arms stationary, exhale and curl the weights forward while contracting the biceps. "
								+ "Focus on only moving your forearms.\n3. Continue to raise the weight until your "
								+ "biceps are fully contracted and the bar is at shoulder level. Hold the top "
								+ "contracted position for a moment and squeeze the biceps.\n4. Then inhale and slowly "
								+ "lower the bar back to the starting position.",
						0, 0, false, 0, false));

		return bicepList;
	}

	public ArrayList<Exercise> getBackExercises() {

		ArrayList<Exercise> backList = new ArrayList<Exercise>();

		backList.add(new ChinUp("Chin Up", "1. Grab the pull-up bar with the palms facing your "
				+ "torso and a grip closer than the shoulder width.\n2. As you have both arms "
				+ "extended in front of you holding the bar at the chosen grip width, keep your"
				+ " torso as straight as possible while creating a curvature on your lower back"
				+ " and sticking your chest out. This is your starting position. Tip: Keeping "
				+ "the torso as straight as possible maximizes biceps stimulation while "
				+ "minimizing back involvement.\n3. As you breathe out, pull your torso up"
				+ " until your head is around the level of the pull-up bar. Concentrate on "
				+ "using the biceps muscles in order to perform the movement. Keep the elbows"
				+ " close to your body. Tip: The upper torso should remain stationary as it "
				+ "moves through space and only the arms should move. The forearms should do"
				+ " no other work other than hold the bar.\n4. After a second of squeezing "
				+ "the biceps in the contracted position, slowly lower your torso back to "
				+ "the starting position; when your arms are fully extended. Breathe in as "
				+ "you perform this portion of the movement.", 0, 0, false, 0, false));

		return backList;
	}

	public ArrayList<Exercise> getChestExercises() {

		ArrayList<Exercise> chestList = new ArrayList<Exercise>();

		// add ...
		chestList
				.add(new Butterfly(
						"Butterfly",
						"1. Sit on the machine with your back flat on the pad."
								+ "\n2.	Take hold of the handles. Tip: Your upper arms should be positioned parallel"
								+ " to the floor; adjust the machine accordingly. This will be your starting position."
								+ "\n3.	Push the handles together slowly as you squeeze your chest in the middle. "
								+ "Breathe out during this part of the motion and hold the contraction for a second.\n"
								+ "4. Return back to the starting position slowly as you inhale until your chest "
								+ "muscles are fully stretched.", 0, 0, false,
						0, false));

		return chestList;
	}

	public ArrayList<Exercise> getShoulderExercises() {

		ArrayList<Exercise> shoulderList = new ArrayList<Exercise>();

		// add ...
		shoulderList.add(new AlternatingDeltoidRaise("AlternatingDeltoidRaise", "1.	In a standing "
				+ "position, hold a pair of dumbbells at your side.\n2. Keeping your elbows "
				+ "slightly bent, raise the weights directly in front of you to shoulder height, "
				+ "avoiding any swinging or cheating.\n3. Return the weights to your side.\n4. "
				+ "On the next repetition, raise the weights laterally, raising them out to your "
				+ "side to about shoulder height.", 0, 0, false, 0 , false));
		
		shoulderList.add(new ArmCircles("ArmCircles", "1. Stand up and extend your arms straight "
				+ "out by the sides. The arms should be parallel to the floor and perpendicular "
				+ "(90-degree angle) to your torso. This will be your starting position.\n2. "
				+ "Slowly start to make circles of about 1 foot in diameter with each outstretched "
				+ "arm. Breathe normally as you perform the movement.\n3. Continue the circular "
				+ "motion of the outstretched arms for about ten seconds. Then reverse the movement, "
				+ "going the opposite direction.", 0, 0, false, 0 , false));
		
		shoulderList.add(new ArnoldDumbbellPress("ArnoldDumbbellPress", "1.	Sit on an exercise "
				+ "bench with back support and hold two dumbbells in front of you at about upper "
				+ "chest level with your palms facing your body and your elbows bent. Tip: Your "
				+ "arms should be next to your torso. The starting position should look like the "
				+ "contracted portion of a dumbbell curl.\n2. Now to perform the movement, raise "
				+ "the dumbbells as you rotate the palms of your hands until they are facing forward."
				+ "\n3. Continue lifting the dumbbells until your arms are extended above you in "
				+ "straight arm position. Breathe out as you perform this portion of the movement.\n"
				+ "4. After a second pause at the top, begin to lower the dumbbells to the original "
				+ "position by rotating the palms of your hands towards you. Tip:The left arm will "
				+ "be rotated in a counter clockwise manner while the right one will be rotated "
				+ "clockwise. Breathe in as you perform this portion of the movement." , 0, 0, false, 0 , false));
		shoulderList.add(new BackFlyersWithBands("ArnoldDumbbellPress", "1.	Run a band around a "
				+ "stationary post like that of a squat rack.\n2. Grab the band by the handles "
				+ "and stand back so that the tension in the band rises.\n3. Extend and lift the "
				+ "arms straight in front of you. Tip: Your arms should be straight and parallel to "
				+ "the floor while perpendicular to your torso. Your feet should be firmly planted "
				+ "on the floor spread at shoulder width. This will be your starting position.\n4. "
				+ "As you exhale, move your arms to the sides and back. Keep your arms extended and "
				+ "parallel to the floor. Continue the movement until the arms are extended to your "
				+ "sides.\n5. After a pause, go back to the original position as you inhale.", 0, 0, false, 0 , false));

		return shoulderList;
	}

	public ArrayList<Exercise> getLegExercises() {

		ArrayList<Exercise> legList = new ArrayList<Exercise>();

		// add ...
		legList.add(new CleanShrugs("Squats", "1. Place feet a little wider than shoulder-width "
				+ "apart, hips stacked over knees, knees over ankles.\n2. Roll the shoulders "
				+ "back and down away from the ears. Note: Allowing the back to round (like "
				+ "a turtle’s shell) will cause unnecessary stress on the lower back.\n3. "
				+ "Extend the arms out straight so they are parallel with the ground, palms "
				+ "facing down (like your hands are on someone’s shoulders at a 7th grade "
				+ "dance). Or, if it’s more comfortable, pull the elbows close to the body, "
				+ "palms facing each other and thumbs pointing up.\n4. Initiate movement by "
				+ "inhaling into the belly, and unlocking the hips, slightly bringing them back. "
				+ "Keep sending hips backward as the knees begin to bend.\n5. While the butt "
				+ "starts to stick out, make sure the chest and shoulders stay upright, and the "
				+ "back stays straight.\n6. Keep the head facing forward with eyes straight ahead "
				+ "for a neutral spine.\n7. Let the hip joint squat lower to the ground than the "
				+ "knees, if comfortable. Pro tip: Try squatting onto a box. Gentle tapping it "
				+ "with the butt will be a reminder to squat low.\n8. Engage the core, and "
				+ "exhale while driving through the heels to return to standing. Imagine the "
				+ "feet are spreading the floor (the left foot to the left, right foot to the "
				+ "right) without actually moving the feet.", 0, 0, false, 0 , false));

		return legList;
	}

	public ArrayList<Exercise> getLowerBackExercises() {

		ArrayList<Exercise> lowerBackList = new ArrayList<Exercise>();

		// add ...
		lowerBackList.add(new CleanShrugs("Clean Shrugs", "1. Begin with a shoulder width, double "
				+ "overhand or hook grip, with the bar hanging at the mid thigh position."
				+ " Your back should be straight and inclined slightly forward.\n2. "
				+ "Shrug your shoulders towards your ears. While this exercise can usually"
				+ " by loaded with heavier weight than a clean, avoid overloading to the "
				+ "point that the execution slows down.", 0, 0, false, 0 , false));

		return lowerBackList;
	}

	public ArrayList<Exercise> getTrapsExercises() {

		ArrayList<Exercise> trapsList = new ArrayList<Exercise>();

		// add ..
		trapsList.add(new Squats("Squats", "1. Stand tall with your feet hip width"
				+ " apart and your arms down by your side\n2. Start to lower your body "
				+ "back as far as you can by pushing your hips back and bending your "
				+ "knees and pushing your body weight into your heels\n3. As you are "
				+ "lowering into the squat your arms will start to raise out in front "
				+ "of you for balance\n4. Keep a neutral spine at all times and never "
				+ "let your knees go over your toes\n5. The lower body should be parallel"
				+ " with the floor and your chest should be lifted at all times not "
				+ "rounded.\n6. Pause then lift back up in a controlled movement to"
				+ " the starting position", 0, 0, false, 0 , false));
		
		return trapsList;
	}

	public ArrayList<Exercise> getTricepExercises() {

		ArrayList<Exercise> tricepList = new ArrayList<Exercise>();

		// add ...
		tricepList.add(new BodyUp("Body Up", "1. Assume a plank position on the "
				+ "ground. You should be supporting your bodyweight on your toes "
				+ "and forearms, keeping your torso straight. Your forearms should "
				+ "be shoulder-width apart. This will be your starting position."
				+ "\n2. Pressing your palms firmly into the ground, extend through "
				+ "the elbows to raise your body from the ground. Keep your torso rigid"
				+ " as you perform the movement.\n3. Slowly lower your forearms back "
				+ "to the ground by allowing the elbows to flex.", 0, 0, false, 0 , false));
		
		tricepList.add(new CableOneArmTricepExtension("CableOneArmTricepsExtension", "1. "
				+ "With your hand, grasp handle attached to the high-cable pulley using "
				+ "a palms facing up grip. You should be standing directly in front of "
				+ "the weight stack.\n2. Now pull the handle down so that your upper arm "
				+ "and elbow are locked in to the side of your body. Your upper arm and "
				+ "forearm should form an acute angle. You can keep the other arm by the "
				+ "waist and you can have one leg in front of you and the other one back"
				+ " for better balance. This will be your starting position.\n3. As you "
				+ "contract the triceps, move the single handle attachment, while breathing"
				+ " out, down to your side until your arm is straight. Breathe out as you"
				+ " perform this movement. Tip: Only the forearms should move. Your upper "
				+ "arms should remain stationary at all times.\n4. Squeeze the triceps and "
				+ "hold for a second in this contracted position.", 0, 0, false, 0 , false));
		
		tricepList.add(new CloseGripBarbellBenchPress("Close Grip Barbell Bench Press", "1. "
				+ "Lie back on a flat bench. Using a close grip (around shoulder width), "
				+ "lift the bar from the rack and hold it straight over you with your arms "
				+ "locked. This will be your starting position.\n2. As you breathe in, come "
				+ "down slowly until you feel the bar on your middle chest. Tip: Make sure "
				+ "that - as opposed to a regular bench press - you keep the elbows close to "
				+ "the torso at all times in order to maximize triceps involvement.\n3. After"
				+ " a second pause, bring the bar back to the starting position as you breathe "
				+ "out and push the bar using your triceps muscles. Lock your arms in the "
				+ "contracted position, hold for a second and then start coming down slowly "
				+ "again. Tip: It should take at least twice as long to go down than "
				+ "to come up.", 0, 0, false, 0 , false));
		
		tricepList.add(new DumbbellOneArmTricepsExtension("Dumbbell One Arm Triceps Extension", ""
				+ "1. Grab a dumbbell and either sit on a military press bench or a utility "
				+ "bench that has a back support on it as you place the dumbbells upright on "
				+ "top of your thighs or stand up straight.\n2. Clean the dumbbell up to "
				+ "bring it to shoulder height and then extend the arm over your head so "
				+ "that the whole arm is perpendicular to the floor and next to your head. "
				+ "The dumbbell should be on top of you. The other hand can be kept fully "
				+ "extended to the side, by the waist, supporting the upper arm that has the "
				+ "dumbbell or grabbing a fixed surface.\n3. Rotate the wrist so that the "
				+ "palm of your hand is facing forward and the pinkie is facing the ceiling. "
				+ "This will be your starting position.\n4. Slowly lower the dumbbell behind "
				+ "your head as you hold the upper arm stationary. Inhale as you perform "
				+ "this movement and pause when your triceps are fully stretched.", 0, 0, false, 0 , false));
		
		tricepList.add(new ParallelBarDip("Parallel Bar Dip", "1. Stand between a set of "
				+ "parallel bars. Place a hand on each bar, and then take a small jump to "
				+ "help you get into the starting position with your arms locked out.\n2. "
				+ "Begin by flexing the elbow, lowering your body until your arms break 90 "
				+ "degrees. Avoid swinging, and maintain good posture throughout the descent."
				+ "\n3. Reverse the motion by extending the elbow, pushing yourself back up "
				+ "into the starting position.", 0, 0, false, 0 , false));
		
		tricepList.add(new SeatedTricepsPress("Seated Triceps Press", "1. Sit down on a bench"
				+ " with back support and grasp a dumbbell with both hands and hold it overhead"
				+ " at arm's length. Tip: a better way is to have somebody hand it to you "
				+ "especially if it is very heavy. The resistance should be resting in the "
				+ "palms of your hands with your thumbs around it. The palm of the hand should "
				+ "be facing inward. This will be your starting position.\n2. Keeping your "
				+ "upper arms close to your head (elbows in) and perpendicular to the floor,"
				+ " lower the resistance in a semi-circular motion behind your head until "
				+ "your forearms touch your biceps. Tip: The upper arms should remain "
				+ "stationary and only the forearms should move. Breathe in as you perform"
				+ " this step.\n3. Go back to the starting position by using the triceps to"
				+ " raise the dumbbell. Breathe out as you perform this step.", 0, 0, false, 0 , false));
		
		tricepList.add(new StandingBentOverOneArmDumbbellTricepsExtension("Standing "
				+ "Bent Over One Arm Dumbbell Triceps Extension", "1. With a dumbbell "
						+ "in one hand and the palm facing your torso, bend your knees"
						+ " slightly and bring your torso forward, by bending at the "
						+ "waist, while keeping the back straight until it is almost "
						+ "parallel to the floor. Make sure that you keep the head up."
						+ "\n2. The upper arm should be close to the torso and parallel"
						+ " to the floor while the forearm is pointing towards the floor"
						+ " as the hand holds the weight. Tip: There should be a 90-degree"
						+ " angle between the forearm and the upper arm. This is your starting"
						+ " position.\n3. Keeping the upper arms stationary, use the triceps"
						+ " to lift the weights as you exhale until the forearms are parallel"
						+ " to the floor and the whole arm is extended. Like many other arm "
						+ "exercises, only the forearm moves.\n4. After a second contraction"
						+ " at the top, slowly lower the dumbbell back to the starting position"
						+ " as you inhale.", 0, 0, false, 0 , false));
		
		tricepList.add(new TricepsPushdown("Triceps Pushdown", "1. Attach a straight or "
				+ "angled bar to a high pulley and grab with an overhand grip (palms facing "
				+ "down) at shoulder width.\n2. Standing upright with the torso straight "
				+ "and a very small inclination forward, bring the upper arms close to your"
				+ " body and perpendicular to the floor. The forearms should be pointing up"
				+ " towards the pulley as they hold the bar. This is your starting position."
				+ "\n3. Using the triceps, bring the bar down until it touches the front of "
				+ "your thighs and the arms are fully extended perpendicular to the floor. "
				+ "The upper arms should always remain stationary next to your torso and only"
				+ " the forearms should move. Exhale as you perform this movement.\n4. After"
				+ " a second hold at the contracted position, bring the bar slowly up to the"
				+ " starting point. Breathe in as you perform this step.", 0, 0, false, 0 , false));

		return tricepList;
	}
}
