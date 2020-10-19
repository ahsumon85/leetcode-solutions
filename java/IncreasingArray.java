import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		long sum = 0;
		int a, b;
		a = array[0];
		for (int i = 1; i < array.length; i++) {
			b = array[i];
			if (b < a)
				sum += a - b;
			else
				a = b;
		}
		System.out.println(sum);
	}

}
