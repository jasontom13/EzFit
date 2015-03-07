package bicepbuddy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exer1 = new Exercise("ONE", "LIFT IT", "liftin", 200, 4000,
				60);

		Exercise exer2 = new Exercise("TWO", "LIFT IT", "liftin", 200, 4000,
				60);
		Exercise exer3 = new Exercise("THREE", "LIFT IT", "liftin", 200, 4000,
				60);
		Exercise exer4 = new Exercise("FOUR", "LIFT IT", "liftin", 200, 4000,
				60);

		Workout gottaWorkBetch = new Workout();

		gottaWorkBetch.add(exer1);
		gottaWorkBetch.add(exer2);
		gottaWorkBetch.add(exer3);
		gottaWorkBetch.add(exer4);
		gottaWorkBetch.add(exer2);
		gottaWorkBetch.add(exer3);

		for (Exercise e : gottaWorkBetch.getList())
			System.out.println(e.getName());
		
		System.out.println(gottaWorkBetch.getList().isEmpty());

	}

}
