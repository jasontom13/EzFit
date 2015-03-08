package bicepbuddy;

import java.io.Serializable;
import java.util.ArrayList;

import exercises.Abs.Landmine180;
import exercises.Abs.Plank;
import exercises.Abs.SpellCasters;
import exercises.Abs.WeightedCrunches;
import exercises.Back.ChinUp;
import exercises.Back.Pullups;
import exercises.Back.StraightArmPulldown;
import exercises.Back.VBarPulldown;
import exercises.Biceps.CableCurl;
import exercises.Biceps.ConcentrationCurl;
import exercises.Biceps.HammerCurl;
import exercises.Biceps.InclineDumbellCurl;
import exercises.Biceps.PreacherCurl;
import exercises.Biceps.ReverseCurl;
import exercises.Biceps.StraightBarCurl;
import exercises.Cardio.Cycle;
import exercises.Cardio.Elliptical;
import exercises.Cardio.JumpRope;
import exercises.Cardio.JumpingJacks;
import exercises.Cardio.Rowing;
import exercises.Cardio.StairClimber;
import exercises.Cardio.Treadmill;
import exercises.Chest.BarbellBenchPress;
import exercises.Chest.BarbellInclineBenchPress;
import exercises.Chest.Butterfly;
import exercises.Chest.DeclineDumbbellBenchPress;
import exercises.Chest.DipsChestVersion;
import exercises.Legs.CalfRaises;
import exercises.Legs.LegCurls;
import exercises.Legs.LegExtensions;
import exercises.Legs.Lunges;
import exercises.Legs.Squats;
import exercises.LowerBack.AtlasStones;
import exercises.LowerBack.BarbellDeadlift;
import exercises.LowerBack.RackPulls;
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
	private Boolean core; // is exercise core or auxiliary
	private Boolean liked;

	protected int easyDuration;
	protected int easyReps;
	protected int easySets;
	protected int mediumDuration;
	protected int mediumReps;
	protected int mediumSets;
	protected int hardDuration;
	protected int hardReps;
	protected int hardSets;

	public Exercise(String name, String desc, Integer sets, Integer reps,
			Boolean isDone, Integer duration, Boolean core) {
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

	public void setDifficulty(String difficulty, int goal) {
		// LOSS
		if (goal == 0) {
			if (difficulty.equals("Easy")) {
				this.sets = 3;
				this.reps = 10;
				this.duration = easyDuration;
			} else if (difficulty.equals("Medium")) {
				this.sets = 3;
				this.reps = 12;
				this.duration = mediumDuration;
			} else {
				this.sets = 3;
				this.reps = 12;
				this.duration = hardDuration;
			}
		}
		// GAINZ
		else {
			if (difficulty.equals("Easy")) {
				this.sets = 3;
				this.reps = 8;
				this.duration = easyDuration;
			} else if (difficulty.equals("Medium")) {
				this.sets = 4;
				this.reps = 6;
				this.duration = mediumDuration;
			} else {
				this.sets = 5;
				this.reps = 5;
				this.duration = hardDuration;
			}
		}

	}

	/* Make a list of exercises for each target area */

	public ArrayList<Exercise> getAbExercises() {

		ArrayList<Exercise> abList = new ArrayList<Exercise>();

		// add ...
		abList.add(new Plank(
				"Planks",
				"1. Get into a prone position on the floor, supporting"
						+ " your weight on your toes and your forearms. Your arms are bent and"
						+ " directly below the shoulder.\n2. Keep your body straight at all "
						+ "times, and hold this position as long as possible. To increase difficulty,"
						+ " an arm or leg can be raised.", 0, 0, false, 0,
				false));

		abList.add(new WeightedCrunches(
				"Weighted Crunches",
				"1. Lie flat on your back with your feet "
						+ "flat on the ground or resting on a bench with your knees bent at a 90 "
						+ "degree angle.\n2. Hold a weight to your chest, or you may hold it extended"
						+ " above your torso. This will be your starting position.\n3. Now, exhale "
						+ "and slowly begin to roll your shoulders off the floor. Your shoulders "
						+ "should come up off the floor about 4 inches while your lower back remains"
						+ " on the floor.\n4. At the top of the movement, flex your abdominals and "
						+ "hold for a brief pause.\n5. Then inhale and slowly lower yourself back "
						+ "down to the starting position.", 0, 0, false, 0,
				false));

		abList.add(new Landmine180(
				"Landmine 180s",
				"1. Position a bar into a landmine or securely "
						+ "anchor it in a corner. Load the bar to an appropriate weight.\n2. Raise "
						+ "the bar from the floor, taking it to shoulder height with both hands with"
						+ " your arms extended in front of you. Adopt a wide stance. This will be your"
						+ " starting position.\n3. Perform the movement by rotating the trunk and hips"
						+ " as you swing the weight all the way down to one side. Keep your arms "
						+ "extended throughout the exercise.\n4. Reverse the motion to swing the weight"
						+ " all the way to the opposite side.\n5. Continue alternating the movement until"
						+ " the set is complete.", 0, 0, false, 0, false));

		abList.add(new SpellCasters(
				"Spell Casters",
				"1. Hold a dumbbell in each hand with a "
						+ "pronated grip. Your feet should be wide with your hips and knees "
						+ "extended. This will be your starting position.\n2. Begin the movement"
						+ " by pulling both of the dumbbells to one side next to your hip, "
						+ "rotating your torso.\n3. Keeping your arms straight and the dumbbells"
						+ " parallel to the ground, rotate your torso to swing the weights to your"
						+ " opposite side.\n4. Continue alternating, rotating from one side to"
						+ " the other until the set is complete.", 0, 0, false,
				0, false));

		return abList;
	}

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

		// add ...
		backList.add(new ChinUp(
				"Chin Up",
				"1. Grab the pull-up bar with the palms facing your "
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
						+ "you perform this portion of the movement.", 0, 0,
				false, 0, false));

		backList.add(new Pullups(
				"Pull Ups",
				"1. Grab the pull-up bar with the palms "
						+ "facing forward using the prescribed grip. Note on grips: For a wide "
						+ "grip, your hands need to be spaced out at a distance wider than your"
						+ " shoulder width. For a medium grip, your hands need to be spaced out"
						+ " at a distance equal to your shoulder width and for a close grip at"
						+ " a distance smaller than your shoulder width.\n2. As you have both "
						+ "arms extended in front of you holding the bar at the chosen grip "
						+ "width, bring your torso back around 30 degrees or so while creating"
						+ " a curvature on your lower back and sticking your chest out. This"
						+ " is your starting position.\n3. Pull your torso up until the bar "
						+ "touches your upper chest by drawing the shoulders and the upper arms "
						+ "down and back. Exhale as you perform this portion of the movement. "
						+ "Tip: Concentrate on squeezing the back muscles once you reach the "
						+ "full contracted position. The upper torso should remain stationary"
						+ " as it moves through space and only the arms should move. The forearms"
						+ " should do no other work other than hold the bar.\n4. After a second"
						+ " on the contracted position, start to inhale and slowly lower your "
						+ "torso back to the starting position when your arms are fully extended"
						+ " and the lats are fully stretched.", 0, 0, false, 0,
				false));

		backList.add(new StraightArmPulldown(
				"Straight Arm Pull Down",
				"1. You will"
						+ " start by grabbing the wide bar from the top pulley of a pulldown"
						+ " machine and using a wider than shoulder-width pronated (palms down)"
						+ " grip. Step backwards two feet or so.\n2. Bend your torso forward at"
						+ " the waist by around 30-degrees with your arms fully extended in"
						+ " front of you and a slight bend at the elbows. If your arms are not"
						+ " fully extended then you need to step a bit more backwards until"
						+ " they are. Once your arms are fully extended and your torso is"
						+ " slightly bent at the waist, tighten the lats and then you are ready"
						+ " to begin.\n3. While keeping the arms straight, pull the bar down by"
						+ " contracting the lats until your hands are next to the side of the"
						+ " thighs. Breathe out as you perform this step.\n4. While keeping the"
						+ " arms straight, go back to the starting position while breathing"
						+ " in.", 0, 0, false, 0, false));

		backList.add(new VBarPulldown(
				"V Bar Pulldown",
				"1. Sit down on a pull-down machine"
						+ " with a V-Bar attached to the top pulley.\n2. Adjust the knee pad of the"
						+ " machine to fit your height. These pads will prevent your body from being"
						+ " raised by the resistance attached to the bar.\n3. Grab the V-bar with the"
						+ " palms facing each other (a neutral grip). Stick your chest out and lean"
						+ " yourself back slightly (around 30-degrees) in order to better engage"
						+ " the lats. This will be your starting position.\n4. Using your lats,"
						+ " pull the bar down as you squeeze your shoulder blades. Continue until"
						+ " your chest nearly touches the V-bar. Exhale as you execute this motion."
						+ " Tip: Keep the torso stationary throughout the movement.\n5. After a second"
						+ " hold on the contracted position, slowly bring the bar back to the starting"
						+ " position as you breathe in.", 0, 0, false, 0, false));

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

		chestList
				.add(new BarbellBenchPress(
						"Barbell Bench Press",
						"1. Lie back on a flat bench. Using a medium width grip (a grip that creates a "
								+ "90-degree angle in the middle of the movement between the forearms and the "
								+ "upper arms), lift the bar from the rack and hold it straight over you with "
								+ "your arms locked. This will be your starting position.\n2. From the starting "
								+ "position, breathe in and begin coming down slowly until the bar touches your "
								+ "middle chest.\n3. After a brief pause, push the bar back to the starting "
								+ "position as you breathe out. Focus on pushing the bar using your chest "
								+ "muscles. Lock your arms and squeeze your chest in the contracted position"
								+ " at the top of the motion, hold for a second and then start coming down "
								+ "slowly again. Tip: Ideally, lowering the weight should take about twice "
								+ "as long as raising it.", 0, 0, false, 0,
						false));

		chestList
				.add(new BarbellInclineBenchPress(
						"Barbell Incline Bench Press",
						"1. Lie back on an incline bench. Using a medium-width grip (a grip that "
								+ "creates a 90-degree angle in the middle of the movement between the "
								+ "forearms and the upper arms), lift the bar from the rack and hold it straight"
								+ " over you with your arms locked. This will be your starting position.\n2."
								+ " As you breathe in, come down slowly until you feel the bar on you upper "
								+ "chest.\n3. After a second pause, bring the bar back to the starting position"
								+ " as you breathe out and push the bar using your chest muscles. Lock your "
								+ "arms in the contracted position, squeeze your chest, hold for a second and "
								+ "then start coming down slowly again. Tip: it should take at least twice as "
								+ "long to go down than to come up.", 0, 0,
						false, 0, false));

		chestList
				.add(new DeclineDumbbellBenchPress(
						"Decline Dumbbell Bench Press",
						"1. Sit on the machine with your back flat on the pad."
								+ "\n2.	Take hold of the handles. Tip: Your upper arms should be positioned parallel"
								+ " to the floor; adjust the machine accordingly. This will be your starting position."
								+ "\n3.	Push the handles together slowly as you squeeze your chest in the middle. "
								+ "Breathe out during this part of the motion and hold the contraction for a second.\n"
								+ "4. Return back to the starting position slowly as you inhale until your chest "
								+ "muscles are fully stretched.", 0, 0, false,
						0, false));

		chestList
				.add(new DipsChestVersion(
						"Dips Chest Version",
						"1. Secure your legs at the end of the decline bench and lie down with a dumbbell "
								+ "on each hand on top of your thighs. The palms of your hand will be facing each"
								+ " other.\n2. Once you are laying down, move the dumbbells in front of you at "
								+ "shoulder width.\n3. Once at shoulder width, rotate your wrists forward so that"
								+ " the palms of your hands are facing away from you. This will be your starting"
								+ " position.\n4. Bring down the weights slowly to your side as you breathe out."
								+ " Keep full control of the dumbbells at all times. Tip: Throughout the motion,"
								+ " the forearms should always be perpendicular to the floor.\n5. As you breathe"
								+ " out, push the dumbbells up using your pectoral muscles. Lock your arms in the"
								+ " contracted position, squeeze your chest, hold for a second and then start"
								+ " coming down slowly. Tip: It should take at least twice as long to go down"
								+ " than to come up..", 0, 0, false, 0, false));

		return chestList;
	}

	public ArrayList<Exercise> getShoulderExercises() {

		ArrayList<Exercise> shoulderList = new ArrayList<Exercise>();

		// add ...
		shoulderList
				.add(new AlternatingDeltoidRaise(
						"Alternating Deltoid Raise",
						"1.	In a standing "
								+ "position, hold a pair of dumbbells at your side.\n2. Keeping your elbows "
								+ "slightly bent, raise the weights directly in front of you to shoulder height, "
								+ "avoiding any swinging or cheating.\n3. Return the weights to your side.\n4. "
								+ "On the next repetition, raise the weights laterally, raising them out to your "
								+ "side to about shoulder height.", 0, 0,
						false, 0, false));

		shoulderList
				.add(new ArmCircles(
						"Arm Circles",
						"1. Stand up and extend your arms straight "
								+ "out by the sides. The arms should be parallel to the floor and perpendicular "
								+ "(90-degree angle) to your torso. This will be your starting position.\n2. "
								+ "Slowly start to make circles of about 1 foot in diameter with each outstretched "
								+ "arm. Breathe normally as you perform the movement.\n3. Continue the circular "
								+ "motion of the outstretched arms for about ten seconds. Then reverse the movement, "
								+ "going the opposite direction.", 0, 0, false,
						0, false));

		shoulderList
				.add(new ArnoldDumbbellPress(
						"Arnold Dumbbell Press",
						"1.	Sit on an exercise "
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
								+ "clockwise. Breathe in as you perform this portion of the movement.",
						0, 0, false, 0, false));
		shoulderList
				.add(new BackFlyersWithBands(
						"Back Flyers w/Bands",
						"1.	Run a band around a "
								+ "stationary post like that of a squat rack.\n2. Grab the band by the handles "
								+ "and stand back so that the tension in the band rises.\n3. Extend and lift the "
								+ "arms straight in front of you. Tip: Your arms should be straight and parallel to "
								+ "the floor while perpendicular to your torso. Your feet should be firmly planted "
								+ "on the floor spread at shoulder width. This will be your starting position.\n4. "
								+ "As you exhale, move your arms to the sides and back. Keep your arms extended and "
								+ "parallel to the floor. Continue the movement until the arms are extended to your "
								+ "sides.\n5. After a pause, go back to the original position as you inhale.",
						0, 0, false, 0, false));

		return shoulderList;
	}

	public ArrayList<Exercise> getLegExercises() {

		ArrayList<Exercise> legList = new ArrayList<Exercise>();

		// add ...
		legList.add(new Squats(
				"Squats",
				"1. Stand tall with your feet hip width"
						+ " apart and your arms down by your side\n2. Start to lower your body "
						+ "back as far as you can by pushing your hips back and bending your "
						+ "knees and pushing your body weight into your heels\n3. As you are "
						+ "lowering into the squat your arms will start to raise out in front "
						+ "of you for balance\n4. Keep a neutral spine at all times and never "
						+ "let your knees go over your toes\n5. The lower body should be parallel"
						+ " with the floor and your chest should be lifted at all times not "
						+ "rounded.\n6. Pause then lift back up in a controlled movement to"
						+ " the starting position", 0, 0, false, 0, false));

		legList.add(new CalfRaises(
				"Calf Raises",
				"1. Adjust the padded lever of the calf "
						+ "raise machine to fit your height.\n2. Place your shoulders under the "
						+ "pads provided and position your toes facing forward (or using any of "
						+ "the two other positions described at the beginning of the chapter). "
						+ "The balls of your feet should be secured on top of the calf block with"
						+ " the heels extending off it. Push the lever up by extending your hips"
						+ " and knees until your torso is standing erect. The knees should be "
						+ "kept with a slight bend; never locked. Toes should be facing forward,"
						+ " outwards or inwards as described at the beginning of the chapter. "
						+ "This will be your starting position.\n3. Raise your heels as you "
						+ "breathe out by extending your ankles as high as possible and flexing"
						+ " your calf. Ensure that the knee is kept stationary at all times. "
						+ "There should be no bending at any time. Hold the contracted position"
						+ " by a second before you start to go back down.\n4. Go back slowly to"
						+ " the starting position as you breathe in by lowering your heels as you"
						+ " bend the ankles until calves are stretched.", 0, 0,
				false, 0, false));

		legList.add(new LegCurls(
				"Leg Curls",
				"1. Adjust the machine lever to fit your"
						+ " height and lie face down on the leg curl machine with the pad of the "
						+ "lever on the back of your legs (just a few inches under the calves). "
						+ "Tip: Preferably use a leg curl machine that is angled as opposed to "
						+ "flat since an angled position is more favorable for hamstrings "
						+ "recruitment.\n2. Keeping the torso flat on the bench, ensure your "
						+ "legs are fully stretched and grab the side handles of the machine. "
						+ "Position your toes straight (or you can also use any of the other "
						+ "two stances described on the foot positioning section). This will "
						+ "be your starting position.\n3. As you exhale, curl your legs up as "
						+ "far as possible without lifting the upper legs from the pad. Once "
						+ "you hit the fully contracted position, hold it for a second.\n4. "
						+ "As you inhale, bring the legs back to the initial position. Repeat"
						+ " for the recommended amount of repetitions.", 0, 0,
				false, 0, false));

		legList.add(new LegExtensions(
				"Leg Extensions",
				"1. For this exercise you will"
						+ " need to use a leg extension machine. First choose your weight and sit"
						+ " on the machine with your legs under the pad (feet pointed forward) and"
						+ " the hands holding the side bars. This will be your starting position."
						+ " Tip: You will need to adjust the pad so that it falls on top of your "
						+ "lower leg (just above your feet). Also, make sure that your legs form "
						+ "a 90-degree angle between the lower and upper leg. If the angle is less"
						+ " than 90-degrees then that means the knee is over the toes which in "
						+ "turn creates undue stress at the knee joint. If the machine is designed"
						+ " that way, either look for another machine or just make sure that when"
						+ " you start executing the exercise you stop going down once you hit the"
						+ " 90-degree angle.\n2. Using your quadriceps, extend your legs to the "
						+ "maximum as you exhale. Ensure that the rest of the body remains stationary"
						+ " on the seat. Pause a second on the contracted position.\n3. Slowly "
						+ "lower the weight back to the original position as you inhale, ensuring"
						+ " that you do not go past the 90-degree angle limit.\n4. Repeat for the"
						+ " recommended amount of times.", 0, 0, false, 0,
				false));
		
		legList.add(new Lunges("Lunges", "1. Stand with your torso upright holding two dumbbells "
				+ "in your hands by your sides. This will be your starting position.\n2. Step "
				+ "backward with your right leg around two feet or so from the left foot and "
				+ "lower your upper body down, while keeping the torso upright and maintaining"
				+ " balance. Inhale as you go down. Tip: As in the other exercises, do not allow"
				+ " your knee to go forward beyond your toes as you come down, as this will put "
				+ "undue stress on the knee joint. Make sure that you keep your front shin "
				+ "perpendicular to the ground. Keep the torso upright during the lunge; flexible "
				+ "hip flexors are important. A long lunge emphasizes the Gluteus Maximus; a "
				+ "short lunge emphasizes Quadriceps.\n3. Push up and go back to the starting "
				+ "position as you exhale. Tip: Use the ball of your feet to push in order to "
				+ "accentuate the quadriceps. To focus on the glutes, press with your heels.\n4."
				+ " Now repeat with the opposite leg.", 0, 0, false, 0,
				false));
		
		legList.add(new LegExtensions(
				"Leg Extensions",
				"1. For this exercise you will"
						+ " need to use a leg extension machine. First choose your weight and sit"
						+ " on the machine with your legs under the pad (feet pointed forward) and"
						+ " the hands holding the side bars. This will be your starting position."
						+ " Tip: You will need to adjust the pad so that it falls on top of your "
						+ "lower leg (just above your feet). Also, make sure that your legs form "
						+ "a 90-degree angle between the lower and upper leg. If the angle is less"
						+ " than 90-degrees then that means the knee is over the toes which in "
						+ "turn creates undue stress at the knee joint. If the machine is designed"
						+ " that way, either look for another machine or just make sure that when"
						+ " you start executing the exercise you stop going down once you hit the"
						+ " 90-degree angle.\n2. Using your quadriceps, extend your legs to the "
						+ "maximum as you exhale. Ensure that the rest of the body remains stationary"
						+ " on the seat. Pause a second on the contracted position.\n3. Slowly "
						+ "lower the weight back to the original position as you inhale, ensuring"
						+ " that you do not go past the 90-degree angle limit.\n4. Repeat for the"
						+ " recommended amount of times.", 0, 0, false, 0,
				false));

		return legList;
	}

	public ArrayList<Exercise> getLowerBackExercises() {

		ArrayList<Exercise> lowerBackList = new ArrayList<Exercise>();

		// add ...
		lowerBackList
				.add(new AtlasStones(
						"Atlas Stones",
						"1. Begin with the atlas stone "
								+ "between your feet. Bend at the hips to wrap your arms vertically around"
								+ " the Atlas Stone, attempting to get your fingers underneath the stone. "
								+ "Many stones will have a small flat portion on the bottom, which will make"
								+ " the stone easier to hold.\n2. Pulling the stone into your torso, drive "
								+ "through the back half of your feet to pull the stone from the ground.\n3."
								+ " As the stone passes the knees, lap it by sitting backward, pulling the "
								+ "stone on top of your thighs.\n4. Sit low, getting the stone high onto your"
								+ " chest as you change your grip to reach over the stone. Stand, driving "
								+ "through with your hips. Close distance to the loading platform, and lean"
								+ " back, extending the hips to get the stone"
								+ " as high as possible.", 0, 0, false, 0,
						false));

		lowerBackList
				.add(new BarbellDeadlift(
						"Barbell Deadlift",
						"1. Stand in front of "
								+ "a loaded barbell.\n2. While keeping the back as straight as possible,"
								+ " bend your knees, bend forward and grasp the bar using a medium "
								+ "(shoulder width) overhand grip. This will be the starting position"
								+ " of the exercise. Tip: If it is difficult to hold on to the bar with"
								+ " this grip, alternate your grip or use wrist straps.\n3. While holding"
								+ " the bar, start the lift by pushing with your legs while simultaneously"
								+ " getting your torso to the upright position as you breathe out. In the "
								+ "upright position, stick your chest out and contract the back by "
								+ "bringing the shoulder blades back. Think of how the soldiers in the "
								+ "military look when they are in standing in attention.\n4. Go back to"
								+ " the starting position by bending at the knees while simultaneously "
								+ "leaning the torso forward at the waist while keeping the back straight."
								+ " When the weights on the bar touch the floor you are back at the starting"
								+ " position and ready to perform another repetition.\n5. Perform the "
								+ "amount of repetitions prescribed in the program.",
						0, 0, false, 0, false));

		lowerBackList
				.add(new RackPulls(
						"Rack Pulls",
						"1. Set up in a power rack with"
								+ " the bar on the pins. The pins should be set to the desired point;"
								+ " just below the knees, just above, or in the mid thigh position. "
								+ "Position yourself against the bar in proper deadlifting position."
								+ " Your feet should be under your hips, your grip shoulder width, back"
								+ " arched, and hips back to engage the hamstrings. Since the weight is"
								+ " typically heavy, you may use a mixed grip, a hook grip, or use straps"
								+ " to aid in holding the weight.\n2. With your head looking forward,"
								+ " extend through the hips and knees, pulling the weight up and back"
								+ " until lockout. Be sure to pull your shoulders back as you complete"
								+ " the movement.\n3. Return the weight to the pins and"
								+ " repeat.", 0, 0, false, 0, false));

		return lowerBackList;
	}

	public ArrayList<Exercise> getTrapsExercises() {

		ArrayList<Exercise> trapsList = new ArrayList<Exercise>();

		// add .

		trapsList
				.add(new CleanShrugs(
						"Clean Shrugs",
						"1. Begin with a shoulder width, double overhand or hook grip, with the bar "
						+ "hanging at the mid thigh position. Your back should be straight and inclined "
						+ "slightly forward.\n2. Shrug your shoulders towards your ears. While this "
						+ "exercise can usually by loaded with heavier weight than a clean, avoid "
						+ "overloading to the point that the execution slows down.",0, 0, false, 0, false));
		trapsList
		.add(new CleanShrugs(
				"Clean Shrugs",
				"1. Begin with a shoulder width, double overhand or hook grip, with the bar "
				+ "hanging at the mid thigh position. Your back should be straight and inclined "
				+ "slightly forward.\n2. Shrug your shoulders towards your ears. While this "
				+ "exercise can usually by loaded with heavier weight than a clean, avoid "
				+ "overloading to the point that the execution slows down.",0, 0, false, 0, false));

		return trapsList;
	}

	public ArrayList<Exercise> getTricepExercises() {

		ArrayList<Exercise> tricepList = new ArrayList<Exercise>();

		// add ...
		tricepList
				.add(new BodyUp(
						"Body Up",
						"1. Assume a plank position on the "
								+ "ground. You should be supporting your bodyweight on your toes "
								+ "and forearms, keeping your torso straight. Your forearms should "
								+ "be shoulder-width apart. This will be your starting position."
								+ "\n2. Pressing your palms firmly into the ground, extend through "
								+ "the elbows to raise your body from the ground. Keep your torso rigid"
								+ " as you perform the movement.\n3. Slowly lower your forearms back "
								+ "to the ground by allowing the elbows to flex.",
						0, 0, false, 0, false));

		tricepList
				.add(new CableOneArmTricepExtension(
						"Cable Triceps Extension",
						"1. "
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
								+ "hold for a second in this contracted position.",
						0, 0, false, 0, false));

		tricepList
				.add(new CloseGripBarbellBenchPress(
						"Close Grip BB Bench",
						"1. "
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
								+ "to come up.", 0, 0, false, 0, false));

		tricepList
				.add(new DumbbellOneArmTricepsExtension(
						"Dumbbell Triceps Extension",
						""
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
								+ "this movement and pause when your triceps are fully stretched.",
						0, 0, false, 0, false));

		tricepList
				.add(new ParallelBarDip(
						"Parallel Bar Dip",
						"1. Stand between a set of "
								+ "parallel bars. Place a hand on each bar, and then take a small jump to "
								+ "help you get into the starting position with your arms locked out.\n2. "
								+ "Begin by flexing the elbow, lowering your body until your arms break 90 "
								+ "degrees. Avoid swinging, and maintain good posture throughout the descent."
								+ "\n3. Reverse the motion by extending the elbow, pushing yourself back up "
								+ "into the starting position.", 0, 0, false,
						0, false));

		tricepList
				.add(new SeatedTricepsPress(
						"Seated Triceps Press",
						"1. Sit down on a bench"
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
								+ " raise the dumbbell. Breathe out as you perform this step.",
						0, 0, false, 0, false));

		tricepList
				.add(new StandingBentOverOneArmDumbbellTricepsExtension(
						"Bent Over DB Triceps Extension",
						"1. With a dumbbell "
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
								+ " as you inhale.", 0, 0, false, 0, false));

		tricepList
				.add(new TricepsPushdown(
						"Triceps Pushdown",
						"1. Attach a straight or "
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
								+ " starting point. Breathe in as you perform this step.",
						0, 0, false, 0, false));
		return tricepList;
	}

	public Exercise[] getCardioExercises() {

		Exercise[] cardios = {
				new Elliptical(
						"Elliptical",
						"1. To begin, step onto the"
								+ " elliptical and select the desired option from the menu. Most "
								+ "ellipticals have a manual setting, or you can select a program to "
								+ "run. Typically, you can enter your age and weight to estimate the "
								+ "amount of calories burned during exercise. Elevation can be adjusted to"
								+ " change the intensity of the workout.\n2. The handles can be used to "
								+ "monitor your heart rate to help you stay at an appropriate intensity.",
						0, 0, false, 0, false),
					new BarbellBenchPress(
								"Barbell Bench Press",
								"1. Lie back on a flat bench. Using a medium width grip (a grip that creates a "
										+ "90-degree angle in the middle of the movement between the forearms and the "
										+ "upper arms), lift the bar from the rack and hold it straight over you with "
										+ "your arms locked. This will be your starting position.\n2. From the starting "
										+ "position, breathe in and begin coming down slowly until the bar touches your "
										+ "middle chest.\n3. After a brief pause, push the bar back to the starting "
										+ "position as you breathe out. Focus on pushing the bar using your chest "
										+ "muscles. Lock your arms and squeeze your chest in the contracted position"
										+ " at the top of the motion, hold for a second and then start coming down "
										+ "slowly again. Tip: Ideally, lowering the weight should take about twice "
										+ "as long as raising it.", 0, 0, false, 0,
								false),

				new Rowing(
						"Rowing",
						"1. To begin, seat yourself on the rower. Make "
								+ "sure that your heels are resting comfortably against the "
								+ "base of the foot pedals and that the straps are secured. "
								+ "Select the program that you wish to use, if applicable. Sit "
								+ "up straight and bend forward at the hips.\n2. There are three"
								+ " phases of movement when using a rower. The first phase is "
								+ "when you come forward on the rower. Your knees are bent and"
								+ " against your chest. Your upper body is leaning slightly "
								+ "forward while still maintaining good posture. Next, push "
								+ "against the foot pedals and extend your legs while bringing "
								+ "your hands to your upper abdominal area, squeezing your shoulders"
								+ " back as you do so. To avoid straining your back, use primarily "
								+ "your leg and hip muscles.\n3. The recovery phase simply involves "
								+ "straightening your arms, bending the knees, and bringing your body"
								+ " forward again as you transition back into the first "
								+ "phase.", 0, 0, false, 0, false),

				new Treadmill(
						"Treadmill",
						"1. To begin, step onto the treadmill and select the "
								+ "desired option from the menu. Most treadmills have a manual setting, "
								+ "or you can select a program to run. Typically, you can enter your age"
								+ " and weight to estimate the amount of calories burned during exercise."
								+ " Elevation can be adjusted to change the intensity of the workout.\n"
								+ "2. Maintain proper posture as you jog, and only "
								+ "hold onto the handles when necessary, such as when dismounting or "
								+ "checking your heart rate.", 0, 0, false, 0,
						false),

				new StairClimber(
						"StairClimber",
						"1. To begin step onto the stair climber and push start."
								+ "2. After starting up select the level and being stepping up "
								+ "the automatic moving steps."
								+ "3. To stop, press the stop button and wait for "
								+ "the steps to come to a complete stop before "
								+ "dismounting.", 0, 0, false, 0, false),

				new Cycle(
						"Cycle",
						"1. To begin, seat yourself on the bike and adjust the "
								+ "seat to your height.\n2. Select the desired option from the menu. "
								+ "You may have to start pedaling to turn it on. You can use the manual"
								+ " setting, or you can select a program to use. Typically, you can "
								+ "enter your age and weight to estimate the amount of calories burned"
								+ " during exercise. The level of resistance can be changed throughout"
								+ " the workout. The handles can be used to monitor your heart rate to"
								+ " help you stay at an appropriate intensity.",
						0, 0, false, 0, false),

				new JumpingJacks(
						"Jumping Jacks",
						"1. Begin with feet together and hands at your sides."
								+ "2. Next, jump separating your feet to a little more than "
								+ "shoulder width apart"
								+ "raising your hands fully extended above your head with spread arms."
								+ "3. Return your hands and feet to the original position and "
								+ "then repeat.", 0, 0, false, 0, false),

				new JumpRope(
						"Jump Rope",
						"1. Hold an end of the rope in each hand. "
								+ "Position the rope behind you on the ground. Raise your arms up and "
								+ "turn the rope over your head bringing it down in front of you. When"
								+ " it reaches the ground, jump over it. Find a good turning pace that"
								+ " can be maintained. Different speeds and techniques can be used to "
								+ "introduce variation.\n2. Rope jumping is exciting, challenges your "
								+ "coordination, and requires a lot of energy. A 150 lb person will burn"
								+ " about 350 calories jumping rope for 30 minutes, compared to over 450"
								+ " calories running.", 0, 0, false, 0, false) };

		return cardios;
	}

}
