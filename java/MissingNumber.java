import java.util.Scanner;

public class MissingNumber {
	
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			input[i] = s.nextInt();
		}

		int length = input.length + 1;

		long sumOfNNumbers = sumOfAllNNumbers(length);

		long sumOfInputArray = sumOfInputArrayNumbers(input);

		long missingNumber = sumOfNNumbers - sumOfInputArray;

		System.out.println(missingNumber);
	}

	public static long sumOfAllNNumbers(long n) {
		return n * (n + 1) / 2;
	}

	public static long sumOfInputArrayNumbers(int[] input) {
		long sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}
	
}
