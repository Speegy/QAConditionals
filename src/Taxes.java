public class Taxes {
	
	public static double findTax(double salary) {
		if(salary < 15000 && salary >= 0) {
			return .0;
		}else if(salary >= 15000 && salary < 20000) {
			return .1;
		}else if(salary < 30000 && salary >= 20000) {
			return .15;
		}else if(salary >= 30000 && salary < 45000) {
			return .20;
		}else {
			return .25;
		}
				
	}
	
	public static double taxedSalary(double salary) {
		return salary - (findTax(salary)*salary);
	}
	
}
