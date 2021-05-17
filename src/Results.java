public class Results {
	public static double physics = 120;
	public static double chemistry = 84;
	public static double biology = 80;
	public static int total = 450;
	public static double perc = (physics + chemistry + biology)/4.5;
	
	public static boolean gradeCheck() {
		if(physics/1.5 < 60 || chemistry/1.5 < 60 || biology/1.5 < 60) {
			int count = 0;
			if(physics/1.5 < 60) {count+=1;}
			if(chemistry/1.5 < 60) {count+=1;}
			if(biology/1.5 < 60) {count+=1;}
			if(count == 1) {System.out.println("You failed: " + count + " course.");}
			else {System.out.println("You failed: " + count + " courses.");}
			return false;
		}else {
			System.out.println("Pass");
			return true;
		}
	}

	public static void display() {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		
		System.out.println("Total: " + (physics+chemistry+biology)+"/"+total);
	}
	
	public static boolean percentage() {
		System.out.println("Percentage: " + perc);
		return true;
	}
}
