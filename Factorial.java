

package factorial;

public class Factorial {
	
	private static int num = 10;

	public static void main(String[] args) {


		// if(num == 0) {
		// 	System.out.println(1);
		// 	return;
		// } else {

		// 	int multiplier = 1;
		// 	int factorial = 1;

		// 	while(num != multiplier) {
		// 		factorial = factorial * multiplier;
		// 		multiplier ++;
		// 	}

		// 	System.out.println(num + " factorial = " + factorial);
		// }

		int result = recursiveFunction(num);

		System.out.println("The factorial of: " + num + " = " + result);


	}

	// Factorial through recursion
	private static int recursiveFunction(int num) {
		if(num == 0) {
			return 1;
		}

		return num * recursiveFunction(num -1);
	}
}
