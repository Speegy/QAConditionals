public class Results {
	public static double physics = 120;
	public static double chemistry = 124;
	public static double biology = 80;
	public static int total = 450;
	public static double perc = (physics + chemistry + biology)/4.5;
	
	public static boolean gradeCheck() {
		if(perc < 60 || physics/1.5 < 60 || chemistry/1.5 < 60 || biology/1.5 < 60) {
			System.out.println("Fail");
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
