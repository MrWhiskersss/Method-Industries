public class MethodIndustries {
	public static void main(String [] args) {
		if (args.length != 3) {
			System.out.println("usage is: command number1 number2 number3");
			return;
		}
		int num1, num2, num3;

		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			num3 = Integer.parseInt(args[2]);
		} catch(Exception e) {
			System.out.println("command line arguments must be numbers");
			return;
		}
		System.out.println(mathFunction(num1, num2, num3));
	}

	public static String mathFunction(int numA, int numB, int numC) {
		String done = "";

		if (numA + numB == numC)
			done = done + "+";

		if (numA - numB == numC)
			done = done + "-";

		if (numA * numB == numC)
			done = done + "*";

		try {
			if (numA / numB == numC)
				done = done + "/";
		} catch(Exception e) {
			//division by zero
		}

		if (done.length() == 0)
			done = "None";

		return done;
	}
}

//Ethan Hammons
