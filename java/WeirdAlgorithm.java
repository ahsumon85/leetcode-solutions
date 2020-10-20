import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();

		System.out.print(a + " ");
		while (a != 1) {
			if (a % 2 == 0) {
				a = a / 2;
			} else {
				a = a * 3 + 1;
			}
			System.out.print(a + " ");
		}

	}
}
