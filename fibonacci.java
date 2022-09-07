package cen4802;
/**
 * Program to calculate and display a term of the Fibonacci sequence.
 * @author Alisha Hannan
 *
 */
public class fibonacci {

	/**
	 * Returns the nth term in the Fibonacci sequence given an integer. 
	 * @param n	the term in the Fibonacci sequence to calculate
	 * @return	 the value of the selected term in the Fibonacci sequence
	 */
	 static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		return (fibonacci(n - 1) + fibonacci(n - 2));
	}

	public static void main(String[] args) {
		int n = 10;
		int term = fibonacci(n);
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + term + ".");

	}

}
