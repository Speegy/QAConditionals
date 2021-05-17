public class FlowCharts {

	public static int addMult(int a, int b, boolean bool) {
		if(bool == false) {return MathMethods.mult(a,b);}
		else{return MathMethods.add(a,b);}
	}
	public static String flow(int a) {
		if(a > 2000) {
			System.out.println("A");
			if(a>6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if(a > 4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
			}
		}else {
			System.out.println("1");
			if(a > 100) {
				System.out.println("3");
				if(a > 600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if(a > 500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			}else {
				System.out.println("2");
			}
		}
		
		return "End";
	}
	
	
}

//Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.
//Create a method that takes a single integer A as a parameter.
//
//First evaluate if A is greater than 2000. If true, print "A", if false, print "1"
//
//Next, Directly under print 1 but not outside of the if statement, make another if statement that elaluates if A is greater that 100. If true, print "2", if false, print "3"
//
//And so on. Be sure to check you are nesting the new if statements in the correct place.