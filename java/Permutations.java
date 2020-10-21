import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n == 1) {
			System.out.print("1\n");
		} else if (n < 4) {
			System.out.print("NO SOLUTION\n");
		} else if (n == 4) {
			System.out.print("3 1 4 2\n");
		} else {
			for (int i = 1; i <= n; i += 2) {
				System.out.print(i);
				System.out.print(" ");
			}
			for (int i = 2; i <= n; i += 2) {
				System.out.print(i);
				if (i < n - 1) {
					System.out.print(" ");
				} else {
					System.out.print("\n");

				}
			}
		}
	}
}
