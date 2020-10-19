package src.cses;

import java.util.Scanner;

public class Repetitions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		char c = s.charAt(0);
		int m = 1;
		int k = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == c)
				k++;
			else {
				m = Math.max(m, k);
				k = 1;
				c = s.charAt(i);
			}
		}
		System.out.println(Math.max(m, k));
	}

}
