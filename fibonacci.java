package cen4802;

public class fibonacci {

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
